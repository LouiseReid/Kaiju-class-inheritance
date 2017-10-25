package com.example.louisereid.kaijuattackhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/10/2017.
 */

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void Before() {
        godzilla = new Godzilla("Godzilla", 100, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(100, godzilla.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("ROOOOAAAAAR!", godzilla.roar());
        assertEquals(95, godzilla.getAttackValue());
    }

    @Test
    public void canAttack(){
        assertEquals("Swishes tail", godzilla.attack());
        assertEquals(80, godzilla.getAttackValue());
    }

    @Test
    public void canMove(){
        assertEquals("Stomps around", godzilla.move());
        assertEquals(90, godzilla.getAttackValue());
    }

    @Test
    public void hitByTank(){
        godzilla.hitByTank();
        assertEquals(80, godzilla.getHealthValue());
    }

    @Test
    public void hitByChopper(){
        godzilla.hitByChopper();
        assertEquals(90, godzilla.getHealthValue());
    }

}
