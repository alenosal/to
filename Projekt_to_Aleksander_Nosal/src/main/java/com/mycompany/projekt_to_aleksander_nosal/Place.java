package com.mycompany.projekt_to_aleksander_nosal;

public class Place implements Strategy {
    @Override
    public void execute(String destination) {
        System.out.println("showing" + destination);
    }
}
