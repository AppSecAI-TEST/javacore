package com.kitcenter.app.homework.Lesson12;

import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class Lesson12Task1 {
    public Integer [] readArrFile(String fileName) throws IOException {
        String line;
        String arr = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getPath(fileName)));
        while((line = bufferedReader.readLine()) != null){
            arr = line;
        }
        bufferedReader.close();

        String[] items = arr.split(",");
        Integer[] items2 = new Integer[items.length];
        for(int i = 0; i < items.length; i++){
            items2[i] = Integer.parseInt(items[i]);
        }
        Arrays.sort(items2);
        return items2;
    }

    public void writeArrToFile(Integer[] input, String outputFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(getPath(outputFile))));
        for(Integer item : input){
            writer.append(item.toString());
            writer.append(" ");
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
