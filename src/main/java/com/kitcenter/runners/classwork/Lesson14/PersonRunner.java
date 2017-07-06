package com.kitcenter.runners.classwork.Lesson14;

import com.kitcenter.app.classwork.Lesson14.Lecturer;
import com.kitcenter.app.classwork.Lesson14.Person;
import com.kitcenter.app.classwork.Lesson14.Student;

public class PersonRunner {
    public static void main(String[] args) {
        Student den = new Student("Den");
        Student olga = new Student("Olga", 27);
        den.showName();
        olga.showNameAndAge();
//Task1
        Lecturer olgaZaiats = new Lecturer("Olga Zaiats", 27);
        olgaZaiats.setDegree("Master's");
        olgaZaiats.setUniversity("Oxford");
        olgaZaiats.setFaculty("Quality Assurance Faculty");
        olgaZaiats.setExperience(10);
        olgaZaiats.showLecturerInfo();
//Task2
        Student student = new Student("Student");
        student.showDegree();

        Lecturer lecturer = new Lecturer("Lecturer", 38);
        lecturer.showDegree();
    }
}
