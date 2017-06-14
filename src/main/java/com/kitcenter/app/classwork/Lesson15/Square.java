package com.kitcenter.app.classwork.Lesson15;

public class Square extends Figure{
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
