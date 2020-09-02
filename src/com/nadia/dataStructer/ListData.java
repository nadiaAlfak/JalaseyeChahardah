package com.nadia.dataStructer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListData {
    public void addTOlist(){
        List<String> names=new ArrayList<>();
        names.add("nadia");
        names.add("hoda");
        names.add("yousef");
        names.add("sheyma");

        names.add(1,"bahare");

        //
        //names.remove(2);

        names.set(3,"saeed");
       // names.remove("hoda");

        //Contains
        if (names.contains("bahar")){
            System.out.println("vojod darad");
        }

        Collections.sort(names);
Collections.reverse(names);
Collections.shuffle(names);



        for (String name:names) {
            System.out.println(name);
        }
    }

}