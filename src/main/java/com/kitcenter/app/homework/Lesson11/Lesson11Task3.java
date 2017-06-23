package com.kitcenter.app.homework.Lesson11;

import java.util.Scanner;

public class Lesson11Task3 {
    public void showSeparatedByKeyWord(){
        System.out.println("Please enter the Key word");
        Scanner scanner1 = new Scanner(System.in);
        String keyWord = scanner1.next();

        System.out.println("Please enter the String with Key word");
        Scanner scanner2 = new Scanner(System.in);
        String input = scanner2.nextLine();

        if(input.contains(keyWord)){
            String[] arrInput = input.split(keyWord + " ");
            for(String item : arrInput){
                System.out.println(item);
            }
        }else{
            System.out.println(input);
        }


    }
}
