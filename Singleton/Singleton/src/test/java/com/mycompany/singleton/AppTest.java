package com.mycompany.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    @Test
    public void shouldAnswerWithTrue()
    {
       assertTrue(instance1.equals(instance2));
    }
}
