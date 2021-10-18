package com.rentABootcar.model.response.user;

/**
 * Project rentABootcar, Package com.rentABootcar.model.response, Class ChangeUserInfoResponseModel, Created by Milovan 10.10.2021.
 */
public class ChangeUserInfoResponseModel {
    private boolean successful;
    private String info;

    public ChangeUserInfoResponseModel(boolean successful, String info) {
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

