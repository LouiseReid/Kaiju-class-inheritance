package com.example.louisereid.kaijuattackhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/10/2017.
 */

public class KingKongTest {

    KingKong kingKong;

    @Before
    public void Before(){
        kingKong = new KingKong("KingKong", 150, 150);
    }

    @Test
    public void hasName(){
        assertEquals("KingKong", kingKong.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(150, kingKong.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(150, kingKong.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("OOOH-OOH AHH", kingKong.roar());
        assertEquals(145, kingKong.getAttackValue());
    }

    @Test
    public void canAttack(){
        assertEquals("Swings punch", kingKong.attack());
        assertEquals(130, kingKong.getAttackValue());
    }

    @Test
    public void canMove(){
        assertEquals("Swings from buildings", kingKong.move());
        assertEquals(140, kingKong.getAttackValue());
    }

    @Test
    public void hitByTank(){
        kingKong.hitByTank();
        assertEquals(130, kingKong.getHealthValue());
    }

    @Test
    public void hitByChopper(){
        kingKong.hitByChopper();
        assertEquals(140, kingKong.getHealthValue());
    }
}
