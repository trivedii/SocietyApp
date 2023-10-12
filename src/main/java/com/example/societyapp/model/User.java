package com.example.societyapp.model;



public class User {
    private String name;
    private String password;
    private String userType;
    private String contact;
    private String flatNumber;
    public User(Long userId, String name, String password, String userType, String contact, String flatNumber) {
        this.name = name;
        this.password = password;
        this.userType = userType;
        this.contact = contact;
        this.flatNumber = flatNumber;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }


}
