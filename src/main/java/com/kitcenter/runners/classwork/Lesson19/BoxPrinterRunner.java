package com.kitcenter.runners.classwork.Lesson19;

import com.kitcenter.app.classwork.Lesson13.Bicycle;
import com.kitcenter.app.classwork.Lesson19.BoxPrinter;

public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter boxPrinter = new BoxPrinter(new Integer(10));
        System.out.println(boxPrinter);

        Integer integer = (Integer) boxPrinter.getValue();

        BoxPrinter boxPrinter1 = new BoxPrinter(new java.lang.String("Hello World"));
        System.out.println(boxPrinter1);

        BoxPrinter boxPrinter2 = new BoxPrinter(new Bicycle("Super Puper Bicycle"));
        System.out.println(boxPrinter2);

        Bicycle bicycle = (Bicycle) boxPrinter2.getValue();



    }
}
