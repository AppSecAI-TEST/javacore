package com.kitcenter.app.classwork.Lesson19;

public class OrderUtil {
    public static <K, V> boolean compare(OrderPair<K, V> p1, OrderPair<K, V> p2){
        return p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue());
    }

    public static <V> boolean compareValue(BoxPrinterGeneric<V> v1, BoxPrinterGeneric<V> v2){
        return v1.getValue().equals(v2.getValue());
    }
}
