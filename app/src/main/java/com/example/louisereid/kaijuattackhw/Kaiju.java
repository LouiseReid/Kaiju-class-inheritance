package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

abstract public class Kaiju implements Attackable, Damageable {

    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    abstract public String roar();

    public String attack(Damageable victim){
        victim.takeDamage(this.attackValue);
        return null;
    }

    public String takeDamage(int value){
        this.healthValue -= value;
        return null;
    }

    abstract public String move();

}
