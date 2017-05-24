package com.kitcenter.runners.classwork.Lesson9;

import java.util.Random;

public class DebugRunner {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        random.nextInt();
        for(int i = 0; i < ints.length; i++){
            ints[i] = i*2;
        }

        int a = 5;
        int b = 6;
        if(a > b){
            System.out.println(a);
        }
    }
}
