package com.kitcenter.runners.classwork.Lesson8;

import com.kitcenter.app.classwork.Lesson8.TwoNumbersEqual;

import java.util.Scanner;

public class TwoNumbersEqualRunner {
    public static void main(String[] args) {
        TwoNumbersEqual twoNumbersEqual = new TwoNumbersEqual();
        twoNumbersEqual.numbersForLoop();

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        twoNumbersEqual.numberDecrease2(a, b);


    }
}

