package com.kitcenter.app.classwork.Lesson15.interfaces;

public class BMA implements Bicycle{
    @Override
    public void changeGear(int value) {
        System.out.println("BMA changing gear: " + value);
    }

    @Override
    public void shift() {
        System.out.println("BMA shift");

    }
}
