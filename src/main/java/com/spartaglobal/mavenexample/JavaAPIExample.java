package com.spartaglobal.mavenexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class JavaAPIExample {

    public void mathExample(){
        System.out.println(Math.sqrt(25));

    }

    public  void dateTimer (){
        //System.out.println(LocalDateTime.now());
        LocalDate localDate = LocalDate.of(1997,4, 27);
        //DateTimeFormatter  formatter = DateTimeFormatter.ofPattern();
        System.out.println(localDate);
    }


}
