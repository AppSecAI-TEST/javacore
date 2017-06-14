package com.kitcenter.runners.classwork.Lesson15;

import com.kitcenter.app.classwork.Lesson15.Person;
import com.kitcenter.app.classwork.Lesson15.Student;
import com.kitcenter.app.classwork.Lesson15.Teacher;
import com.kitcenter.app.classwork.Lesson15.Worker;

public class PersonRunner {
    public static void main(String[] args) {
        Person student = new Student("Olga");
        //System.out.println(student.getResponse("What class is it?"));
        System.out.println(student.toString());
        Person teacher = new Teacher("Teacher");
        //System.out.println(teacher.getResponse("What time is now?"));
        showResponse(student, "What class is it?");
        showResponse(teacher, "What time is now?");

        Person worker = new Worker("Bill");
        showResponse(worker, "What time is now?");
    }



    public static void showResponse(Person person, String question){
        System.out.println(person.getResponse(question));
    }
}
