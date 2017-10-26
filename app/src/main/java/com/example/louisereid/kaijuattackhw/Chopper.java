package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

public class Chopper extends Vehicle {
    public Chopper(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }


    public String attack() {
        return "Machine guns fired!";
    }

    public String takeDamage() {
        return "Chopper hit! Chopper hit!";
    }

    public String down(){
        return "Black Hawk down, we have a Black Hawk down!";

    }
}
