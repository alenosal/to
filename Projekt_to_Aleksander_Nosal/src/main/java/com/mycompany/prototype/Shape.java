/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototype;

import java.util.Objects;

/**
 *
 * @author dstudent
 */
public abstract class Shape {
    public int x;
    public int y;
    
    public Shape(){
        
    }
    
    public Shape(int x ,int y){
        this.x = x;
        this.y = y;

    }
    
    public Shape(Shape origin){
        if(origin != null){
            this.x = origin.x;
            this.y = origin.y;
        }
    }
            
    @Override
        public abstract Shape clone();
        
    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Shape))
            return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y;
    }
    
}
