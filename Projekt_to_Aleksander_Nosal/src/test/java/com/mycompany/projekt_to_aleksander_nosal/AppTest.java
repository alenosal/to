package com.mycompany.projekt_to_aleksander_nosal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void houseTest() {
        House myHome = new RedHouse();
        House myHome2 = new BlueHouse();
        assertTrue(myHome instanceof House);
        assertTrue(myHome instanceof  RedHouse);
        assertTrue(myHome2 instanceof House);
        assertTrue(myHome2 instanceof  BlueHouse);
    }

    @Test
    public void DecoratorTest(){
        House myHome = new RedHouse();
        House decHouse = new BigHouseDecorator(myHome);
        House decHouse2 = new SmallHouseDecorator(myHome);
        assertTrue(decHouse instanceof House);
        assertTrue(decHouse instanceof BigHouseDecorator);
        assertTrue(decHouse2 instanceof  House);
        assertTrue(decHouse2 instanceof SmallHouseDecorator);
    }
}
