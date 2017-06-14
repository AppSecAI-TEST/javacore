package com.kitcenter.app.classwork.Lesson15.interfaces;

public class BMN implements Bicycle{
    @Override
    public void changeGear(int value) {
        System.out.println("BMN changing gear: " + value);
    }

    @Override
    public void shift() {
        System.out.println("BMN shift");

    }
}
