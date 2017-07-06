package com.kitcenter.app.classwork.Lesson14;

public class Lexus extends Car{
    public Lexus(String name, int speed){
        super(name, speed);
    }

    @Override
    public void driveCar() {
        System.out.println("Lexus drives");
    }
}
