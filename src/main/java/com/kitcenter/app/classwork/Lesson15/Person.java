package com.kitcenter.app.classwork.Lesson15;

public class Person {
    protected String name;

    public Person(String name){
        this.name = name;
    }

    public String getResponse(String question){
        return "My answer is " + question;
    }
}
