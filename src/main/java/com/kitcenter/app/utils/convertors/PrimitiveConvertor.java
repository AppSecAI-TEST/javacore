package com.kitcenter.app.utils.convertors;

public class PrimitiveConvertor {
    float float1 = 97.15f;
    char char1;
    int int2 = 98;
    char char2;
    char char3 = 'c';
    int int3;

    public char floatToChar(){
        char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
        return char1;
    }

    public char intToChar(){
        char2 = (char) int2;
        System.out.println("Input int value is " + int2 + ". Output char value is " + char2);
        return char2;
    }

    public int charToInt(){
        int3 = (int) char3;
        System.out.println("Input char value is " + char3 + ". Output int value is " + int3);
        return int3;
    }



}
