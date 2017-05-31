package com.kitcenter.runners.classwork.Lesson11;

import com.kitcenter.app.classwork.Lesson11.StringPerformance;

public class StringPerformanceRunner {
    public static void main(String[] args) {
        StringPerformance stringPerformance = new StringPerformance();
        stringPerformance.measureStringPerformanceWithConcat();

        stringPerformance.measureStringPerformanceWithAppend();
    }
}
