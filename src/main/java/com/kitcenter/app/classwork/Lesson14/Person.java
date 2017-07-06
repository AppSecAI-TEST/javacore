package com.kitcenter.app.classwork.Lesson14;

public class Person {
    protected String name;
    protected int age;
    protected String university;

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getName(){
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public int getAge() {
        return age;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this(name);
        this.age = age;
    }

    public void showClassName(){
        System.out.println("Person class");
    }

    public void showDegree(){
        System.out.println("General degree");
    }
}
