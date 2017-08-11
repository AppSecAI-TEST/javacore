package com.kitcenter.app.homework.Lesson15;

public class Lenovo extends Computer {
    @Override
    public String changeCPU(String cpu) {
        this.cpu = cpu;
        return cpu;
    }
}
