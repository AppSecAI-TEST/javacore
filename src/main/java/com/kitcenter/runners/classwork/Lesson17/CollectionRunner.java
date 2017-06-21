package com.kitcenter.runners.classwork.Lesson17;

import java.util.ArrayList;

public class CollectionRunner {
    public static void main(String[] args) {
        String abc = "abc";
        String abc2 = "abc2";
        String abc3 = "abc3";
        ArrayList<String> arrayList = new ArrayList<>(1000);
        arrayList.add(abc);
        arrayList.add(abc2);
        arrayList.add(0, abc3);

        System.out.println(arrayList);

        int size = arrayList.size();
        System.out.println(size);

        arrayList.remove(1);
        arrayList.trimToSize();
        System.out.println(arrayList);

        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.lastIndexOf("Haha"));
        System.out.println(arrayList.lastIndexOf("abc2"));
        System.out.println(arrayList.lastIndexOf(abc2));
        System.out.println(arrayList.contains(abc3));

        System.out.println(arrayList.get(1));

    }
}
