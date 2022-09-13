package com.yobitrust.HachCovid19Back.Models.PatientParts.ExamRadioParaCli;

import java.util.Date;

public class Thorax {
    private Date datePr;
    private String result;
    private Integer nbQua;

    public Thorax() {
    }

    public Thorax(Date datePr, String result, Integer nbQua) {
        this.datePr = datePr;
        this.result = result;
        this.nbQua = nbQua;
    }

    public Date getDatePr() {
        return datePr;
    }

    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getNbQua() {
        return nbQua;
    }

    public void setNbQua(Integer nbQua) {
        this.nbQua = nbQua;
    }
}
