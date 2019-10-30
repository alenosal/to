/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory;

/**
 *
 * @author milos
 */
public abstract class abstrFactory {
    private String FactoryName;
    
    public abstrFactory(String name){
        this.FactoryName = name;
    }
    
    public Car Create(String model){
        Car Auto = new Car(FactoryName, model);
        return Auto;
    }
}
