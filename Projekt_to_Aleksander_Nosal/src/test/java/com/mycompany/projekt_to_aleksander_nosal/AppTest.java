package com.mycompany.projekt_to_aleksander_nosal;

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
    public void CarTest() {
        Color red = new Red();
        Color blue = new Blue();
        Color green = new Green();
        Car audi = new Audi(red);
        Car merc = new Mercedes(green);
        assertTrue(red instanceof Red);
        assertTrue(red instanceof Color);
        assertTrue(blue instanceof Blue);
        assertTrue(blue instanceof Color);
        assertTrue(green instanceof Green);
        assertTrue(green instanceof Color);
        assertTrue(audi instanceof Audi);
        assertTrue(audi instanceof Car);
        assertTrue(merc instanceof Mercedes);
        assertTrue(merc instanceof Car);
        assertTrue(audi.getColorClass() instanceof Red);
        assertTrue(merc.getColorClass() instanceof Green);
    }
}
