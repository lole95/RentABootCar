package com.rentABootcar.dao;

import com.rentABootcar.connection.DatabaseConnection;
import com.rentABootcar.model.request.contract.SignedContractRequestModel;
import com.rentABootcar.model.response.contract.ContractResponseModel;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

/**
 * Project rentABootcar, Package com.rentABootcar.dao, Class ContractDao, Created by Milovan 11.10.2021.
 */
public interface ContractDao {
    Connection conn = DatabaseConnection.getConnection();
    List<LocalDate> getCarOccupiedDates(String carId);
    List<ContractResponseModel> getAllContracts();
    List<ContractResponseModel> getAllPendingContracts();
    List<ContractResponseModel> getContractHistory(String userId);
    void deleteContract(String contractId);
    void updateContractApproval(String contractId, Boolean approval);
    boolean userHasPendingContract(String userId);
    void addContractToDB(SignedContractRequestModel contract);



}
