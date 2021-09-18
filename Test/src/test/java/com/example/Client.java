package com.example;

import com.example.repository.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Repository repo=Repository.getInstance();
        CovidPlatform covidPlatform=CovidPlatform.getInstance();
        Symptoms symptom1=new Symptoms(new ArrayList<String>(),false,false);
        System.out.println("Register yourself: Enter your name, mobile, pincode");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String mobile=sc.next();
        int pin=Integer.parseInt(sc.next());
        User user=new User(name,mobile,pin,false);
        repo.addUser(user);
        System.out.println("Enter your symptoms (comma separated)");
        String sym=sc.next();
        List<String> symptoms= List.of(sym.split(","));
        symptom1.setSymptoms(symptoms);
        System.out.println("Any travel history in past 15 days: yes/no");
        String travelHistory=sc.next();
        if(travelHistory.equals("yes")){
            symptom1.setTravelHistory(true);
        }else{
            symptom1.setTravelHistory(false);
        }
        System.out.println("Have you contacted any covid patient");
        String contactWithPatient=sc.next();
        if(contactWithPatient.equals("yes")){
            symptom1.setContactWithCovidPatient(true);
        }else{
            symptom1.setContactWithCovidPatient(false);
        }

        int result=covidPlatform.riskCalculation(symptom1);
        System.out.println("Your Risk: "+ result+"%");
    }
}
