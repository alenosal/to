/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototype;

/**
 *
 * @author dstudent
 */
public class Circle extends Shape{
    public int radius;
    
   
    public Circle(int x, int y, int radius){
        super(x,y);
        this.radius = radius;
    }
    
    public Circle(Circle origin){
        super(origin);
        if(origin != null){
            this.radius = origin.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
    
     @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
