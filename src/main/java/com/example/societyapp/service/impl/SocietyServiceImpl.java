package com.example.societyapp.service.impl;

import com.example.societyapp.exception.NotFoundException;
import com.example.societyapp.model.FlatInfo;
import com.example.societyapp.model.User;
import com.example.societyapp.pojo.UserQueryResult;
import com.example.societyapp.repository.MyBatisRepository;
import com.example.societyapp.service.SocietyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocietyServiceImpl implements SocietyService {
    MyBatisRepository myBatisRepository;
    public SocietyServiceImpl(MyBatisRepository myBatisRepository) {
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
    public void uploadFlatDetails(FlatInfo flatInfo){
        myBatisRepository.insertFlat(flatInfo);
    }
}
