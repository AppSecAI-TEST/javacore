package com.kitcenter.runners.classwork.Lesson18;

import java.util.HashSet;

public class HashSetRunner {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("B");
        hs.add("a");
        hs.add("c");
        hs.add("C");
        hs.add("a");
        System.out.println(hs);
    }
}
