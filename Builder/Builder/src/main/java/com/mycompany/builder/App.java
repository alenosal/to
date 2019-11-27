package com.mycompany.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Home Home = new HomeBuilder().setWall("White").setWindows(8).build();
        System.out.println(Home);
    }
}
