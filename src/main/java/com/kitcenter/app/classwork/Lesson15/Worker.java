package com.kitcenter.app.classwork.Lesson15;

public class Worker extends Person{
    public Worker(String name){
        super(name);
    }

    public String getResponse(String question){
        return "Who is here?";
    }
}
