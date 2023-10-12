package com.example.societyapp.pojo;

public class UserQueryResult {

    Long user_id;
    String name;
    String user_type;
    String contact;
    String flat_number;
    String flat_type;
    String carpet_area;

    public UserQueryResult(Long user_id, String name, String user_type, String contact, String flat_number, String flat_type, String carpet_area) {
        this.user_id = user_id;
        this.name = name;
        this.user_type = user_type;
        this.contact = contact;
        this.flat_number = flat_number;
        this.flat_type = flat_type;
        this.carpet_area = carpet_area;
    }

    public UserQueryResult() {
    }


    public Long getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getUser_type() {
        return user_type;
    }

    public String getContact() {
        return contact;
    }

    public String getFlat_number() {
        return flat_number;
    }

    public String getFlat_type() {
        return flat_type;
    }

    public String getCarpet_area() {
        return carpet_area;
    }
}
