package com.kitcenter.app.classwork.Lesson7;

import java.util.Scanner;

public class NumberEven {
    public boolean isEven(int a){
        boolean res;
        int r = a%2;
        if (r==0) {
            res = true;
            System.out.println("The number is even");
        }else{
            res = false;
            System.out.println("The number is odd");
        }
        return res;
    }

    public void isEvenWithScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Number:");
        int a = scanner.nextInt();

        int r = a%2;
        if (r==0) {
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
