package com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques;

import com.yobitrust.HachCovid19Back.Models.PatientParts.CaracCliniques;

import java.util.Date;

public class Diarrhee  extends Symptome {

    private Integer selle;

    public Diarrhee(Date dateD, Date dateF, Integer selle) {
        super(dateD,dateF);
        this.selle = selle;
    }

    public Diarrhee() {
        super();
    }



    public Integer getSelle() {
        return selle;
    }

    public void setSelle(Integer selle) {
        this.selle = selle;
    }
}
