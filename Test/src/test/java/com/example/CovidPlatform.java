package com.example;


public class CovidPlatform {
    private static CovidPlatform instance=null;
    private CovidPlatform(){

    }
    public static CovidPlatform getInstance(){
        if(instance==null){
            return new CovidPlatform();
        }
        return instance;
    }

    public int riskCalculation(Symptoms symptoms){
        if(symptoms.getContactWithCovidPatient() ||symptoms.getTravelHistory()){
            if(symptoms.getSymptoms().size()>2 ){
                return 95;
            }else if(symptoms.getSymptoms().size()>1){
                return 75;
            }else if(symptoms.getSymptoms().size()>0){
                return 50;
            }
        }
        return 5;
    }

}
