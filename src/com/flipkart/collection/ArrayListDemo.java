package com.flipkart.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> listoCity=new ArrayList<String>();

        //addItems
        System.out.println("Size of collection " + listoCity.size());
        listoCity.add("khushi");
        listoCity.add("jain");
        listoCity.add("sanchit");
        listoCity.add("amit");
//        listoCity.add(10);
        System.out.println("Size of collection " + listoCity.size());

        //removeItems
        listoCity.remove("amit");
        System.out.println("size of collection " + listoCity.size());

        //Iteration

        for(String str : listoCity)
        {
            System.out.println(str.toString());
        }
    }
}
