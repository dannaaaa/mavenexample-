package com.spartaglobal.collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleLists {

    //don't have to expeclitly declare the string
    private List<String> hobbies = new ArrayList<>();

    public ExampleLists() {
        this.hobbies = hobbies;
        workingWithList();
    }

    private void workingWithList() {
        hobbies.add("Spending money");
        hobbies.add("Travelling");
        hobbies.add("Reading");
    }

    public void printList() {
        System.out.println("We're using the iterator......");
        for (Iterator<String> iterator = hobbies.iterator(); iterator.hasNext(); ) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
