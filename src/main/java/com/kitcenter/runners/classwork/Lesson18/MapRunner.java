package com.kitcenter.runners.classwork.Lesson18;

import com.kitcenter.app.classwork.Lesson18.ContactBook;
import com.kitcenter.app.classwork.lesson5.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {
        Map<Object, Object> map1 = new HashMap<>();
        map1.put("Zara", "7");
        map1.put("Zara", "9");
        map1.put("Olga", "26");
        map1.put("Olga", "27");
        map1.put("Nazar", "26");
        System.out.println(map1);
        map1.remove("Zara", "9");
        System.out.println(map1);
        System.out.println(map1.get("Nazar"));
        System.out.println(" Map elements");
        System.out.println("\t" + map1);
        map1.put("Lola", "8");
        System.out.println(map1.get("Lola"));

        //Practice: Contact Book. HashSet in HashMap
        ContactBook contactBook = new ContactBook();
        System.out.println(contactBook.fillList().get("a"));

        //Practice: Contact Book. HashMap in HashMap
        ContactBook contactBook1 = new ContactBook();
        System.out.println(contactBook1.fillContacts().get("a"));

        Car car = new Car();
        car.name = "BMW";
        map1.put(car, "X5");
        System.out.println(map1.get(car));
        car.speed = 10;

        Set set = map1.keySet();
        Set set1 = map1.entrySet();

        for(Map.Entry entry: map1.entrySet()){
            System.out.println(entry.getValue().toString() + entry.getKey().toString());
        }
    }
}
