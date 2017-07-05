package com.kitcenter.runners.classwork.Lesson19;

import com.kitcenter.app.classwork.Lesson14.Car;
import com.kitcenter.app.classwork.Lesson19.BoxPrinterGeneric;
import com.kitcenter.app.classwork.Lesson19.OrderUtil;

public class BoxPrinterGenericRunner {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> boxPrinterGeneric = new BoxPrinterGeneric<>(10);
        // Не потрібно робити casting (писати (Integer))
        Integer integer = boxPrinterGeneric.getValue();

        BoxPrinterGeneric<String> boxPrinterGeneric1 = new BoxPrinterGeneric<>("string");
        String string = boxPrinterGeneric1.getValue();
        System.out.println(boxPrinterGeneric1);

        BoxPrinterGeneric<Integer> integer1 = new BoxPrinterGeneric<Integer>(25);
        BoxPrinterGeneric<Integer> integer2 = new BoxPrinterGeneric<Integer>(25);
        boolean compare = OrderUtil.compareValue(integer1, integer2);
        System.out.println(compare);

    }
}
