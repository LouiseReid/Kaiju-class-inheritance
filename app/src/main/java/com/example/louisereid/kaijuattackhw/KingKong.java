package com.example.louisereid.kaijuattackhw;

import static android.R.attr.value;

/**
 * Created by louisereid on 25/10/2017.
 */

public class KingKong extends Kaiju {

    public KingKong(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        return "OOOH-OOH AHH";
    }


    public String attack() {
        return "King Kong swings punch";
    }

    @Override
    public String move() {
        return "King Kong swings from buildings";
    }

    public String takeDamage(){
        this.healthValue -= value;
        return "WAAAHHH";
    }

    public String dead(){
        return "King Kong has been eliminated!";

    }




}
