package com.kitcenter.runners.classwork.Lesson19;

public class WithoutGeneric {
    static String[] strings = new String[3];
    static Integer[] integers = new Integer[3];

    public static void main(String[] args) {
        add("String");
        add(777);

    }

    public static void add(String item){
        strings[strings.length + 1] = item;

    }

    public static void add(Integer item){
        integers[integers.length + 1] = item;

    }
}
