package com.example.louisereid.kaijuattackhw;

import static android.R.attr.value;

/**
 * Created by louisereid on 25/10/2017.
 */

public class Godzilla extends Kaiju {


    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }


    @Override
    public String roar() {
        return "ROOOOAAAAAR!";
    }

    public String attack() {
        return "Godzilla swishes tail";
    }

    @Override
    public String move() {
        return "Godzilla stomps around";
    }



    public String takeDamage(){
        this.healthValue -= value;
        return "GRAAAAHH!";
    }

    public String dead(){
        return "Godzilla has been eliminated!";

    }
}
