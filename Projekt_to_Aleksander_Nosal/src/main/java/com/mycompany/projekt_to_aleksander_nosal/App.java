package com.mycompany.projekt_to_aleksander_nosal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProxyAccount account = new ProxyAccount(1000);
        account.operations("t", 100);

    }
}
