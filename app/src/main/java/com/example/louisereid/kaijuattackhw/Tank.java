package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

public class Tank extends Vehicle implements Attackable {
    public Tank(String type, int healthValue) {
        super(type, healthValue);
    }

    public int checkHealthValue(){
        return healthValue;
    }

    public String hitByKingKong(){
        healthValue -= 20;
        return "WARNING Kong has hit us";
    }

    public String hitByGodzilla(){
        healthValue -= 10;
        return "WARNING Godzilla has hit us";
    }


    @Override
    public String attack() {
        return "Guns firing!";
    }


}
