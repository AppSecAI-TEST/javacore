package com.kitcenter.runners.classwork.Lesson7;

import com.kitcenter.app.classwork.Lesson7.TwoNumbersEqual;

import java.util.Scanner;

public class TwoNumbersEqualRunner {
    public static void main(String[] args) {
        TwoNumbersEqual twoNumbersEqual = new TwoNumbersEqual();
        twoNumbersEqual.numbersForLoop();

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        twoNumbersEqual.numberDecrease(a, b);


    }
}

