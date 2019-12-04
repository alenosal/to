package com.mycompany.projekt_to_aleksander_nosal;

public class KiloMeter implements Distance{
    double length;
    public KiloMeter(double length){

        this.length = length;
    }

    @Override
    public  double GetDistance() {
        return this.length;
    }

    public double concertMtoKm(double m){
        return m/1000;
    }
}
