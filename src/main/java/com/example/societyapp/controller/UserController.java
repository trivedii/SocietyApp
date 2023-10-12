package com.example.societyapp.controller;

import com.example.societyapp.model.User;
import com.example.societyapp.pojo.UserQueryResult;
import com.example.societyapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserController {
    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{userId}")
    public UserQueryResult getUserDetails(@PathVariable("userId") Long userId){
        return userService.getUser(userId);
    }
    @PostMapping
    public String createUserDetails(@RequestBody User user){
        userService.createUser(user);
        return "Success uploaded user details";
    }
    @GetMapping("/flat/{flat_number}")
    public List<UserQueryResult> getFlatUsers(@PathVariable("flat_number") String flat_number){
        return userService.getFlatUsers(flat_number);
    }
}
