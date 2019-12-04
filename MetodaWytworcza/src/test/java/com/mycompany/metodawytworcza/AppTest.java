package com.mycompany.metodawytworcza;

import com.mycompany.metodawytworcza.iPhone;
import com.mycompany.metodawytworcza.Samsung;
import com.mycompany.metodawytworcza.Xiaomi;
import com.mycompany.metodawytworcza.Phone;
import com.mycompany.metodawytworcza.PhoneFactory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test public void PhoneFactoryTest(){
        PhoneFactory factory = new PhoneFactory();
        assertTrue(factory instanceof PhoneFactory);
    }

    @Test public void iPhoneTest(){
        PhoneFactory factory = new PhoneFactory();
        Phone Phone = factory.CreatePhone(PhoneFactory.PhoneTypes.iPhone);
        assertTrue(Phone instanceof iPhone);
    }

    @Test public void SamsungTest(){
        PhoneFactory factory = new PhoneFactory();
        Phone Phone = factory.CreatePhone(PhoneFactory.PhoneTypes.Samsung);
        assertTrue(Phone instanceof Samsung);
    }

    @Test public void XiaomiTest(){
        PhoneFactory factory = new PhoneFactory();
        Phone Phone = factory.CreatePhone(PhoneFactory.PhoneTypes.Xiaomi);
        assertTrue(Phone instanceof Xiaomi);
    }
}
