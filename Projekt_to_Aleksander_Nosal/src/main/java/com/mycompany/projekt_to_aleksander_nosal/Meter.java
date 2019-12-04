package com.mycompany.projekt_to_aleksander_nosal;

public class Meter implements Distance {
    double length;
    public Meter(double length){

        this.length = length;
    }

    @Override
    public double GetDistance() {
        return length;
    }

    public double convertKmtoM(double Km){
        return Km*1000;
    }
}
