package com.kitcenter.runners.homework.Lesson8;

import com.kitcenter.app.homework.Lesson8.*;
import java.util.Scanner;

public class HomeTask8Runner {
    public static void main(String[] args) {
        Lesson8Task1 lesson8Task1 = new Lesson8Task1();
        Lesson8Task2 lesson8Task2 = new Lesson8Task2();
        Lesson8Task3 lesson8Task3 = new Lesson8Task3();
        Lesson8Task4 lesson8Task4 = new Lesson8Task4();
        Lesson8Task5 lesson8Task5 = new Lesson8Task5();

        System.out.println("Hello!\nWelcome to HomeTask8 Menu\n1 - Task 1.\n2 - Task 2.\n3 - Task 3.\n4 - Task 4.\n5 - Task 5.");
        System.out.println("Please enter a number from the list. Enter 'exit' to leave the program.");
        Scanner scanner = new Scanner(System.in);
        String program = scanner.next();
        while (!program.equals("exit")) {
            switch (program) {
                case "1":
                    System.out.println("Welcome to Task 1");
                    lesson8Task1.showArr();
                    break;
                case "2":
                    System.out.println("Welcome to Task 2");
                    lesson8Task2.showOddArr();
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("Welcome to Task 3");
                    lesson8Task3.showRandomArr();
                    break;
                case "4":
                    System.out.println("Welcome to Task 4");
                    lesson8Task4.showRandomArr4();
                    break;
                case "5":
                    System.out.println("Welcome to Task 5");
                    System.out.println("Here we create and show you dimension array");
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Please enter array dimension:");
                    int dimension = scanner1.nextInt();
                    System.out.println("Please enter array length:");
                    int length = scanner1.nextInt();
                    int[][] dimArr = lesson8Task5.createAndFillDimArr(dimension, length);
                    System.out.println("Look at your array:");
                    lesson8Task5.showDimensionArr(dimArr);
                    break;
                default:
                    System.out.println("The option is incorrect. Please enter correct option number (1, 2, 3, 4, 5, 6, 7 or 8).");
            }
            System.out.println("Please enter number from the list. Enter 'exit' to leave the program.");
            program = scanner.next();
        }
    }
}