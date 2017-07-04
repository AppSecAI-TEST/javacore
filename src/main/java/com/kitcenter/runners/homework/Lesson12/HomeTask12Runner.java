package com.kitcenter.runners.homework.Lesson12;

import com.kitcenter.app.homework.Lesson12.Lesson12Task1;
import com.kitcenter.app.homework.Lesson12.Lesson12Task2;
import com.kitcenter.app.homework.Lesson12.Lesson12Task3;

import java.io.IOException;
import java.util.Scanner;

public class HomeTask12Runner {
    public static void main(String[] args) throws IOException {
        Lesson12Task1 lesson12Task1 = new Lesson12Task1();
        Lesson12Task2 lesson12Task2 = new Lesson12Task2();
        Lesson12Task3 lesson12Task3 = new Lesson12Task3();

        System.out.println("Hello!\nWelcome to HomeTask12!\n1 - 'Array from File sorting' task.\n2 - 'Write words in column' task.\n3 - 'Write From Console' task.");
        System.out.println("Please enter number 1, 2, or 3. Enter 'exit' to leave the program.");
        Scanner scanner = new Scanner(System.in);
        String program = scanner.next();
        while(!program.equals("exit")){

            switch(program){
                case "1": System.out.println("Welcome to 'Array from File sorting' task!");
                    System.out.println("Please enter file name from resources, from which we should take Array:");
                    Scanner scanner1 = new Scanner(System.in);
                    String inputFileName = scanner1.next();
                    Integer[] arrFromInput = lesson12Task1.readArrFile(inputFileName);
                    System.out.println("Please enter file name, where Array should be written:");
                    Scanner scanner2 = new Scanner(System.in);
                    String outputFileName = scanner2.next();
                    lesson12Task1.writeArrToFile(arrFromInput, outputFileName);
                    break;
                case "2": System.out.println("Welcome to 'Write words in column' task!");
                    String input = lesson12Task2.readFile("Lesson12/words_column.txt");
                    lesson12Task2.writerFromFile(input, "Lesson12/words_column_output.txt");
                    break;
                case "3": System.out.println("Welcome to 'Write From Console' task! ");
                    lesson12Task3.writerFromConsole();
                    break;
                default: System.out.println("The option is incorrect. Please enter correct option number (1, 2 or 3).");
            }
            System.out.println("Please enter number 1, 2 or 3. Enter 'exit' to leave the program.");
            program = scanner.next();
        }
    }
}
