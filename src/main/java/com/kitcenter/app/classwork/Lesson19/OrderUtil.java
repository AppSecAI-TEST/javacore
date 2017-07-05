package com.kitcenter.app.classwork.Lesson19;

import com.kitcenter.app.classwork.Lesson20.Pair;

public class OrderUtil {
    public static <K, V extends Number> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue());
    }

    public static <V> boolean compareValue(BoxPrinterGeneric<V> v1, BoxPrinterGeneric<V> v2){
        return v1.getValue().equals(v2.getValue());
    }
}
