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
public class Main {
    public static void main(String[] args){
        AudiFactory Audi = new AudiFactory();
        Car sam1 = Audi.Create("A3"); 
        System.out.println(sam1.getModel());
    }
    
}
