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
public class Square extends Shape{
    public int side;
    
    public Square(int x, int y, int side){
        super(x,y);
        this.side = side;
    }
    
    public Square(Square origin){
        this.x = origin.x;
        this.y = origin.y;
        this.side = origin.side;
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
    
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Square shape2 = (Square) object2;
        return shape2.x == this.x && shape2.y == this.y && shape2.side == this.side;
    }
}
