package com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques;

import java.util.Date;

public class Autre extends Symptome {
    private String  autre;
    public Autre(String autre,Date dateD, Date dateF) {
        super(dateD,dateF);
        this.autre=autre;    }

    public Autre() {
        super();
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }
}
