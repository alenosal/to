package com.mycompany.prototype;

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
    public void CircleTest()
    {
        Circle c1 = new Circle(1,2,5);
        assertTrue(c1 instanceof Shape);
        assertTrue(c1 instanceof Circle);
        Circle c2 = new Circle(c1);
        assertTrue(c2 instanceof Shape);
        assertTrue(c2 instanceof Circle);
        assertTrue(c1.x == c2.x && c1.y == c2.y && c1.radius == c2.radius);
        
        assertFalse(c1 == c2);
        
    }
    
     public void SquareTest()
    {
        Square s1 = new Square(1,2,5);
        assertTrue(s1 instanceof Shape);
        assertTrue(s1 instanceof Square);
        Square s2 = new Square(s1);
        assertTrue(s2 instanceof Shape);
        assertTrue(s2 instanceof Square);
        assertTrue(s1.x == s2.x && s1.y == s2.y && s1.side == s2.side);
        
        assertFalse(s1 == s2);
    }
}
