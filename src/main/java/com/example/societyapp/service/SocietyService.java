package com.example.societyapp.service;

import com.example.societyapp.model.FlatInfo;
import com.example.societyapp.model.User;
import com.example.societyapp.pojo.UserQueryResult;

import java.util.List;

public interface SocietyService {
    public void createUser(User user);
    public UserQueryResult getUser(Long userId);
    public void uploadFlatDetails(FlatInfo flatInfo);
    List<UserQueryResult> getFlatUsers(String flatNumber);
}
