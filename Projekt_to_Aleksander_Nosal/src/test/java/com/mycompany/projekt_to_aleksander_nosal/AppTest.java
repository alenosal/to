package com.mycompany.projekt_to_aleksander_nosal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Tree tree = new Tree();
    Leaf l1 = new Leaf();
    Leaf l2 = new Leaf();
    Leaf l3 = new Leaf();
    @Test
    public void treeTest()
    {
        assertTrue(tree instanceof Tree);
        assertTrue(tree instanceof  Composite);
        assertTrue(l1 instanceof Leaf);
        assertTrue(l2 instanceof Leaf);
        assertTrue(l3 instanceof Leaf);

        assertTrue(l1 instanceof Composite);
        assertTrue(l2 instanceof Composite);
        assertTrue(l3 instanceof Composite);
    }
    @Test
    public void makingTreeTest() {
        tree.addLeaf(l1);
        tree.addLeaf(l3);
        tree.addLeaf(l2);

        assertTrue(tree.displayTree() instanceof ArrayList);
        assertTrue(tree.displayTree().size() == 3);

        tree.removeLeaf(l3);
        assertTrue(tree.displayTree().size() == 2);
        tree.removeLeaf(l2);
        assertTrue(tree.displayTree().size() == 1);
        tree.removeLeaf(l1);
        assertTrue(tree.displayTree().size() == 0);
    }
}
