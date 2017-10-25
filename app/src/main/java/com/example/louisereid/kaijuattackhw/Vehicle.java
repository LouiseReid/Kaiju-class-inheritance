package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

abstract public class Vehicle {

    String type;
    int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }
}
