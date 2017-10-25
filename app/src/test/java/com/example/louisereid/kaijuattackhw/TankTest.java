package com.example.louisereid.kaijuattackhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/10/2017.
 */

public class TankTest {

    Tank tank;

    @Before
    public void Before(){
        tank = new Tank("M58 Wolf", 200);
    }

    @Test
    public void hasType(){
        assertEquals("M58 Wolf", tank.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(200, tank.getHealthValue());
    }

    @Test
    public void testHitByKong(){
        assertEquals("WARNING Kong has hit us", tank.hitByKingKong());
        assertEquals(180, tank.checkHealthValue());
    }

    @Test
    public void testHitByGodzilla(){
        assertEquals("WARNING Godzilla has hit us", tank.hitByGodzilla());
        assertEquals(190, tank.checkHealthValue());
    }

    @Test
    public void canAttack(){
        assertEquals("Guns firing!", tank.attack());
    }


}
