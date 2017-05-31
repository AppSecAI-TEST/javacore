package com.kitcenter.app.classwork.Lesson11;

public class StringPerformance {

    public void measureStringPerformanceWithConcat(){
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for(int i = 0; i < 100000L; i++){
            c.concat(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public void measureStringPerformanceWithAppend(){
        long start = System.currentTimeMillis();
        String d = "start";
        String e = "finish";
        StringBuilder stringBuilder = new StringBuilder(d);
        for(int i = 0; i < 100000L; i++){
            stringBuilder.append(e);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
