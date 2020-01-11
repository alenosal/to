package com.mycompany.projekt_to_aleksander_nosal;

public class Navigation {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(String destination){
        strategy.execute(destination);
    }

    public Strategy getStrategy(){
        return strategy;
    }
}
