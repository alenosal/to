package com.mycompany.projekt_to_aleksander_nosal;

import java.util.HashSet;

public class AlcoholFactory {
    private HashSet<Alcohol> alcohols = new HashSet<>();

    public Alcohol createAlcohol(String name, String type) {

        Alcohol product = null;

        switch (type){
            case "Rum":
                product = new Rum(name);
                if (alcohols.contains(product)){
                    System.out.println("Already in list");
                    for(Alcohol tmp : alcohols){
                        if (tmp.equals(product))
                            return tmp;
                        else {
                            alcohols.add(product);
                            break;
                        }
                    }
                }
            case "Wine":
                product = new Wine(name);
                if (alcohols.contains(product)){
                    System.out.println("Already in list");
                    for(Alcohol tmp : alcohols){
                        if (tmp.equals(product))
                            return tmp;
                        else {
                            alcohols.add(product);
                            break;
                        }
                    }
                }
                break;
            default:
                System.out.println("No such option");
        }
        if(product != null)
            return product;
        else
            return null;
    }
}
