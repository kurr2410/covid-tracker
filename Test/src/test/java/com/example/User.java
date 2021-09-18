package com.example;

public class User {
    private String name;
    private String mobile;
    private int pincode;
    private boolean covidPositive;
    public User(String name ,String mobile,int pincode,boolean covidPositive){
        this.name=name;
        this.mobile=mobile;
        this.pincode=pincode;
        this.covidPositive=covidPositive;
    }
}
