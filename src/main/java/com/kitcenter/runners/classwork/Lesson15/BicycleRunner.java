package com.kitcenter.runners.classwork.Lesson15;

import com.kitcenter.app.classwork.Lesson15.interfaces.BMN;
import com.kitcenter.app.classwork.Lesson15.interfaces.Bicycle;
import com.kitcenter.app.classwork.Lesson15.interfaces.ACME;
import com.kitcenter.app.classwork.Lesson15.interfaces.BMA;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bma = new BMA();
        Bicycle acme = new ACME();
        Bicycle bmn = new BMN();
        change(bma, 12);
        change(acme, 25);
        change(bmn, 10);

        System.out.println(Bicycle.PI);


    }

    public static void change(Bicycle bicycle, int value){
        bicycle.changeGear(value);
        bicycle.shift();
    }
}
