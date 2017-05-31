package com.kitcenter.runners.classwork.Lesson10;

import com.kitcenter.app.classwork.Lesson10.Lesson10;

import java.util.Arrays;

public class Lesson10Runner {
    public static void main(String[] args) {
        Lesson10 lesson10 = new Lesson10();
        boolean isP = lesson10.isPalindrome("ABBA");
        if(isP) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


        String stringToDisplay = "";
        char[] charArray = {'a', 'b', 'c', 'd'};

        /*for (int i=0; i < charArray.length; i++){
            stringToDisplay += charArray[i];
        }
        System.out.println(stringToDisplay);*/

        stringToDisplay = Arrays.toString(charArray)
                .replace(",", "")//remove the commas
                .replace("[", "")//remove the left bracket
                .replace("]", "")//remove the right bracket
                .replace(" ", "")//remove white spaces
                .trim();//trim empty cells at end
        System.out.println(stringToDisplay);

        double dot = 1000.0002;
        String display = String.valueOf(dot);

        String toFloat = "0.44";
        float fin = Float.valueOf(toFloat);

        String integer = "5";
        Integer intValue = Integer.valueOf(integer);
        String stringValue = String.valueOf(intValue);

        String doubleString = "23.58";
        Double doubleValue = Double.valueOf(doubleString);
        String stringValue2 = String.valueOf(doubleValue);

        String longString = "25566515165167979";
        Long longValue = Long.valueOf(longString);
        String stringValue3 = String.valueOf(longValue);

        String sBoolean = "false";
        Boolean booleanValue = Boolean.valueOf(sBoolean);
        String stringValue4 = String.valueOf(booleanValue);


        String soldRoomName = "room";
        String newRoomName = "room";
        if(soldRoomName == newRoomName){
            System.out.println("Names are equal");
        }
    }
}
