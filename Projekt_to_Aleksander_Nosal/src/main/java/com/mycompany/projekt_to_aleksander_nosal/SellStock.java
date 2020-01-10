package com.mycompany.projekt_to_aleksander_nosal;

public class SellStock implements Order {
    private Stock firmStock;

    public SellStock(Stock stock){
        this.firmStock = stock;
    }

    @Override
    public void execute(){
        firmStock.sell();
    }
}
