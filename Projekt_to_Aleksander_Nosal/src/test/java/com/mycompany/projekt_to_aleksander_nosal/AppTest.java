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
       ClassRoom classRoom = new ClassRoom();
       assertTrue(classRoom instanceof ClassRoom);
       assertTrue(classRoom instanceof Conteiner);
       assertTrue(classRoom.getIterator() instanceof Iterator);
    }
}
