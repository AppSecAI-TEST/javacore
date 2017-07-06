package com.kitcenter.runners.classwork.Lesson14;

import com.kitcenter.app.classwork.Lesson14.BMW;
import com.kitcenter.app.classwork.Lesson14.Lexus;

public class CarRunner {
    public static void main(String[] args) {
        Lexus lexus = new Lexus("Lexus", 300);
        lexus.showNameAndSpeed();

        BMW bmw = new BMW("BMW", 350);
        bmw.showNameAndSpeed();

        lexus.driveCar();
        bmw.driveCar();

    }
}
