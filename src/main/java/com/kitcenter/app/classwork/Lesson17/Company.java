package com.kitcenter.app.classwork.Lesson17;

public enum Company {
    EBAY(30, "Ebay Inc."), GOOGLE(15, "Google Inc.");
    private int value;
    private String fullName;

    Company(int value, String fullName){
        this.value = value;
        this.fullName = fullName;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public String getFullName() {
        return fullName;
    }
}
