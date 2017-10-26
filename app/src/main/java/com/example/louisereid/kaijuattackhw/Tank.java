package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

public class Tank extends Vehicle {


    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }


    public String attack() {
        return "Guns firing!";
    }

    public String takeDamage(){
        return "Tank has been hit!";
    }

    public String down(){
        return "Tank is no more";

    }

}
