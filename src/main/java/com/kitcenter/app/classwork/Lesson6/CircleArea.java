package com.kitcenter.app.classwork.Lesson6;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CircleArea {
    public static double calculate(){
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double circleArea = PI * (Math.pow(radius, 2));

        System.out.println("Area is " + circleArea);
        return circleArea;
    }

    public static void calculateBigger(){
        Scanner scanner = new Scanner (System.in);

        double area1 = scanner.nextDouble();
        double area2 = scanner.nextDouble();

        if (area1 > area2) {
            System.out.println("Area1 is bigger");
        }else{
            System.out.println("Area2 is bigger");
        }
    }
}
