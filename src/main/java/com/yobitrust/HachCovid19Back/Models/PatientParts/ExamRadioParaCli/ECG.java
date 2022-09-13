package com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli;

import java.util.Date;

public class ECG {
    private Date datepr;
    private String result;
    private String espaceQT;

    public ECG(Date datepr, String result, String espaceQT) {
        this.datepr = datepr;
        this.result = result;
        this.espaceQT = espaceQT;
    }

    public ECG() {
    }

    public Date getDatepr() {
        return datepr;
    }

    public void setDatepr(Date datepr) {
        this.datepr = datepr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getEspaceQT() {
        return espaceQT;
    }

    public void setEspaceQT(String espaceQT) {
        this.espaceQT = espaceQT;
    }
}
