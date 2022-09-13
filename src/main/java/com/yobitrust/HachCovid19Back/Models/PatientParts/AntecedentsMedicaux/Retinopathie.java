package com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux;

public class Retinopathie extends AntecedentMedicaux {
    private Double anciennete;
    private String traitement;

    public Retinopathie() {
    }

    public Retinopathie(Double anciennete, String traitement) {
        this.anciennete = anciennete;
        this.traitement = traitement;
    }

    public Double getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(Double anciennete) {
        this.anciennete = anciennete;
    }

    public String getTraitement() {
        return traitement;
    }

    public void setTraitement(String traitement) {
        this.traitement = traitement;
    }
}
