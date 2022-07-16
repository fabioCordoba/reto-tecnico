package com.training.retotecnico.domain;

public class Spercraft {

    private int spercraftId;
    private String name;
    private String activity;
    private String country;
    private String fuel;
    private String power;

    public int getSpercraftId() {
        return spercraftId;
    }

    public void setSpercraftId(int spercraftId) {
        this.spercraftId = spercraftId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
