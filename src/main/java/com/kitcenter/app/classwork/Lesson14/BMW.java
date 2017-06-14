package com.kitcenter.app.classwork.Lesson14;

public class BMW extends Car{
    public BMW(String name, int speed){
        super(name, speed);
    }

    @Override
    public void driveCar() {
        System.out.println("BMW drives");
    }
}
