package com.kitcenter.app.homework.Lesson8;

import java.util.Random;

public class Lesson8Task3 {
    int[] randomArray = new int[15];
    public void showRandomArr(){
        for(int i = 0; i < randomArray.length; i++){
            Random random = new Random();
            int a = random.nextInt(9);
            randomArray[i] = a;
            System.out.print(randomArray[i] + " ");
        }
        System.out.println("");
        int count = 0;
        for(int item : randomArray){
            if(item % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

    }
}
