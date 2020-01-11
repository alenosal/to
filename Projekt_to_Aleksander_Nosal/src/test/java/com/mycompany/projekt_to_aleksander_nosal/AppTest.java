package com.mycompany.projekt_to_aleksander_nosal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void IteratorTest()
    {
        SensorSystem sensor = new SensorSystem();
        assertTrue(sensor instanceof SensorSystem);
        Alarm alarm = new Alarm();
        Light light = new Light();
        sensor.register(alarm);
        sensor.register(light);
        assertTrue(alarm instanceof Alarm);
        assertTrue(light instanceof Light);
        assertTrue(sensor.check() == 2);
        sensor.soundTheAlarm();
        assertTrue(sensor.check() == 0);

    }
}
