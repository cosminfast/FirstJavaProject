package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lab6 {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();

        myList.add(0);
        myList.add(1);
        myList.add(12);
        myList.add(13);
        myList.add(15);
        myList.add(16);

        myList.add(0,5);

//        myList.set(1,6);

//        System.out.println(myList.get(0));

//        myList.remove(Integer.valueOf(15));

//        System.out.println(myList.size());


        LogicalOperations op = new LogicalOperations();

        List<String> myStrings = new ArrayList<String>();
        myStrings.add("a");
        myStrings.add("b");
        myStrings.add("c");
        myStrings.add("d");


        System.out.println(op.isValueInList(myStrings, "d"));
    }
}
