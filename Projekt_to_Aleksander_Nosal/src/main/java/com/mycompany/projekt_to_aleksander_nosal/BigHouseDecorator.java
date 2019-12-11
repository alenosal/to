package com.mycompany.projekt_to_aleksander_nosal;

public class BigHouseDecorator extends HouseDecorator {

    public BigHouseDecorator(House myHome){
        super(myHome);
    }

    private void buildBig(House myHome){
        System.out.println("this is big house");
    }

    @Override
    public void build() {
        myHome.build();
        buildBig(myHome);
    }
}
