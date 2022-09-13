package com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques;

import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracCliniques;

import java.util.Date;

public class Fievre extends Symptome {
    private Double temperature;


    public Fievre() {
        super();
    }

    public Fievre(Double temperature, Date dateD, Date dateF) {
        super(dateD,dateF);
        this.temperature = temperature;

    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }


}
