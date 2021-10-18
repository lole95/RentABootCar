package com.rentABootcar.controller;

import com.rentABootcar.dao.*;
import com.rentABootcar.model.SearchCarModel;
import com.rentABootcar.model.request.car.AddCarRequestModel;
import com.rentABootcar.model.request.car.ChangeCarInfoRequestModel;
import com.rentABootcar.model.response.car.GetCarResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

/**
 * Project rentABootcar, Package com.rentABootcar.controller, Class CarController, Created by Milovan 10.10.2021.
 */
@RestController
// GOTOV 99% (PROVERA KOD UPDATA KAO I U USERU SAMO DUZA XD)
public class CarController {
    private CarDao carDao = new CarDaoSQL();
    private UserDao userDao = new UserDaoSQL();
    private ContractDao contractDao = new ContractDaoSQL();

    @GetMapping("/cars")
    public List<GetCarResponseModel> getAllCars(){
        return carDao.getAllCars();
    }

    @GetMapping("/cars/search")
    public List<GetCarResponseModel> searchCars(@RequestParam(required = false) String make,
                                                @RequestParam(required = false) String model,
                                                @RequestParam(required = false) Integer year,
                                                @RequestParam(required = false) Boolean automatic,
                                                @RequestParam(required = false) Double price,
                                                @RequestParam(required = false) Integer power,
                                                @RequestParam(required = false) Integer doors){
        return carDao.searchCars(new SearchCarModel(make, model, year, power, doors, price, automatic),
                carDao.getAllCars());
    }

    @GetMapping("/cars/{carId}")
    public GetCarResponseModel getCar(@PathVariable("carId") String id){
        return carDao.getCar(id);
    }

    @PatchMapping("/cars/{carId}")
    public void updateCar(@PathVariable("carId") String carId,
                          @RequestHeader("authorization") String adminId,
                          @RequestBody ChangeCarInfoRequestModel carInfo){
        if (!userDao.isAdmin(adminId)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
        }
        carDao.updateCarInfo(carId, carInfo);
    }

    @DeleteMapping("/cars/{carId}")
    public void deleteCar(@PathVariable("carId") String carId,
                          @RequestHeader("authorization") String adminId){
        if (!userDao.isAdmin(adminId))
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
        carDao.delete(carId);
    }

    @PostMapping("/cars")
    public void addCar(@RequestHeader("authorization") String adminId,
                       @RequestBody AddCarRequestModel car){
        if (!userDao.isAdmin(adminId)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);

        }
        carDao.addCar(car);
    }

    @GetMapping("/cars/available")
    public List<GetCarResponseModel> availableCars(@RequestParam String startDate,
                                                   @RequestParam String endDate){
        LocalDate startDateLocal = LocalDate.parse(startDate);
        LocalDate endDateLocal = LocalDate.parse(endDate);
        return carDao.getAvailableCars(startDateLocal, endDateLocal);
    }

    @GetMapping("/cars/available/search")
    public List<GetCarResponseModel> searchCars(@RequestParam String startDate,
                                                @RequestParam String endDate,
                                                @RequestParam(required = false) String make,
                                                @RequestParam(required = false) String model,
                                                @RequestParam(required = false) Integer year,
                                                @RequestParam(required = false) Boolean automatic,
                                                @RequestParam(required = false) Double price,
                                                @RequestParam(required = false) Integer power,
                                                @RequestParam(required = false) Integer doors){
        LocalDate startDateLocal = LocalDate.parse(startDate);
        LocalDate endDateLocal = LocalDate.parse(endDate);
        return carDao.searchCars(new SearchCarModel(make, model, year, power, doors, price, automatic),
                carDao.getAvailableCars(startDateLocal, endDateLocal));

    }

    @GetMapping("/cars/{carId}/calendar")
    public List<LocalDate> getCarOccupied(@PathVariable("carId") String id){
        return contractDao.getCarOccupiedDates(id);
    }











}

