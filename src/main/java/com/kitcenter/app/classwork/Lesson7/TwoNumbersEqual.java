package com.kitcenter.app.classwork.Lesson7;

public class TwoNumbersEqual {
    public void numberDecrease(int a, int b){
            while (a > b) {
                System.out.println("a = " + a + ", b = " + b);
                a--;
            }
            if (a<=b){
                System.out.println("a = " + a + ", b = " + b);
            }
    }

    public void numbersForLoop(){
        int a;
        for (a=0; a<=10; a++){
            System.out.print(a);
        }
    }

    public void increment(){
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment" + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment" + a);
    }
}
