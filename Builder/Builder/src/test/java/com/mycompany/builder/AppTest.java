package com.mycompany.builder;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void HomeExist()
    {
        Home home = new Home(8, "white");
        assertTrue(home instanceof Home);
    }
    
     public void ItBuilds(){
        Home home2 = new HomeBuilder().setWall("White").setWindows(8).build();
        assertTrue(home2 instanceof Home);
     }
}
