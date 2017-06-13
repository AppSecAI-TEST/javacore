package com.kitcenter.app.homework.Lesson8;

import java.util.Random;

public class Lesson8Task5 {
    public int[][] createAndFillDimArr(int dimension, int length){
        int[][] dimensionArr = new int[dimension][length];
        for(int j = 0; j < dimensionArr.length; j++){
            for(int k = 0; k < dimensionArr[j].length; k++){
                final int min = 10;
                final int max = 99;
                int rnd = rnd(min, max);
                dimensionArr[j][k] = rnd;
            }
        }
        return dimensionArr;
    }

    public int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public void showDimensionArr(int[][]dimensionArr){
        for(int i = 0; i<dimensionArr.length; i++){
            for(int m = 0; m<dimensionArr[i].length; m++){
                System.out.print(dimensionArr[i][m] + " ");
            }
            System.out.println("");
        }




    }
}
