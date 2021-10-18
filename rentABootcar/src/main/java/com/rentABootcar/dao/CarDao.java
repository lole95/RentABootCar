package com.rentABootcar.dao;

import com.rentABootcar.connection.DatabaseConnection;
import com.rentABootcar.model.SearchCarModel;
import com.rentABootcar.model.request.car.AddCarRequestModel;
import com.rentABootcar.model.request.car.ChangeCarInfoRequestModel;
import com.rentABootcar.model.response.car.GetCarResponseModel;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

/**
 * Project rentABootcar, Package com.rentABootcar.dao, Class CarDao, Created by Milovan 10.10.2021.
 */
public interface CarDao {
    Connection conn = DatabaseConnection.getConnection();
    List<GetCarResponseModel> getAllCars();
    List<GetCarResponseModel> searchCars(SearchCarModel searchCarModel, List<GetCarResponseModel> cars);
    List<GetCarResponseModel> getAvailableCars(LocalDate startDate, LocalDate endDate);
    boolean isCarAvailable(LocalDate startDate, LocalDate endDate, String carId);
    GetCarResponseModel getCar(String id);
    void updateCarInfo(String id, ChangeCarInfoRequestModel carInfo);
    void delete(String id);
    void addCar(AddCarRequestModel car);
    double getPrice(String id);


}
