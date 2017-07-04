package com.kitcenter.app.classwork.Lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWriter {
    public void readFile(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("D:\\IT\\Javacore\\javacore\\src\\main\\resources\\Reader.txt"));
        String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Text");
        }
    }
}
