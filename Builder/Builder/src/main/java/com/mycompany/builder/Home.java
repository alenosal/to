/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.builder;

/**
 *
 * @author milos
 */
public class Home {
    private final int windows;
    private final String wall;
    public Home(int windows, String wall){
        this.windows = windows;
        this.wall = wall;
    }
    @Override
    public String toString(){
        return "Home with " + windows +" windows and"+ wall +" wall";
    }
    
    
}
