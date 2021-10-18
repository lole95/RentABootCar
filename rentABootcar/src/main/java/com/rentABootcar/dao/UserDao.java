package com.rentABootcar.dao;

import com.rentABootcar.connection.DatabaseConnection;
import com.rentABootcar.model.AdminUpdateUserModel;
import com.rentABootcar.model.RegisterUserModel;
import com.rentABootcar.model.UpdateUserModel;
import com.rentABootcar.model.response.user.GetUserResponseModel;
import java.sql.Connection;
import java.util.List;

/**
 * Project rentABootcar, Package com.rentABootcar.dao, Class UserDao, Created by Milovan 10.10.2021.
 */
public interface UserDao {
    Connection conn = DatabaseConnection.getConnection();
    boolean userNameExists(String username);
    boolean emailExists(String email);
    String getIdWithIdentification(String identification);
    String getPasswordWithIdentification(String identification);
    String getPasswordWithUUID(String id);
    GetUserResponseModel getUser(String id);
    boolean isAdmin(String id);
    List<GetUserResponseModel> getAllUsers();
    void registerUser(RegisterUserModel user);
    void updateUser(UpdateUserModel user, String id);
    void adminUpdateUserInfo(AdminUpdateUserModel user, String id);


}

