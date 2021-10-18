package com.rentABootcar.model.response.admin;

/**
 * Project rentABootcar, Package com.rentABootcar.model.response.admin, Class AdminChangeUserInfoResponseModel, Created by Milovan 12.10.2021.
 */
public class AdminChangeUserInfoResponseModel {
    private boolean successful;
    private String info;

    public AdminChangeUserInfoResponseModel(boolean successful, String info) {
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

