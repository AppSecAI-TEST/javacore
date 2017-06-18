package com.kitcenter.runners.homework.Lesson6;

import com.kitcenter.app.homework.Lesson6.HomeTask6;

import java.util.Scanner;

public class HomeTask6Runner {
    public static void main(String[] args) {
        HomeTask6 homeTask6 = new HomeTask6();
        System.out.println("Hello!\nWelcome to our Menu\n1 - 'Calculate Area' program.\n2 - 'Calculate Bigger' program.\n3 - 'Is Adult?' program. \n4 - 'Perimeter for Square' program.");
        System.out.println("Please enter a number from the list. Enter 'exit' to leave the program.");
        Scanner scanner = new Scanner(System.in);
        String program = scanner.next();
        while(!program.equals("exit")){
            switch(program){
                case "1": System.out.println("Welcome to 'Calculate Area' program!");
                    System.out.println("Please enter circle radius:");
                    Scanner scanner1 = new Scanner(System.in);
                    double radius = scanner1.nextDouble();
                    homeTask6.calculateArea(radius);
                    break;
                case "2": System.out.println("Welcome to 'Calculate Bigger' program!");
                    System.out.println("Please enter two numbers:");
                    Scanner scanner2 = new Scanner(System.in);
                    int area1 = scanner2.nextInt();
                    int area2 = scanner2.nextInt();
                    homeTask6.calculateBigger(area1, area2);
                    break;
                case "3": System.out.println("Welcome to 'Is Adult?' program! ");
                    System.out.println("Please enter age:");
                    Scanner scanner3 = new Scanner(System.in);
                    int age = scanner3.nextInt();
                    homeTask6.isAdult(age);
                    break;
                case "4": System.out.println("Welcome to 'Perimeter for Square' program! ");
                    System.out.println("Please enter square side:");
                    Scanner scanner4 = new Scanner(System.in);
                    int side = scanner4.nextInt();
                    System.out.println("Square perimeter is: " + homeTask6.perimeterSquare(side));
                    break;
                default: System.out.println("The option is incorrect. Please enter correct option number (1, 2, 3, 4, 5, 6, 7 or 8).");
            }
            System.out.println("Please enter number from the list. Enter 'exit' to leave the program.");
            program = scanner.next();
        }
    }
}
