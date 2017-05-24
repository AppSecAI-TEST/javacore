package com.kitcenter.runners.classwork.Lesson9;

import com.kitcenter.app.classwork.Lesson9.Lesson9;

import java.util.Scanner;

public class Lesson9Runner {
    public static void main(String[] args) {
        String text1 = "Please enter number 1";
        String text2 = "Please enter number 2";
        Scanner scanner = new Scanner(System.in);
        screenText(text1);
        int number1 = scanner.nextInt();
        screenText(text2);
        int number2 = scanner.nextInt();

        Lesson9 lesson9 = new Lesson9();
        lesson9.whatBigger(number1, number2);
    }

    public static void screenText(String text){
        System.out.println(text);
    }
}
