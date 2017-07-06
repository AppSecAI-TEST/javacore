package com.kitcenter.app.classwork.Lesson14;

public class Car {
    protected String name;
    protected int speed;

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public void showNameAndSpeed(){
        System.out.println(name + " " + speed);
    }

    public void driveCar(){
        System.out.println("Car drives");
    }
}
