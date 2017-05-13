package com.kitcenter.app.classwork.Lesson8;

public class CountEvenNumbers {
    public void countEvenNumbers(){
        int count = 0;
        for (int a = 0; a <=20; a++){
            if (a%2==0){
                count++;
            }
        }
        System.out.println("There are " +count+ " even numbers in range from 0 to 20.");
    }
}
