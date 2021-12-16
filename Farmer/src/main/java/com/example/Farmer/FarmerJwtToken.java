package com.example.Farmer;

public class FarmerJwtToken {
    private String f_jwtToken;

    public FarmerJwtToken() {
        super();
    }

    public FarmerJwtToken(String f_jwtToken) {
        this.f_jwtToken = f_jwtToken;
    }

    public String getF_jwtToken() {
        return f_jwtToken;
    }

    public void setF_jwtToken(String f_jwtToken) {
        this.f_jwtToken = f_jwtToken;
    }
}
