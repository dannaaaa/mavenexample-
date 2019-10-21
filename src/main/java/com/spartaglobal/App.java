package com.spartaglobal;

import com.spartaglobal.collectionexamples.ExampleDeQueues;
import com.spartaglobal.collectionexamples.ExampleLists;
import com.spartaglobal.collectionexamples.ExampleSets;
import com.spartaglobal.collectionexamples.ExamplesQueues;
import com.spartaglobal.maps.ExampleMaps;
import com.spartaglobal.mavenexample.JavaAPIExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        ExampleSets exampleSets = new ExampleSets();
//        exampleSets.workingWithSet();
//        exampleSets.printSets();

//        ExampleLists exampleLists = new ExampleLists();
//        exampleLists.printList();

//        ExamplesQueues examplesQueues = new ExamplesQueues();
//        examplesQueues.queueRunner();
//
//        ExampleDeQueues exampleDeQueues = new ExampleDeQueues();
//        exampleDeQueues.workingWithDeque();

        ExampleMaps exampleMaps = new ExampleMaps();
        System.out.println(exampleMaps.returnValues(2 ));
        exampleMaps.loopThroughMap();


        //System.out.println( "Hello World!" );
    }
}
