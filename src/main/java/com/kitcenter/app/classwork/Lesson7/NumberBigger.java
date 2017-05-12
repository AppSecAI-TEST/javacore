package com.kitcenter.app.classwork.Lesson7;

import java.util.Scanner;

public class NumberBigger {
    int n1;
    int n2;

    public void numberBigger(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Number 1:");
        n1 = scanner.nextInt();

        System.out.println("Please enter Number 2:");
        n2 = scanner.nextInt();

        if (n1>n2){
            System.out.println("Number 1 is bigger than Number 2");
        }else if (n1<n2){
            System.out.println("Number 2 is bigger than Number 1");
        }else{
            System.out.println("Numbers are equal!");
        }
    }

    public int numberBiggerNoScanner(int n1, int n2){
         int res;
        if (n1>n2){
            res = 1;
            System.out.println("Number 1 is bigger than Number 2");
        }else if (n1<n2){
            res = 2;
            System.out.println("Number 2 is bigger than Number 1");
        }else{
            res = 0;
            System.out.println("Numbers are equal!");
        }
        return res;
    }
}
