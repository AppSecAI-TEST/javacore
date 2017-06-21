package com.kitcenter.runners.classwork.Lesson17;

import com.kitcenter.app.classwork.Lesson17.Season;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonRunner {
    public static void main(String[] args) {
        System.out.println("Enter one of seasons:");
        Scanner scanner = new Scanner(System.in);
        Season season = Season.valueOf(scanner.next().toUpperCase());
        try{
            switch (season){
                case SPRING:
                    System.out.println("Spring is beautiful");
                    break;
                case SUMMER:
                    System.out.println("Summer is warm");
                    break;
                case AUTUMN:
                    System.out.println("Autumn is orange");
                    break;
                case WINTER:
                    System.out.println("Winter is snowy");
                    break;
            }
        }catch (IllegalArgumentException e){
            System.out.println("Entered value is not a season!");
        }


        Season season1 = Season.SPRING;

        if(season1 == Season.SPRING){
            season1 = Season.SUMMER;
        }
        System.out.println(season1.name());
        System.out.println(Season.AUTUMN.name());

        Season season2 = Season.valueOf("spring".toUpperCase());
        System.out.println(season2);

        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));
    }
}
