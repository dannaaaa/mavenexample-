package com.spartaglobal.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// cannot have a duplicate in a set
public class ExampleMaps {

    private Map<Integer, String> studentsInClass = new HashMap<>();

    public ExampleMaps() {
        studentsInClass.put(1, "Dana");
        studentsInClass.put(2, "sham");
        studentsInClass.put(3, "Fab");
    }

    public String returnValues (int keyNum){
        return studentsInClass.get(keyNum);
    }

    public void loopThroughMap(){
        Collection<String> values = studentsInClass.values();

        for (String data: values){
            System.out.println(data);
        }

        studentsInClass.keySet();
    }

}
