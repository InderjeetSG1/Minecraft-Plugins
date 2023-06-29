package com.inderjeet.test;

import java.sql.Array;
import java.util.*;

public class Java_Basics_3 {
    public static void main(String[] args){
        /* Array  = List of Things
           List  = Array with more methods we can use
           Hash =
           Loops = loop/iterate through data
        */

//        //Arrays
        String[] array = new String[]{"Test1","Test2","Test3"};
        array[0] = "New Value";
//        System.out.println(array[0]);
//
//        //List
        List<String> list = new ArrayList<>();

        list.add("Test1");
        list.add("Test2");
//        System.out.println(list.get(1));
//
//        //HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5,"Test");
//        System.out.println(map.get(5));

//        //LinkedList
//        //Gurantees to maintain order
//        LinkedList<String> linkedlist = new LinkedList<>();
//
//        LinkedList.add("Test1");
//        LinkedList.add("Test2");
//        System.out.println(list.get(1));

        //LinkedHashMap
        //To ensure Insertion Order
//        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
//        map.put(5,"Test");
//        System.out.println(map.get(5));

//        for (int i = 0; i < map.size(); i++){
//            System.out.println();
//        }

        //Can not be used for HashMaps
//        for (String string: map) {
//            System.out.println(string);
//        }

        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;

        }



    }
}