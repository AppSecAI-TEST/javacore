package com.kitcenter.app.homework.Lesson11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lesson11Task1 {

    public void readInput(){
        String input;
        System.out.println("Please enter array of numbers using ';' separator (e.g. 5;8;45)");
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();

        String[] items = input.split(";");
        Integer[] items2 = new Integer[items.length];
        for(int i = 0; i < items.length; i++){
           items2[i] = Integer.parseInt(items[i]);
        }

        System.out.println("How Array should be sorted: \n1 - ascending order; \n2 - descending order");
        int sortOrderChoice = scanner.nextInt();
        if(sortOrderChoice == 1){
            Arrays.sort(items2);
            for(int item: items2){
                System.out.print(item);
                System.out.print(" ");
            }
            System.out.println("");
        }else if(sortOrderChoice == 2){
            Arrays.sort(items2, Collections.reverseOrder());
            for(int item: items2){
                System.out.print(item);
                System.out.print(" ");
            }
            System.out.println("");
        }else{
            System.out.println("Incorrect choice");
        }
    }
}
