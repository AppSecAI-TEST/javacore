package com.kitcenter.app.classwork.Lesson19;

import com.kitcenter.app.classwork.Lesson20.Pair;

public class OrderPair<K, V> implements Pair {
    private K key;
    private V value;

    public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public K getKey() {
        return key;
    }


    public V getValue() {
        return value;
    }
}