package com.example.louisereid.kaijuattackhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/10/2017.
 */

public class ChopperTest {

    Chopper chopper;
    Godzilla godzilla;


    @Before
    public void before(){
        chopper = new Chopper("Chopper", 100, 25);
        godzilla = new Godzilla("Godzilla", 100, 25);
    }
    @Test
    public void canAttack(){
        chopper.attack(godzilla);
        assertEquals(75, godzilla.getHealthValue());
        assertEquals("Machine guns fired!", chopper.attack());
    }


    @Test
    public void canTakeDamage(){
        chopper.takeDamage(25);
        assertEquals(75, chopper.getHealthValue());
        assertEquals("Chopper hit! Chopper hit!", chopper.takeDamage());
    }


}
