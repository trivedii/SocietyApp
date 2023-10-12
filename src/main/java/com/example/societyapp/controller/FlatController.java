package com.example.societyapp.controller;

import com.example.societyapp.model.FlatInfo;
import com.example.societyapp.service.FlatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flatinfo")
public class FlatController {
    FlatService flatService;

    public FlatController(FlatService flatService) {
        this.flatService = flatService;
    }

    @PostMapping
    public String updateFlatDetail(@RequestBody FlatInfo flatInfo){
        flatService.uploadFlatDetails(flatInfo);
        return "Successfully uploaded flat details";
    }

}
