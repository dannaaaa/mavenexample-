package com.spartaglobal.collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class ExampleSets {

    private Set<String> newSet = new HashSet<String>();

    public void workingWithSet(){
        newSet.add("Cheese");
        newSet.add("chicken");
        newSet.add("Bread");
    }

    public  void printSets(){
        System.out.println(newSet.contains("Cheese"));

        for (String shoppingItem: newSet){
            System.out.println(shoppingItem);
        }
    }


}
