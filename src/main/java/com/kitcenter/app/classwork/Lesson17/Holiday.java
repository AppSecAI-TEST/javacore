package com.kitcenter.app.classwork.Lesson17;

public enum Holiday {
    NEW_YEAR(1, "January", "New Year"), CHRISTMAS(7, "January", "Christmas"), WOMEN_DAY(8, "March", "Women day"), EASTER(16, "April", "Easter"), TRINITY(4, "June", "Trinity"), INDEPENDENCE_DAY(24, "August", "Independence day");
    private int day;
    private String month;
    private String name;

    Holiday(int day, String month, String name){
        this.day = day;
        this.month = month;
        this.name = name;
    }

    public int getDay(){
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
