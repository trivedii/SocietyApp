package com.example.societyapp.controller;
import com.example.societyapp.model.User;
import com.example.societyapp.pojo.UserQueryResult;
import com.example.societyapp.response.ResponseHandler;
import com.example.societyapp.service.SocietyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserController {
    SocietyService societyService;
    public UserController(SocietyService societyService) {
        this.societyService = societyService;
    }

    @GetMapping("{userId}")
    public ResponseEntity<Object> getUserDetails(@PathVariable("userId") Long userId){
        return ResponseHandler.responseBuilder("Requested vendor details are given here",
                HttpStatus.OK, societyService.getUser(userId));
    }
    @PostMapping
    public String createUserDetails(@RequestBody User user){
        societyService.createUser(user);
        return "Success uploaded user details";
    }
    @GetMapping("/flat/{flat_number}")
    public List<UserQueryResult> getFlatUsers(@PathVariable("flat_number") String flat_number){
        return societyService.getFlatUsers(flat_number);
    }
}
