package com.kitcenter.app.classwork.Lesson15;

public class Student extends Person{
    public Student(String name){
        super(name);
    }

    @Override
    public String getResponse(String question){
        return "Ehhh, what was the question?";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
