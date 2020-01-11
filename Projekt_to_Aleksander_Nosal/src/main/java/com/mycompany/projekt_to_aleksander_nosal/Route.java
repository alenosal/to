package com.mycompany.projekt_to_aleksander_nosal;

public class Route implements Strategy {
    @Override
    public void execute(String destination) {
        System.out.println("Calculating route to " + destination);
    }
}
