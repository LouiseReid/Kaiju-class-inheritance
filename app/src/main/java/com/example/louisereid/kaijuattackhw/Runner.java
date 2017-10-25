package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 25/10/2017.
 */

public class Runner {

    Tank tank;
    Chopper chopper;
    KingKong kingKong;
    Godzilla godzilla;

    public Runner(Tank tank, Chopper chopper, KingKong kingKong, Godzilla godzilla) {
        this.tank = tank;
        this.chopper = chopper;
        this.kingKong = kingKong;
        this.godzilla = godzilla;



        System.out.println(kingKong.attack());
        System.out.println(tank.hitByKingKong());
    }


}
