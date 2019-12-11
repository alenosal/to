package com.mycompany.projekt_to_aleksander_nosal;

public class SmallHouseDecorator extends HouseDecorator {

    public SmallHouseDecorator(House myHome){
        super(myHome);
    }

    private void buildSmall(House myHome){
        System.out.println("this is small house");
    }

    @Override
    public void build() {
        myHome.build();
        buildSmall(myHome);
    }
}
