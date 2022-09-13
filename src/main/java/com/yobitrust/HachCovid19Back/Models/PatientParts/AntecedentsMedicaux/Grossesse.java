package com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux;

public class Grossesse extends AntecedentMedicaux{
    private Boolean simple;
    private Boolean gpa;
    private  Boolean sa;
    private  String pathologie;

    public Grossesse() {
    }

    public Grossesse(Boolean simple, Boolean gpa, Boolean sa, String pathologie) {
        this.simple = simple;
        this.gpa = gpa;
        this.sa = sa;
        this.pathologie = pathologie;
    }

    public Boolean getSimple() {
        return simple;
    }

    public void setSimple(Boolean simple) {
        this.simple = simple;
    }

    public Boolean getGpa() {
        return gpa;
    }

    public void setGpa(Boolean gpa) {
        this.gpa = gpa;
    }

    public Boolean getSa() {
        return sa;
    }

    public void setSa(Boolean sa) {
        this.sa = sa;
    }

    public String getPathologie() {
        return pathologie;
    }

    public void setPathologie(String pathologie) {
        this.pathologie = pathologie;
    }
}
