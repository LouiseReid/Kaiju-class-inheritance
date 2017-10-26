package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 26/10/2017.
 */

public class Game {
    Ui ui = new Ui();
    Tank tank = new Tank ("Tank", 100, 25);
    Chopper chopper = new Chopper ("Chopper", 100, 20);
    Godzilla godzilla = new Godzilla("Godzilla", 100, 25);
    KingKong kingKong = new KingKong("King Kong", 100, 15);

    public String checkDead(){
        if(kingKong.healthValue == 0){
            return kingKong.dead();
        }if(godzilla.healthValue == 0){
            return godzilla.dead();
        }if(chopper.healthValue == 0){
            return chopper.down();
        }if(tank.healthValue == 0){
            return tank.down();
        }
        return "How much more can the city take?!";
    }

    public void firstWave(){
        System.out.println(kingKong.roar());
        kingKong.attack(chopper);
        System.out.println(kingKong.attack());
        System.out.println(chopper.takeDamage());
        System.out.println(godzilla.roar());
        godzilla.attack(tank);
        System.out.println(godzilla.attack());
        System.out.println(tank.takeDamage());
    }

    public void secondWave(){
        chopper.attack(godzilla);
        System.out.println(chopper.attack());
        System.out.println(godzilla.takeDamage());
        tank.attack(godzilla);
        System.out.println(tank.attack());
        System.out.println(godzilla.takeDamage());
    }
}
