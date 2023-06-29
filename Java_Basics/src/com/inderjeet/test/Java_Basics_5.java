package com.inderjeet.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Java_Basics_5 {

    public static void main(String[] args) {
        //Switch Statements
        //Easy way to format alot of if else statements
        //better/efficent then a bunch of if else statements
        //break just jumps out of the current code block
        //return kills the entire program
//        String word = "Banana";
//        switch(word) {
//            case "Banana":
//                //
//                break;
//            case "apple":
//                break;
//            case "pear":
//                break;
//            default:
//                break;
//        }

        //Date and Time
        //Use Calendar class to access the date and time
        //get instance will get the exact time that method was classed
        //its very precise
//        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//        cal.add(Calendar.DAY_OF_YEAR, 1);
//        System.out.println(cal.get(Calendar.DAY_OF_MONTH));


        //Randomizer
        List<String> list = new ArrayList<>();
        list.add("sdfsdg");
        list.add("sdfsdgd");
        list.add("dfsgdfgsdfg");
        list.add("sdfsregtwerdg");
        list.add("fghfdsaf");
        Random random = new Random();
//        for (int i = 0; i < 100; i++){
//            System.out.println(random.nextInt(10));
//        }
        System.out.println(list.get(random.nextInt(list.size())));

    }
}
