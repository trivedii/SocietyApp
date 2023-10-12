package com.example.societyapp.service;

import com.example.societyapp.exception.NotFoundException;
import com.example.societyapp.model.User;
import com.example.societyapp.pojo.UserQueryResult;
import com.example.societyapp.repository.MyBatisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    MyBatisRepository myBatisRepository;
    public UserService(MyBatisRepository myBatisRepository) {
        this.myBatisRepository = myBatisRepository;
    }
    public void createUser(User user){
        myBatisRepository.insertUser(user);
    }
    public UserQueryResult getUser(Long userId){
        if(myBatisRepository.getDetailsById(userId)== null){
            throw new NotFoundException("Requested user does not Exist!");
        }
        return myBatisRepository.getDetailsById(userId);
    }
    public List<UserQueryResult> getFlatUsers(String flatNumber){
        if(!myBatisRepository.flatExists(flatNumber)){
            throw new NotFoundException("Flat Not Found!");
        }
        if(myBatisRepository.findFlatUsers(flatNumber).isEmpty()){
            throw new NotFoundException("Flat does not have any residents!");
        }
        return myBatisRepository.findFlatUsers(flatNumber);
    }
}
