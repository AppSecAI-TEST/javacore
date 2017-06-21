package com.kitcenter.app.classwork.Lesson15.interfaces;

public interface Bicycle {
    void changeGear(int value);
    void shift();

    double PI = 3.14d;

    default int changeSpeed(int speed){
        System.out.println("Default method, speed is: "+ speed);
        return speed;
    }
}
