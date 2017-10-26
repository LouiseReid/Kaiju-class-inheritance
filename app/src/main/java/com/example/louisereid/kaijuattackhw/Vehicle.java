package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

abstract public class Vehicle implements Attackable, Damageable{

    private String type;
    public int healthValue;
    public int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }


    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String attack(Damageable kaiju){
        kaiju.takeDamage(this.attackValue);
        return null;
    }

    public String takeDamage(int value){
        this.healthValue -= value;
        return null;
    }
}
