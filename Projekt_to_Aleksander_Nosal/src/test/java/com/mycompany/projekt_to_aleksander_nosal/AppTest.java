package com.mycompany.projekt_to_aleksander_nosal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.lang.management.PlatformLoggingMXBean;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void IteratorTest()
    {
        Navigation navigation = new Navigation();
        assertTrue(navigation instanceof Navigation);
        Place place = new Place();
        Time time = new Time();
        Route route = new Route();
        assertTrue(route instanceof Route);
        assertTrue(time instanceof Time);
        assertTrue(place instanceof Place);
        navigation.setStrategy(place);
        assertTrue(navigation.getStrategy() instanceof Place);
    }
}
