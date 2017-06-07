package com.kitcenter.app.classwork.Lesson13;

public class Bicycle {
    public int wheelSize;
    public String color;
    private String name = "KOMANCHE-PRO";
    private int quantity = 1;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bicycle(){
        System.out.println("Override default constructor");
    }

    public Bicycle(String name){
        this.name = name;
    }

    public Bicycle(String name, String color){
       this(name);
       this.color = color;
    }

    public Bicycle(int wheelSize, String color, String name) {
        this(name, color);
        this.wheelSize = wheelSize;
        this.printMe();
    }

    public void printMe(){
        System.out.println("Print" + showNameAndColor());
    }

    private String showNameAndColor(){
        return name + " " + color;
    }
}
