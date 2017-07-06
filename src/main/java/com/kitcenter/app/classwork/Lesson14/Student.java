package com.kitcenter.app.classwork.Lesson14;

public class Student extends Person{

    private String response = "Ehhh, what was the question?";

    public Student(String name) {
        super(name);
    }

    public Student(String name, String university){
        super(name);
        this.university = university;
    }

    public Student(String name, int age){
        super(name, age);
    }

    public String getResponse(String question){
        return response;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showNameAndAge(){
        System.out.println(name + " " + age);
    }

    public void showClassName(){
        System.out.println("Student class");
    }

    @Override
    public void showDegree() {
        System.out.println("Student's degree");
    }
}
