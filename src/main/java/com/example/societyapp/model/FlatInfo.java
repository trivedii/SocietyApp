package com.example.societyapp.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class FlatInfo {
    String flatNumber;
    String flatType;
    String carpetArea;

    public FlatInfo( String flatNumber, String flatType, String carpetArea) {
        this.flatNumber = flatNumber;
        this.flatType = flatType;
        this.carpetArea = carpetArea;
    }

    public FlatInfo() {

    }

    public String getFlatNumber() { return flatNumber; }

    public void setFlatNumber(String flatNumber) { this.flatNumber = flatNumber; }

    public String getFlatType() {
        return flatType;
    }

    public void setFlatType(String flatType) {
        this.flatType = flatType;
    }

    public String getCarpetArea() {
        return carpetArea;
    }

    public void setCarpetArea(String carpetArea) {
        this.carpetArea = carpetArea;
    }
}
