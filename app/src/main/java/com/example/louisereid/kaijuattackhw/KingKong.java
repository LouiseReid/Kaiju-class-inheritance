package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

public class KingKong extends Kaiju {

    public KingKong(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String roar() {
        attackValue -=5;
        return "OOOH-OOH AHH";
    }

    @Override
    public String attack() {
        attackValue -= 20;
        return "Swings punch";
    }

    @Override
    public String move() {
        attackValue -= 10;
        return "Swings from buildings";
    }

    public void hitByTank(){
        healthValue -= 20;
    }

    public void hitByChopper(){
        healthValue -= 10;
    }


}
