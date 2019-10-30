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
public class Car {
    private String name;
    private String model;
    
    public Car(String name, String model){
        this.name = name;
        this.model = model;
    }
    
    public String getName(){
        return this.name;
    }
     public String getModel(){
         return this.model;
     }
}
