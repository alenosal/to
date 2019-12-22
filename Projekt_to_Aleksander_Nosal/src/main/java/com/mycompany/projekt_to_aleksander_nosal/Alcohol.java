package com.mycompany.projekt_to_aleksander_nosal;

public abstract class Alcohol {
    protected String name;
    protected String type;

    public Alcohol(String name){
        this.name = name;
    }
    public abstract void assignType();
    public abstract String getName();
    public abstract String getType();
}
