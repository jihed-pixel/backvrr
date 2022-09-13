package com.yobitrust.HachCovid19Back.Models.PatientParts;

public class HabitudesDeVie {
    private Double poids;
    private  Integer taille;
    private Integer gs;
    private Boolean alcool;
    private Boolean drogue;
    private Integer nbCigarettes;
    private Integer freqChicha;

    public HabitudesDeVie() {
    }

    public HabitudesDeVie(Double poids, Integer taille, Integer gs, Boolean alcool, Boolean drogue, Integer nbCigarettes, Integer freqChicha) {
        this.poids = poids;
        this.taille = taille;
        this.gs = gs;
        this.alcool = alcool;
        this.drogue = drogue;
        this.nbCigarettes = nbCigarettes;
        this.freqChicha = freqChicha;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public Integer getGs() {
        return gs;
    }

    public void setGs(Integer gs) {
        this.gs = gs;
    }

    public Boolean getAlcool() {
        return alcool;
    }

    public void setAlcool(Boolean alcool) {
        this.alcool = alcool;
    }

    public Boolean getDrogue() {
        return drogue;
    }

    public void setDrogue(Boolean drogue) {
        this.drogue = drogue;
    }

    public Integer getNbCigarettes() {
        return nbCigarettes;
    }

    public void setNbCigarettes(Integer nbCigarettes) {
        this.nbCigarettes = nbCigarettes;
    }

    public Integer getFreqChicha() {
        return freqChicha;
    }

    public void setFreqChicha(Integer freqChicha) {
        this.freqChicha = freqChicha;
    }
}
