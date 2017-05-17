package com.kitcenter.app.classwork.Lesson8;

public class ArrayUtil {
    public int[][] createAndFill(int dimension, int length){
        int[][] intArray = new int[dimension][length];
        for(int j = 0; j<intArray.length; j++){
            for(int k = 0; k<intArray[j].length; k++){
                intArray[j][k] = j*k;
            }
        }
        return intArray;
    }

    public int[] createAndFill(int length){
        int[] intArray = new int[length];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i*2;
        }
        return intArray;
    }
}
