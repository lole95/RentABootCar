package com.rentABootcar.model.response.user;

/**
 * Project rentABootcar, Package com.rentABootcar.model.response, Class GetUserResponseModel, Created by Milovan 10.10.2021.
 */
public class GetUserResponseModel {

    private String username, email, firstName, lastName, phoneNumber, personalNumber, image;

    public GetUserResponseModel(String username, String email, String firstName,
                                String lastName, String phoneNumber, String personalNumber, String image) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.personalNumber = personalNumber;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "GetUserResponseModel{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

