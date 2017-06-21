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
        bycicleActions(bma, 12, 10);
        bycicleActions(acme, 25, 45);
        bycicleActions(bmn, 10, 28);

        System.out.println(Bicycle.PI);


    }

    public static void bycicleActions(Bicycle bicycle, int value, int speed){
        bicycle.changeGear(value);
        bicycle.shift();
        bicycle.changeSpeed(speed);
    }
}
