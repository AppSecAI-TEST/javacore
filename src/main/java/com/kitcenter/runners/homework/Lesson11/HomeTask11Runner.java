package com.kitcenter.runners.homework.Lesson11;

import com.kitcenter.app.homework.Lesson11.Lesson11Task1;
import com.kitcenter.app.homework.Lesson11.Lesson11Task2;
import com.kitcenter.app.homework.Lesson11.Lesson11Task3;
import com.kitcenter.app.homework.Lesson11.Lesson11Task4;

import java.util.Scanner;

public class HomeTask11Runner {
    public static void main(String[] args) {
        Lesson11Task1 lesson11Task1 = new Lesson11Task1();
        Lesson11Task2 lesson11Task2 = new Lesson11Task2();
        Lesson11Task3 lesson11Task3 = new Lesson11Task3();
        Lesson11Task4 lesson11Task4 = new Lesson11Task4();



        System.out.println("Hello!\nWelcome to HomeTask11!\n1 - 'Int Array sorting' task.\n2 - 'Get alphabetical characters from Array' task.\n3 - 'Split array by key word' task.\n4 - 'Enigma' task.");
        System.out.println("Please enter number 1, 2, 3 or 4. Enter 'exit' to leave the program.");
        Scanner scanner = new Scanner(System.in);
        String program = scanner.next();
        while(!program.equals("exit")){

            switch(program){
                case "1": System.out.println("Welcome to 'Int Array sorting' task!");
                    lesson11Task1.readInput();
                    break;
                case "2": System.out.println("Welcome to 'Get alphabetical characters from Array' task!");
                    lesson11Task2.getAlphabeticFromArray();
                    break;
                case "3": System.out.println("Welcome to 'Split array by key word' task! ");
                    lesson11Task3.showSeparatedByKeyWord();
                    break;
                case "4": System.out.println("Welcome to 'Enigma' task! ");
                    String toDecode = lesson11Task4.encode();
                    lesson11Task4.decode(toDecode);
                    break;
                default: System.out.println("The option is incorrect. Please enter correct option number (1, 2, 3 or 4).");
            }
            System.out.println("Please enter number 1, 2, 3 or 4. Enter 'exit' to leave the program.");
            program = scanner.next();
        }

    }

}
