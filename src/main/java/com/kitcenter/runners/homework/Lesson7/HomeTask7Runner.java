package com.kitcenter.runners.homework.Lesson7;

import com.kitcenter.app.classwork.Lesson7.NumberBigger;
import com.kitcenter.app.classwork.Lesson7.NumberEven;
import com.kitcenter.app.classwork.Lesson7.Triangle;

import java.util.Scanner;

public class HomeTask7Runner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        NumberEven numberEven = new NumberEven();
        NumberBigger numberBigger = new NumberBigger();

        System.out.println("Hello!\nWelcome to our Menu\n1 - 'Right-Angled Triangle' program. This program helps to define if 3 digits could be the sides of Right-Angled Triangle.\n2 - 'Number is Even or Odd' program. This program helps to define if the Number is Even or Odd.\n3 - 'What a Number is bigger/smaller' program. This program helps to define which of numbers is bigger.\nPlease enter option 1, 2 or 3 to run one of programs listed above:");

        Scanner scanner = new Scanner(System.in);
        int program = scanner.nextInt();

        switch(program){
            case 1: System.out.println("Welcome to 'Right-Angled Triangle' program!");
                    triangle.checkIfCouldBeSidesWithScanner();
                    break;
            case 2: System.out.println("Welcome to 'Number is Even or Odd' program!");
                    numberEven.isEvenWithScanner();
                    break;
            case 3: System.out.println("What a Number is bigger/smaller");
                    numberBigger.numberBigger();
                    break;
            default: System.out.println("The option is incorrect. Please start the program again and enter correct option number (1, 2 or 3).");
        }
    }
}
