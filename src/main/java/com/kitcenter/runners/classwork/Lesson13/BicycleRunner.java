package com.kitcenter.runners.classwork.Lesson13;

import com.kitcenter.app.classwork.Lesson13.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.color);

        String name = "KOMANCHE-PRO";
        Bicycle bicycle1 = new Bicycle(name);
        System.out.println(bicycle1.getName());
        bicycle1.setName("KOMANCHE-PRO2");
        System.out.println(bicycle1.getName());

        String color = "Red";
        Bicycle bicycle2 = new Bicycle(name, color);
        System.out.println(bicycle2.getName() + " " + bicycle2.color);

        Bicycle bicycle3 = new Bicycle();

        System.out.println(bicycle3.getQuantity());
        bicycle3.setQuantity(5);
        System.out.println(bicycle3.getQuantity());



    }
}
