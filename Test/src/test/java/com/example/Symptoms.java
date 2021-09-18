package com.example;

import java.util.List;

public class Symptoms {
    private List<String> symptoms;
    private boolean travelHistory;
    private boolean contactWithCovidPatient;
    public Symptoms(List<String> symptoms, boolean travelHistory, boolean contactWithCovidPatient){
        this.symptoms=symptoms;
        this.travelHistory=travelHistory;
        this.contactWithCovidPatient=contactWithCovidPatient;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }


    public boolean getTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public boolean getContactWithCovidPatient() {
        return contactWithCovidPatient;
    }

    public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
        this.contactWithCovidPatient = contactWithCovidPatient;
    }
}
