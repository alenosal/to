package com.mycompany.projekt_to_aleksander_nosal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   ProxyAccount account = new ProxyAccount(1000);
    @Test
    public void AccountTest()
    {
        assertTrue(account instanceof ProxyAccount);
        assertTrue(account instanceof AccountOperations);
    }

    @Test
    public void OperationsTest() {
        account.operations("w", 1000);
        assertTrue(account.yourBalance().equals(0));
        account.operations("d",1000);
        assertTrue(account.yourBalance().equals(1000));
    }
}
