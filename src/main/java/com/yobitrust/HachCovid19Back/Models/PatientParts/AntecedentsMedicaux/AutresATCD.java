package com.yobitrust.HachCovid19Back.Models.PatientParts.AntecedentsMedicaux;

import java.util.ArrayList;
import java.util.List;


public class AutresATCD extends AntecedentMedicaux{
    private List<String> autres;
    public AutresATCD() {
        this.autres= new ArrayList<String>();
    }

    public List<String> getAutres() {
        return autres;
    }

    public void setAutres(List<String> autres) {
        this.autres = autres;
    }

}
