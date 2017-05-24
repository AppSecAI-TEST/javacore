package com.kitcenter.app.classwork.Lesson7;

import java.util.Scanner;

public class Triangle {
    public boolean checkIfCouldBeSides(int a, int b, int c){
        int c2 = c*c;
        int a2b2 = a*a + b*b;
        boolean res;

        if (c2 == a2b2) {
            res = true;
            System.out.println("Congratulations! These digits could be the sides of right-angled triangle.");
        }else{
            res = false;
            System.out.println("These digits COULD NOT be the sides of right-angled triangle.");
        }
        return res;
    }

    public void checkIfCouldBeSidesWithScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter side A:");
        int a = scanner.nextInt();
        System.out.println("Please enter side B:");
        int b = scanner.nextInt();
        System.out.println("Please enter side C:");
        int c = scanner.nextInt();

        int c2 = c*c;
        int a2b2 = a*a + b*b;

        if (c2 == a2b2) {
            System.out.println("Congratulations! These digits could be the sides of right-angled triangle.");
        }else{
            System.out.println("These digits COULD NOT be the sides of right-angled triangle.");
        }
    }
}
