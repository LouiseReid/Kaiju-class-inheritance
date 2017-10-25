package com.example.louisereid.kaijuattackhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/10/2017.
 */

public class ChopperTest {

    Chopper chopper;

    @Before
    public void Before(){
        chopper = new Chopper("Black Hawk", 100);
    }

    @Test
    public void hasType(){
        assertEquals("Black Hawk", chopper.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, chopper.getHealthValue());
    }


    @Test
    public void testHitByKong(){
        assertEquals("WARNING Kong has hit us", chopper.hitByKingKong());
        assertEquals(80, chopper.checkHealthValue());
    }

    @Test
    public void testHitByGodzilla(){
        assertEquals("WARNING Godzilla has hit us", chopper.hitByGodzilla());
        assertEquals(90, chopper.checkHealthValue());
    }

    @Test
    public void canAttack(){
        assertEquals("Machine guns fired!", chopper.attack());
    }
}
