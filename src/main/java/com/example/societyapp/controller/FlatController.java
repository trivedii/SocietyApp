package com.example.societyapp.controller;

import com.example.societyapp.model.FlatInfo;
import com.example.societyapp.service.SocietyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flatinfo")
public class FlatController {
    SocietyService societyService;

    public FlatController(SocietyService societyService) {
        this.societyService = societyService;
    }

    @PostMapping
    public String updateFlatDetail(@RequestBody FlatInfo flatInfo){
        societyService.uploadFlatDetails(flatInfo);
        return "Successfully uploaded flat details";
    }
}
