package com.brocode.carbon_footprint_app.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("co2_per_serving")
    @Expose
    private Double co2PerServing;
    @SerializedName("co2_per_gram")
    @Expose
    private Double co2PerGram;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCo2PerServing() {
        return co2PerServing;
    }

    public void setCo2PerServing(Double co2PerServing) {
        this.co2PerServing = co2PerServing;
    }

    public Double getCo2PerGram() {
        return co2PerGram;
    }

    public void setCo2PerGram(Double co2PerGram) {
        this.co2PerGram = co2PerGram;
    }

}