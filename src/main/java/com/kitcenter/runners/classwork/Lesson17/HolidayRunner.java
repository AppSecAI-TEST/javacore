package com.kitcenter.runners.classwork.Lesson17;

import com.kitcenter.app.classwork.Lesson17.Holiday;

public class HolidayRunner {
    public static void main(String[] args) {
        Holiday[] holidays = Holiday.values();
        for(Holiday holiday : holidays){
            System.out.println(holiday.getName() + " holiday is on " + holiday.getMonth() + ", " + holiday.getDay());
        }
    }
}
