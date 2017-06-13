package com.kitcenter.runners.homework.Lesson8;

import com.kitcenter.app.homework.Lesson8.*;

public class Lesson8Runner {
    public static void main(String[] args) {
//Task 1
        System.out.println("Task 1");
        Lesson8Task1 lesson8Task1 = new Lesson8Task1();
        lesson8Task1.showArr();
//Task 2
        System.out.println("Task 2");
        Lesson8Task2 lesson8Task2 = new Lesson8Task2();
        lesson8Task2.showOddArr();
        System.out.println("");
//Task 3
        System.out.println("Task 3");
        Lesson8Task3 lesson8Task3 = new Lesson8Task3();
        lesson8Task3.showRandomArr();
//Task 4
        System.out.println("Task 4");
        Lesson8Task4 lesson8Task4 = new Lesson8Task4();
        lesson8Task4.showRandomArr4();
//Task 5
        System.out.println("Task 5");
        Lesson8Task5 lesson8Task5 = new Lesson8Task5();
        lesson8Task5.showDimensionArr(lesson8Task5.createAndFillDimArr(8,5));
    }
}
