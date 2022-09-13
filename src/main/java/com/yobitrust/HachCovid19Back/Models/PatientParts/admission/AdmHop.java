package com.yobitrust.HachCovid19Back.Models.PatientParts.admission;

import com.yobitrust.HachCovid19Back.Models.PatientParts.Admission;

import java.util.Date;

public class AdmHop  extends Admission {
    private String hopital;
    private String service;
    private String mode;
    private Date dateEnt;

    public AdmHop() {
    }

    public AdmHop(String hopital, String service, String mode, Date dateEnt) {
        this.hopital = hopital;
        this.service = service;
        this.mode = mode;
        this.dateEnt = dateEnt;
    }

    public String getHopital() {
        return hopital;
    }

    public void setHopital(String hopital) {
        this.hopital = hopital;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getDateEnt() {
        return dateEnt;
    }

    public void setDateEnt(Date dateEnt) {
        this.dateEnt = dateEnt;
    }
}
