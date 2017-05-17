package com.kitcenter.runners.classwork.Lesson8;

import com.kitcenter.app.classwork.Lesson8.ArrayUtil;
import com.kitcenter.app.classwork.Lesson8.Flat;
import com.kitcenter.app.classwork.lesson5.Car;

import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        ArrayUtil arrayUtil2 = new ArrayUtil();
        int[] intArray2 = arrayUtil2.createAndFill(4);
        System.out.println(Arrays.toString(intArray2));


        ArrayUtil arrayUtil = new ArrayUtil();
        int[][] intArray = arrayUtil.createAndFill(2,3);
        //System.out.println(Arrays.deepToString(intArray));
        for(int[] itemArray: intArray){
            for(int item: itemArray){
                System.out.println(item);
            }
        }

        //empty multi-dimension array 2x2
        int [][] a = new int [2][2];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;

        int [][] multiDimenEmpty = new int[2][];
        multiDimenEmpty[0] = new int[3];
        multiDimenEmpty[1] = new int[3];

        int [][] multiDimenFull = new int[2][];
        multiDimenFull[0] = new int[]{3,4,5};
        multiDimenFull[1] = new int[]{3,4,5,8};


        int[] intArr = {3, 4, 5, 6};
        int[] intArrInitial = new int[4];
        intArrInitial[0] = 3;
        intArrInitial[1] = 4;
        intArrInitial[2] = 5;
        intArrInitial[3] = 6;
        intArrInitial[0] = 7;
        System.out.println(intArrInitial[0]);

        for (int item: intArr){
            System.out.println(item);
        }

        for (int i = 0;i < intArr.length; i++){
            System.out.println(intArr[i]);
        }

        Car[] carArr = new Car[2];
        Car bmw = new Car();
        bmw.name = "BMW";
        Car audi = new Car();
        audi.name = "Audi";
        carArr[0] = bmw;
        carArr[1] = audi;
        for(Car car : carArr){
            System.out.println(car.name);
        }

        long[] longArr = new long[4];
        int b = 5;
        for(int i = 0; i < longArr.length; i++){
                longArr[i] = b;
                b++;
            System.out.println(longArr[i]);
        }

        long[] longArr2 = new long[4];
        for(int i = 0; i < longArr.length; i++){
            longArr[i] = i*3;
            System.out.println(longArr[i]);
        }

        Flat flat1 = new Flat();
        flat1.address = "Kyiv, 1 Khreschatyk street";
        Flat flat2 = new Flat();
        flat2.address = "Miami, 2 Khreschatyk street";
        Flat flat3 = new Flat();
        flat3.address = "New York, 5th Ave";

        Flat[] flatArr = new Flat[3];
        flatArr[0] = flat1;
        flatArr[1] = flat2;
        flatArr[2] = flat3;
        for(Flat flat : flatArr){
            System.out.println(flat.address);
        }
    }
}
