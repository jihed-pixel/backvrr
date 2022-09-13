package com.yobitrust.HachCovid19Back.Models.RequestModels;

public class RemoveAntecedent {
    private String antecedent;
    public RemoveAntecedent() {

    }

    public RemoveAntecedent(String antecedent) {
        this.antecedent = antecedent;
    }

    public String getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(String antecedent) {
        this.antecedent = antecedent;
    }
}
