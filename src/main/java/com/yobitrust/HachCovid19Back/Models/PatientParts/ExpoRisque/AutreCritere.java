package com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque;

public class AutreCritere {
    private String autre;
    private String details;

    public AutreCritere() {
    }

    public AutreCritere(String autre, String details) {
        this.autre = autre;
        this.details = details;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
