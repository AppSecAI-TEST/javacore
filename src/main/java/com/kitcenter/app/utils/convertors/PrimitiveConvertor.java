package com.kitcenter.app.utils.convertors;

public class PrimitiveConvertor {
    float float1 = 97.15f;
    char char1;
    int int1 = 98;
    char char2;

    public char floatToChar(){
        char1 = (char) float1;
        System.out.println("Input float value is " + float1 + ". Output char value is " + char1);
        return char1;
    }

    public void intToChar(){
        char2 = (char) int1;
        System.out.println("Input int value is " + int1 + ". Output char value is " + char2);
    }

    public void charToInt(){
        int1 = (int) char1;
        System.out.println("Input char value is " + char1 + ". Output int value is " + int1);
    }
}
