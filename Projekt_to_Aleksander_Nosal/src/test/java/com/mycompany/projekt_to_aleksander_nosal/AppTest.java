package com.mycompany.projekt_to_aleksander_nosal;

import static org.junit.Assert.assertEquals;
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
    public void meterTest()
    {
        Meter metr = new Meter(2000);
        KiloMeter Km = new KiloMeter(4);
        assertTrue(metr instanceof Meter);
        assertTrue(Km instanceof KiloMeter);
        assertTrue(metr.convertKmtoM(Km.GetDistance())== 4000);
        assertTrue(Km.concertMtoKm(metr.GetDistance()) == 2);

    }
}
