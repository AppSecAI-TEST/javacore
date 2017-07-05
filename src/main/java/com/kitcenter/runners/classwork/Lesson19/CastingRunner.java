package com.kitcenter.runners.classwork.Lesson19;

import com.kitcenter.app.classwork.lesson5.Car;

public class CastingRunner {
    public static void main(String[] args) {
        Car car = new Car();

        Object objectCar = car;
        car = (Car)objectCar;

    }
}
