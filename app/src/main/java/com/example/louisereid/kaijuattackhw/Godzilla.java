package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

public class Godzilla extends Kaiju {


    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }



    @Override
    public String roar() {
        attackValue -= 5;
        return "ROOOOAAAAAR!";
    }

    @Override
    public String attack() {
        attackValue -= 20;
        return "Swishes tail";
    }

    @Override
    public String move() {
        attackValue -= 10;
        return "Stomps around";
    }

    public void hitByTank(){
        healthValue -= 20;
    }

    public void hitByChopper(){
        healthValue -= 10;
    }
}
