package com.rentABootcar.model.request.contract;

import java.time.LocalDate;

/**
 * Project rentABootcar, Package com.rentABootcar.model.request, Class ContractSampleRequestModel, Created by Milovan 11.10.2021.
 */
public class ContractSampleRequestModel {
    private String userId, carId;
    private LocalDate startDate, endDate;

    public ContractSampleRequestModel(String userId, String carId, LocalDate startDate, LocalDate endDate) {
        this.userId = userId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
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
}

