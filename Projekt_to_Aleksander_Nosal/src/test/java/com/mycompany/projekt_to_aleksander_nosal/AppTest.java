package com.mycompany.projekt_to_aleksander_nosal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void BrokerTest()
    {
        Broker broker = new Broker();
        Stock firma = new Stock();
        assertTrue(broker instanceof Broker);
        assertTrue(firma instanceof Stock);
        BuyStock buyOrder = new BuyStock(firma);
        SellStock sellOrder = new SellStock(firma);
        assertTrue(buyOrder instanceof BuyStock && buyOrder instanceof Order);
        assertTrue(sellOrder instanceof SellStock && sellOrder instanceof Order);
    }
}
