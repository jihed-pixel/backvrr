package com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux;

import java.util.Date;

public class Immunosuppreseur extends AntecedentMedicaux{
    private Double dose;
    private String molecule;
    private Integer duree; //la durée est en nombre de mois
    private Date datePrise;

    public Immunosuppreseur() {
    }

    public Immunosuppreseur(Double dose, String molecule, Integer duree, Date datePrise) {
        this.dose = dose;
        this.molecule = molecule;
        this.duree = duree;
        this.datePrise = datePrise;
    }

    public Double getDose() {
        return dose;
    }

    public void setDose(Double dose) {
        this.dose = dose;
    }

    public String getMolecule() {
        return molecule;
    }

    public void setMolecule(String molecule) {
        this.molecule = molecule;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Date getDatePrise() {
        return datePrise;
    }

    public void setDatePrise(Date datePrise) {
        this.datePrise = datePrise;
    }


}
