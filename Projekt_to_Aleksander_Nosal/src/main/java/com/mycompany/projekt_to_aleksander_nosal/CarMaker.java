package com.mycompany.projekt_to_aleksander_nosal;

public class CarMaker {
    private Car Audi;
    private Car Bmw;
    private Car Merc;

    public CarMaker(){
        this.Audi = new Audi();
        this.Bmw = new BMW();
        this.Merc = new Mercedes();
    }

    public Car MakeAudi(){
        return (Audi.create());
    }

    public Car MakeBmw() {
       return Bmw.create();
    }

    public Car MakeMerc() {
        return Merc.create();
    }
}
