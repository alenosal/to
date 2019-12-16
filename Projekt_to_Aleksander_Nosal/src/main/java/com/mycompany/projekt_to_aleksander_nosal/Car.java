package com.mycompany.projekt_to_aleksander_nosal;

public abstract class Car {
    protected String brand;
    protected String type;
    protected Color color;
    public Car(Color c){
        this.color = c;
    }
    public abstract void Create(String type);
    public abstract void setColor();
    public String getBrand(){
        return this.brand;
    }

    public String getType() {
        return this.type;
    }

    public Color getColorClass(){
        return this.color;
    }

}
