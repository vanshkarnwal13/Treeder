package com.brocode.carbon_footprint_app.models;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

public class Tree {

    private String name;
    private int cost;
    private int age;
    private String type;
    private LatLng location;

    public Tree(String name, int cost, int age, String type, LatLng location) {
        this.name = name;
        this.cost = cost;
        this.age = age;
        this.type = type;
        this.location=location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }
}
