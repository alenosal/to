package com.mycompany.projekt_to_aleksander_nosal;

public abstract class HouseDecorator implements House {
    protected House myHome;

    public HouseDecorator(House myHome){
        this.myHome = myHome;
    }

    @Override
    public void build(){
        myHome.build();
    }
}
