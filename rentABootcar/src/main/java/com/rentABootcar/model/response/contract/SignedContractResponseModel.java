package com.rentABootcar.model.response.contract;

/**
 * Project rentABootcar, Package com.rentABootcar.model.response, Class SignedContractResponseModel, Created by Milovan 12.10.2021.
 */
public class SignedContractResponseModel {
    private boolean successful;
    private String info;

    public SignedContractResponseModel(boolean successful, String info) {
        this.successful = successful;
        this.info = info;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getInfo() {
        return info;
    }
}

