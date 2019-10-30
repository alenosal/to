/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodawytworcza;
import java.lang.IllegalArgumentException;

/**
 *
 * @author milos
 */
public class PhoneFactory {
    public enum PhoneTypes{
        iPhone,
        Samsung,
        Xiaomi,
    }
    
    public static Phone CreatePhone(PhoneTypes phone){
        switch(phone){
            case iPhone:
                return new iPhone();
            case Samsung:
                return new Samsung();
            case Xiaomi:
                return new Xiaomi();
        }
        throw new IllegalArgumentException("phone not recognized");
    }
    
}
