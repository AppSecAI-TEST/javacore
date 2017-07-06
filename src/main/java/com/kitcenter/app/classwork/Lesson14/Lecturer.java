package com.kitcenter.app.classwork.Lesson14;

public class Lecturer extends Person{
    private String faculty;
    private int experience;
    private String degree;

    public Lecturer(String name, int age) {
        super(name, age);
    }

    public String getFaculty() {
        return faculty;
    }

    public int getExperience() {
        return experience;
    }

    public String getDegree() {
        return degree;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void showLecturerInfo(){
        System.out.println("Faculty: " + getFaculty());
        System.out.println("Experience: " + getExperience() + " years");
        System.out.println("Degree: " + getDegree() + " degree");
        System.out.println("Univercity: " + getUniversity());
        System.out.println("Age: " + getAge() + " years");
    }

    @Override
    public void showDegree() {
        System.out.println("Lecturer's degree");
    }
}
