package com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques;

import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracCliniques;

import java.util.Date;

public class Toux  extends Symptome {
    private String typeT;

    public Toux() {
        //this.typeT = typeT;
    }

    public Toux(Date dateD, Date dateF, String typeT) {
        super(dateD, dateF);
        this.typeT = typeT;
    }

    public String getTypeT() {
        return typeT;
    }

    public void setTypeT(String typeT) {
        this.typeT = typeT;
    }
}
