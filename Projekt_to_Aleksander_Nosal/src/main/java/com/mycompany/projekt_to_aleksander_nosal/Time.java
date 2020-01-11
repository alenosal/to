package com.mycompany.projekt_to_aleksander_nosal;

public class Time implements Strategy {
    @Override
    public void execute(String destination) {
        System.out.println("Your time to " + destination + " will be 2 hour");
    }
}
