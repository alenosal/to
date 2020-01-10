package com.mycompany.projekt_to_aleksander_nosal;

public class BuyStock implements Order {
    private Stock firmStock;

    public BuyStock(Stock stock){
        this.firmStock = stock;
    }

    @Override
    public void execute() {
        this.firmStock.buy();
    }
}
