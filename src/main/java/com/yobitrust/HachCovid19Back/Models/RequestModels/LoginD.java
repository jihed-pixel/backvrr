package com.yobitrust.HachCovid19Back.Models.RequestModels;

public class LoginD {
        private Integer cin;
        private String cinD;

        public LoginD() {
        }

    public LoginD(Integer cin, String cinD) {
        this.cin = cin;
        this.cinD = cinD;
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public String getCinD() {
        return cinD;
    }

    public void setCinD(String cinD) {
        this.cinD = cinD;
    }
}

