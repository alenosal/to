package com.mycompany.projekt_to_aleksander_nosal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        House myHome = new RedHouse();
        myHome.build();
        House myHome2 = new BigHouseDecorator(myHome);
        myHome2.build();
    }
}
