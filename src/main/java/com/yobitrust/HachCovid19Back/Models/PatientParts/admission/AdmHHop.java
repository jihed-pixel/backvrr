package com.yobitrust.HachCovid19Back.Models.PatientParts.admission;

import com.yobitrust.HachCovid19Back.Models.PatientParts.Admission;

import java.util.Date;

public class AdmHHop extends Admission {
    private Date dateEnt;
    private String lieu;

    public AdmHHop() {
    }

    public AdmHHop(Date dateEnt, String lieu) {
        this.dateEnt = dateEnt;
        this.lieu = lieu;
    }

    public Date getDateEnt() {
        return dateEnt;
    }

    public void setDateEnt(Date dateEnt) {
        this.dateEnt = dateEnt;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
