package com.kitcenter.app.classwork.Lesson19;

public class BoxPrinter {
    private Object val;
    public BoxPrinter(Object arg){
        val = arg;
    }
    public String toString(){
        return "{" + val + "}";
    }

    public Object getValue(){return val;}
}
