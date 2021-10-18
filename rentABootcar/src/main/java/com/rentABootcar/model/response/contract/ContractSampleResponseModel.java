package com.rentABootcar.model.response.contract;

import java.time.LocalDate;

/**
 * Project rentABootcar, Package com.rentABootcar.model.response, Class ContractSampleResponseModel, Created by Milovan 11.10.2021.
 */
public class ContractSampleResponseModel {

    private String userId, carId;
    private LocalDate startDate, endDate;
    private double totalPrice;
    private boolean signed;

    public ContractSampleResponseModel(String userId, String carId, LocalDate startDate,
                                       LocalDate endDate, double totalPrice, boolean signed) {
        this.userId = userId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
        this.signed = signed;
    }

    public String getUserId() {
        return userId;
    }

    public String getCarId() {
        return carId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isSigned() {
        return signed;
    }
}

