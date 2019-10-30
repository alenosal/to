/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author milos
 */

import com.mycompany.factory.abstrFactory;
import com.mycompany.factory.AudiFactory;
import com.mycompany.factory.Car;
import com.mycompany.factory.BmwFactory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class abstractFactoryTest {

    @Test public void AudiFactoryTest(){
        abstrFactory factory = new AudiFactory();
        assertTrue(factory instanceof AudiFactory, "Masz Audi" );
    }

    @Test public void BmwFactoryTest(){
        abstrFactory factory = new BmwFactory();
        assertTrue(factory instanceof BmwFactory, "Masz Audi" );
    }
    
    @Test public void AudiFactoryCarTest(){
        abstrFactory factory = new AudiFactory();
        Car Audi = factory.Create("A3");
        assertTrue(Audi instanceof Car, "Masz Audi" );
    }
    
    @Test public void BmwFactoryCarTest(){
        abstrFactory factory = new BmwFactory();
        Car Audi = factory.Create("M3");
        assertTrue(Audi instanceof Car, "Masz Bmw");
    }
    
}
