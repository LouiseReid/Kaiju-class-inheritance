package com.example.louisereid.kaijuattackhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/10/2017.
 */

public class TankTest {

    Tank tank;
    Godzilla godzilla;


    @Before
    public void before(){
        tank = new Tank("Tank", 100, 25);
        godzilla = new Godzilla("Godzilla", 100, 25);
    }
    @Test
    public void canAttack(){
        tank.attack(godzilla);
        assertEquals(75, godzilla.getHealthValue());
        assertEquals("Guns firing!", tank.attack());
    }


    @Test
    public void canTakeDamage(){
        tank.takeDamage(25);
        assertEquals(75, tank.getHealthValue());
        assertEquals("Tank has been hit!", tank.takeDamage());
    }




}
