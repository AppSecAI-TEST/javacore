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

    public int countEvenNumbers2(int from, int to){
        //int from;
        //int to;
        int count = 0;
        for (int a = from; a <=to; a++){
            if (a%2==0){
                count++;
            }
        }
        System.out.println("There are " +count+ " even numbers in range from "+from+" to "+to);
        return count;
    }
}
