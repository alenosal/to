package com.mycompany.projekt_to_aleksander_nosal;

public class Wine extends Alcohol {

    public Wine(String name) {
        super(name);
    }

    @Override
    public void assignType() {
        this.type = "Wine";
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
