package com.kitcenter.app.homework.Lesson15;

public class Dell extends Computer {
    @Override
    public String changeCPU(String cpu) {
        this.cpu = cpu;
        return cpu;
    }
}
