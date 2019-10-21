package com.spartaglobal.collectionexamples;

import java.util.LinkedList;
import java.util.Queue;

public class ExamplesQueues {

    private Queue<String> stringQueue = new LinkedList<>();

    public ExamplesQueues() {
        stringQueue.add("One");
        stringQueue.add("Two");
        stringQueue.add("Three");
    }

    public void queueRunner(){
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.remove());

        for(String itemInQueue: stringQueue){
            System.out.println(itemInQueue);
        }
    }
}

//first in first out
