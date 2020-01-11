package com.mycompany.projekt_to_aleksander_nosal;

import java.util.ArrayList;
import java.util.Enumeration;

public class SensorSystem {
    private ArrayList<Observer> system = new ArrayList<>();
    int check = 0;

    public void register(Observer alarm) {
        system.add(alarm);
        check++;
    }

    public void soundTheAlarm() {
       for(Observer a: system){
           check--;
           a.execute();
       }
    }

    int check(){
        return check;
    }
}
