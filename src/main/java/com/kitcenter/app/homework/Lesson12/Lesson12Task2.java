package com.kitcenter.app.homework.Lesson12;

import java.io.*;
import java.net.URL;

public class Lesson12Task2 {
    public String readFile(String fileName) throws IOException {
        String line;
        String input = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getPath(fileName)));
        while((line = bufferedReader.readLine()) != null){
            input = input.concat(line + "\n");
        }
        bufferedReader.close();
        return input;
    }

    public void writerFromFile(String input, String outputFile) throws IOException {
        String[] items = input.split("\n");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(getPath(outputFile))));
        for(int i = 0; i < items.length; i++){
            String item = items[i];
            StringBuilder builder = new StringBuilder(item);
            builder.reverse();
            if(item.equals(builder.toString())){
                writer.write(item + " is Palindrome!");
                writer.newLine();
            }else{
                writer.write(item + " is not Palindrome :(");
                writer.newLine();
            }
        }
        writer.close();
    }

    private String getPath(String fileName){
        String path = null;
        URL url = Lesson12Task1.class.getClassLoader().getResource(fileName);
        if(url != null){
            path = url.getPath();
        }else{
            System.out.println("Not found resource");
        }
        return path;
    }
}
