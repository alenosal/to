package com.mycompany.projekt_to_aleksander_nosal;

public class Audi extends Car {
    public Audi(Color c) {
        super(c);
    }

    @Override
    public void Create(String type) {
        this.brand = "Audi";
        this.type = type;
    }

    @Override
    public void setColor() {
        System.out.print("This Audi" + getType() + " is ");
    }
}
