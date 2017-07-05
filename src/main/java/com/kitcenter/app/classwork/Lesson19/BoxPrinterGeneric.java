package com.kitcenter.app.classwork.Lesson19;

public class BoxPrinterGeneric <T> {
    private T val;
    public BoxPrinterGeneric(T val){
        this.val = val;
    }
    public String toString(){
        return "{" + "val=" + val + "}";
    }

    public T getValue(){return val;}

    public <T extends Number> void genericMethod(BoxPrinterGeneric<T> t){
        System.out.println(t);

    }
}
