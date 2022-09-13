package com.yobitrust.HachCovid19Back.Models.PatientParts.evaluation;

import java.util.ArrayList;
import java.util.List;

public class AssRespList {
    private List<AssRespValue> assRespValues;

    public AssRespList() {
        this.assRespValues= new ArrayList<>();
    }

    public AssRespList(List<AssRespValue> assRespValues) {
        this.assRespValues = assRespValues;
    }

    public List<AssRespValue> getAssRespValues() {
        return assRespValues;
    }

    public void setAssRespValues(List<AssRespValue> assRespValues) {
        this.assRespValues = assRespValues;
    }
}
