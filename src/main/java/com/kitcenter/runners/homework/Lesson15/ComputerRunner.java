package com.kitcenter.runners.homework.Lesson15;

import com.kitcenter.app.homework.Lesson15.Computer;
import com.kitcenter.app.homework.Lesson15.Dell;
import com.kitcenter.app.homework.Lesson15.Lenovo;

public class ComputerRunner {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        Dell dell = new Dell();

        Computer [] computerArr = {lenovo, dell};
        lenovo.getCpu();

        changesForComputersArray(computerArr, "25");
    }

    public static void changesForComputersArray(Computer[] computers, String cpu){
        for(Computer item : computers){
            item.changeCPU(cpu);
        }

    }
}
