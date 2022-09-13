package com.yobitrust.HachCovid19Back.Models.PatientParts.ExpoRisque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parcours {
    private String moyenTranQu;
    private String villesPar;
    private Date dateV1;
    private String moyenTranV1;
    private Date dateV2;
    private String moyenTranV2;

    public Parcours() {
    }

    public Parcours(String moyenTranQu, String villesPar, Date dateV1, String moyenTranV1, Date dateV2, String moyenTranV2) {
        this.moyenTranQu = moyenTranQu;
        this.villesPar = villesPar;
        this.dateV1 = dateV1;
        this.moyenTranV1 = moyenTranV1;
        this.dateV2 = dateV2;
        this.moyenTranV2 = moyenTranV2;
    }

    public String getMoyenTranQu() {
        return moyenTranQu;
    }

    public void setMoyenTranQu(String moyenTranQu) {
        this.moyenTranQu = moyenTranQu;
    }

    public String getVillesPar() {
        return villesPar;
    }

    public void setVillesPar(String villesPar) {
        this.villesPar = villesPar;
    }

    public Date getDateV1() {
        return dateV1;
    }

    public void setDateV1(Date dateV1) {
        this.dateV1 = dateV1;
    }

    public String getMoyenTranV1() {
        return moyenTranV1;
    }

    public void setMoyenTranV1(String moyenTranV1) {
        this.moyenTranV1 = moyenTranV1;
    }

    public Date getDateV2() {
        return dateV2;
    }

    public void setDateV2(Date dateV2) {
        this.dateV2 = dateV2;
    }

    public String getMoyenTranV2() {
        return moyenTranV2;
    }

    public void setMoyenTranV2(String moyenTranV2) {
        this.moyenTranV2 = moyenTranV2;
    }
}
