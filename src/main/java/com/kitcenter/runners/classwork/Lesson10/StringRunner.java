package com.kitcenter.runners.classwork.Lesson10;

public class StringRunner {
    public static void main(String[] args) {



        String center = new String("KT");
        String center2 = new String("KT");
        System.out.println(center == center2);
        System.out.println(center.equals(center2));
        String centerIntern = center.intern();
        String center3 = "KT";
        System.out.println(centerIntern == center3);
        System.out.println(center.contains("K"));
        System.out.println(center.indexOf("K"));
        System.out.println(center.length());
        String text = "a3,4,5,6,7,8";
        String[] split = text.split(",");
        System.out.println(split[0]);
        System.out.println(text.charAt(1));
        System.out.println("=======");
        String text2 = "A3,4,5,6,7,8";
        System.out.println(text.compareTo(text2));
        System.out.println(text.compareToIgnoreCase(text2));
        System.out.println(center.indexOf("K"));

    }
}
