package com.mycompany.projekt_to_aleksander_nosal;

public class Mercedes extends Car {

    public Mercedes(Color c) {
        super(c);
    }

    @Override
    public void Create(String type) {
        this.brand = "Mercedes";
        this.type = type;
    }

    @Override
    public void setColor() {
        System.out.print("This Mercedes" + getType() + " is ");
        color.setColor();
    }
}
