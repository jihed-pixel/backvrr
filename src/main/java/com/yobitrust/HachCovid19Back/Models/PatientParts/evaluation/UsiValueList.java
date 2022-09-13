package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.ArrayList;
import java.util.List;

public class UsiValueList {
    private List<USIValue> usiValues;

    public UsiValueList() {
        this.usiValues= new ArrayList<>();
    }

    public UsiValueList(List<USIValue> usiValues) {
        this.usiValues = usiValues;
    }

    public List<USIValue> getUsiValues() {
        return usiValues;
    }

    public void setUsiValues(List<USIValue> usiValues) {
        this.usiValues = usiValues;
    }
}
