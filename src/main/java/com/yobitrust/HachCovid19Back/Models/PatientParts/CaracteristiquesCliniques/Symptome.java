package com.yobitrust.HachCovid19Back.Models.PatientParts.CaracteristiquesCliniques;

import java.util.Date;

public class Symptome {
    private Date dateD;
    private Date dateF;

    public Symptome() {
    }

    public Symptome(Date dateD, Date dateF) {
        this.dateD = dateD;
        this.dateF = dateF;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }
}
