package com.example.louisereid.kaijuattackhw;

/**
 * Created by louisereid on 26/10/2017.
 */

public class Runner {
    public static void main(String[] args) {
        Ui ui = new Ui();
        Game game = new Game();
        Tank tank = new Tank ("Tank", 100, 25);
        Chopper chopper = new Chopper ("Chopper", 100, 20);
        Godzilla godzilla = new Godzilla("Godzilla", 100, 25);
        KingKong kingKong = new KingKong("King Kong", 100, 15);


        System.out.println(ui.Intro());
        System.out.println();
        game.firstWave();
        System.out.println();
        System.out.println(game.checkDead());
        System.out.println();
        game.secondWave();
        System.out.println();
        System.out.println(game.checkDead());
        System.out.println();

    }
}
