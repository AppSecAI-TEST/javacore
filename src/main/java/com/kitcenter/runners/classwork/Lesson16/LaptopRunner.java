package com.kitcenter.runners.classwork.Lesson16;

import com.kitcenter.app.classwork.Lesson16.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop mac = new Laptop();
        mac.setName("Mac");
        mac.setColor("White");
        mac.setCpu(2);
        mac.setRam(8);

        Laptop hp = new Laptop();
        hp.setName("HP");
        hp.setColor("Black");
        hp.setCpu(4);
        hp.setRam(16);

        System.out.println(mac.equals(hp));
    }
}
