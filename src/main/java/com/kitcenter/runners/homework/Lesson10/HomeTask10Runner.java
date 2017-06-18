package com.kitcenter.runners.homework.Lesson10;

import com.kitcenter.app.homework.Lesson10.HomeTask10;

import java.util.Scanner;

public class HomeTask10Runner {
    public static void main(String[] args) {
        HomeTask10 homeTask10 = new HomeTask10();
        System.out.println("Hello!\nWelcome to our Menu\n1 - 'IsPalindrome1' program.\n2 - 'IsPalindrome2' program.\n3 - 'IsPalindrome3' program.");
        System.out.println("Please enter number 1, 2 or 3. Enter 'exit' to leave the program.");
        Scanner scanner = new Scanner(System.in);
        String program = scanner.next();
        while(!program.equals("exit")){

            switch(program){
                case "1": System.out.println("Welcome to 'IsPalindrome1' program!");
                    homeTask10.responseIsPalindrome1();
                    break;
                case "2": System.out.println("Welcome to 'IsPalindrome2' program!");
                    homeTask10.responseIsPalindrome2();
                    break;
                case "3": System.out.println("Welcome to 'IsPalindrome3' program! ");
                    homeTask10.responseIsPalindrome3();
                    break;
                default: System.out.println("The option is incorrect. Please enter correct option number (1, 2 or 3).");
            }
            System.out.println("Please enter number 1, 2 or 3. Enter 'exit' to leave the program.");
            program = scanner.next();
        }

    }
}
