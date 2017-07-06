package com.kitcenter.runners.homework.Lesson13;

import com.kitcenter.app.homework.Lesson13.Human;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human(27, "Olga");
        System.out.println(human.getAge());
        human.setAge(121);
        System.out.println(human.getAge());
    }
}
