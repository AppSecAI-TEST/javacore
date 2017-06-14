package com.kitcenter.app.classwork.Lesson15;

public class Teacher extends Person {
    public Teacher(String name){
        super(name);
    }

    public String lessonFinished(){
        return "Do not forget to make homework!";
    }

}
