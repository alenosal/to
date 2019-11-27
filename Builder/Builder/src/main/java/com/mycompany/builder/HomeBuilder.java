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
public class HomeBuilder {
    private int windows;
    private String wall;
    public HomeBuilder setWindows(int windows){
        this.windows = windows;
        return this;
    }
    
     public HomeBuilder setWall(String wall){
        this.wall = wall;
        return this;
    }
    
     public Home build(){
         return new Home(windows, wall);
     }
}
