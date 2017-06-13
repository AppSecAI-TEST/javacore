package com.kitcenter.app.homework.Lesson8;

import java.util.Random;

public class Lesson8Task4 {
    int[] randomArray = new int[15];
    public void showRandomArr4(){
        for(int i = 0; i < randomArray.length; i++){
            Random random = new Random();
            int a = random.nextInt(999);
            randomArray[i] = a;
            System.out.print(randomArray[i] + " ");
        }
        System.out.println("");
        int max = randomArray[0];
        for(int i = 0; i < randomArray.length;i++){
            if(randomArray[i]> max){
                max = randomArray[i];
            }
        }
        System.out.println("Max value is: " + max);
        int min = randomArray[0];
        for(int i = 0; i < randomArray.length; i++){
            if(randomArray[i] < min){
                min = randomArray[i];
            }
        }
        System.out.println("Min value is: " + min);
    }
}
