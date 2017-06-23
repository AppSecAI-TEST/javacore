package com.kitcenter.app.homework.Lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson11Task2 {
    public void getAlphabeticFromArray(){
        System.out.println("Please enter array separator");
        Scanner scanner1 = new Scanner(System.in);
        String separator = scanner1.next();

        String input;
        System.out.println("Please enter array of characters using entered separator (e.g. Olga"+separator+"27"+separator+"Nazar"+separator+"26"+separator+"Anna"+separator+"19)");
        Scanner scanner2 = new Scanner(System.in);
        input = scanner2.next();

        String[] arrInput = input.split(separator);
        String stringInput = Arrays.toString(arrInput);
        //Regex for unicode characters "\\P{L}+"
        String alphabeticString = stringInput.replaceAll("[^A-Za-z]+", "");
        System.out.println(alphabeticString);
    }
}
