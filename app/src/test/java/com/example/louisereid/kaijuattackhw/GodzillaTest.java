package com.example.louisereid.kaijuattackhw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 25/10/2017.
 */

public class GodzillaTest {

    Godzilla godzilla;
    Tank tank;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 100, 25);
        tank = new Tank("Tank", 100, 25);
    }

    @Test
    public void canRoar(){
        assertEquals("ROOOOAAAAAR!", godzilla.roar());
    }

    @Test
    public void canMove(){
        assertEquals("Godzilla stomps around", godzilla.move());
    }

    @Test
    public void canAttackTank(){
        godzilla.attack(tank);
        assertEquals(75, tank.getHealthValue());
        assertEquals("Godzilla swishes tail", godzilla.attack());
        assertEquals("Tank has been hit!", tank.takeDamage());
    }
    @Test
    public void canTakeDamage(){
        tank.attack(godzilla);
        assertEquals(75, godzilla.getHealthValue());
        assertEquals("GRAAAAHH!", godzilla.takeDamage(25));
        assertEquals("Guns firing!", tank.attack());
    }


}
