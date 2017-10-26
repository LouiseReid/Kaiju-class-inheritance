package com.example.louisereid.kaijuattackhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/10/2017.
 */

public class KingKongTest {

    KingKong kingKong;
    Chopper chopper;
    @Before
    public void before() {
        kingKong = new KingKong("King Kong", 100, 25);
        chopper = new Chopper("Chopper", 100, 25);
    }

    @Test
    public void canRoar(){
        assertEquals("OOOH-OOH AHH", kingKong.roar());
    }

    @Test
    public void canMove(){
        assertEquals("King Kong swings from buildings", kingKong.move());
    }

    @Test
    public void canAttackChopper(){
        kingKong.attack(chopper);
        assertEquals(75, chopper.getHealthValue());
        assertEquals("King Kong swings punch", kingKong.attack());
        assertEquals("Chopper hit! Chopper hit!", chopper.takeDamage());
    }
    @Test
    public void canTakeDamage(){
        chopper.attack(kingKong);
        assertEquals(75, kingKong.getHealthValue());
        assertEquals("WAAAHHH", kingKong.takeDamage(25));
    }

    @Test
    public void canDie(){
        assertEquals("King Kong has been eliminated!", kingKong.dead());
    }

}
