package com.mycompany.projekt_to_aleksander_nosal;

import java.util.ArrayList;

public class Tree implements Composite {

    ArrayList<Composite> tree = new ArrayList<>();
    @Override
    public Composite operation() {
        return this;
    }

    public void addLeaf(Leaf leaf){
        tree.add(leaf);
    }

    public void removeLeaf(Leaf leaf) {
        tree.remove(leaf);
    }

    public ArrayList displayTree(){
        return tree;
    }
}
