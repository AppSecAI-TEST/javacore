package com.kitcenter.app.classwork.Lesson15.interfaces;

public class ACME implements Bicycle{
    @Override
    public void changeGear(int value) {
        System.out.println("Changing gear for ACME " + value);

    }

    @Override
    public void shift() {
        System.out.println("ACME shift");

    }
}
