package com.mycompany.projekt_to_aleksander_nosal;

import java.util.ArrayList;

public class ClassRoom implements Conteiner{
    private ArrayList<String> dziennik= new ArrayList<>();
    public ClassRoom(){
        dziennik.add("Marek");
        dziennik.add("Anna");
        dziennik.add("Filip");
        dziennik.add("Julia");
        dziennik.add("Stanislaw");
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < dziennik.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return dziennik.get(index++);
            }
            return null;
        }
    }
}
