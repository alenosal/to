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
    public void facadeTest()
    {
        CarMaker maker = new CarMaker();
        assertTrue(maker instanceof CarMaker);
        assertTrue(maker.MakeAudi() instanceof Car);
        assertTrue(maker.MakeAudi() instanceof Audi);
        assertTrue(maker.MakeBmw() instanceof Car);
        assertTrue(maker.MakeBmw() instanceof BMW);
        assertTrue(maker.MakeMerc() instanceof Car);
        assertTrue(maker.MakeMerc() instanceof Mercedes);
    }
}
