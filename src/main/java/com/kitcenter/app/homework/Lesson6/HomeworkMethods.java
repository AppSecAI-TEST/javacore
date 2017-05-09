package com.kitcenter.app.homework.Lesson6;

import static java.lang.Math.PI;

public class HomeworkMethods {
    public double calculateArea(){
        double radius = 2;
        double circleArea = PI * (Math.pow(radius, 2));

        System.out.println("Area is " + circleArea);
        return circleArea;
    }

    public int calculateBigger(int area1, int area2){
        if (area1 > area2) {
            return area1;
        }else{
            return area2;
        }
    }

    public boolean isAdult(int age){
        boolean result;
        if (age>=18) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }

    public int perimeter(int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;
    }

    public int perimeterSquare(int a){
        int result = a*4;
        return result;
    }

    public int rectangleArea(int a, int b){
        int area = a * b;
        return area;
    }

    public double divide(double a, double b){
        double result = a/b;
        return result;
    }

    public double multiply(double a, double b){
        double result = a*b;
        return result;
    }

    public double sqrt(int a){
        double result = Math.sqrt(a);
        return result;
    }

    public double cbrt(int a){
        double result = Math.cbrt(a);
        return result;
    }

    public double ceil(double a){
        double result = Math.ceil(a);
        return result;
    }

    public double floor(double a){
        double result = Math.floor(a);
        return result;
    }

}
