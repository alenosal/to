package com.mycompany.projekt_to_aleksander_nosal;

public class Rum extends Alcohol {

    public Rum(String name) {
        super(name);
    }

    @Override
    public void assignType() {
        this.type = "Rum";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
