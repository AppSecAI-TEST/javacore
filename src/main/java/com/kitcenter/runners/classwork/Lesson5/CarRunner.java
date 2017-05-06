package com.kitcenter.runners.classwork.Lesson5;

import com.kitcenter.app.classwork.lesson5.Car;

public class CarRunner {

    public static int counter = 10;
    public static void main (String args[]) {
        Car car = new Car();
        car.name = "BMW";
        System.out.println(car.name);

        Car car2 = new Car();
        car2.name = "Audi";
        System.out.println(car2.name);

        car2.speed = 15;

        System.out.println(Car.speed);
        Car.showSpeed();
        System.out.println(counter);
    }


}
