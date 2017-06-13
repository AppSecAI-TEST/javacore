package com.kitcenter.app.homework.Lesson8;

public class Lesson8Task2 {
    int[] oddArray = new int[50];
    public void showOddArr(){
        int b = 1;
        for(int i = 0; i<oddArray.length;i++){
            oddArray[i]= b;
            System.out.print(oddArray[i] + " ");
            b+=2;
        }
        System.out.println("");
        int c = 99;
        for(int i = oddArray.length-1; i>=0;i--){
            oddArray[i]= c;
            System.out.print(oddArray[i] + " ");
            c-=2;

        }

    }

}
