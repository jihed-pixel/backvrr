package com.yobitrust.HachCovid19Back.Models.PatientParts;

import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques.Symptome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CaracCliniques {
    private  Boolean sym;
    private HashMap<String ,Symptome> symptomes;

    public CaracCliniques(Boolean sym, HashMap<String,Symptome> symptomes) {
        this.sym = sym;
        this.symptomes = symptomes;
    }

    public CaracCliniques() {
        this.symptomes=new HashMap<String, Symptome>();
    }

    public Boolean getSym() {
        return sym;
    }

    public void setSym(Boolean sym) {
        this.sym = sym;
        if(sym ==false){
            this.setSymptomes(new HashMap<String,Symptome>());
        }
    }

    public HashMap<String,Symptome> getSymptomes() {
        return symptomes;
    }

    public void setSymptomes(HashMap<String,Symptome> symptomes) {
        this.symptomes = symptomes;
    }
}
