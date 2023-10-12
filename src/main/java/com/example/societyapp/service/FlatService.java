package com.example.societyapp.service;

import com.example.societyapp.model.FlatInfo;
import com.example.societyapp.repository.MyBatisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlatService {
    MyBatisRepository myBatisRepository;

    public FlatService(MyBatisRepository myBatisRepository) {
        this.myBatisRepository = myBatisRepository;
    }
    public void uploadFlatDetails(FlatInfo flatInfo){
        myBatisRepository.insertFlat(flatInfo);
    }

}
