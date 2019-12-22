package com.mycompany.projekt_to_aleksander_nosal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        AlcoholFactory factory = new AlcoholFactory();
        assertTrue(factory instanceof AlcoholFactory);
        assertTrue(factory.createAlcohol("Capitan", "Rum") instanceof Alcohol);
        assertTrue(factory.createAlcohol("White", "Wine") instanceof Alcohol);
        assertFalse(factory.createAlcohol("White", "jdjd") instanceof Alcohol);
    }
}
