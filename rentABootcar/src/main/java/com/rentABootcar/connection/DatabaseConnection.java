package com.rentABootcar.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project rentABootcar, Package com.rentABootcar.connection, Class DatabaseConnection, Created by Milovan 10.10.2021.
 */
public class DatabaseConnection {
    private static Connection conn = null;

    static{
        String url = "jdbc:postgresql://localhost:5432/rent_a_bootcar?user=postgres&password=sqlroot";
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }
}

