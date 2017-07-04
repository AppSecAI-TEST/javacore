package com.kitcenter.app.homework.Lesson12;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Lesson12Task3 {
    public void writerFromConsole() throws IOException {
        System.out.println("Please enter file name from resources, where we should write text:");
        Scanner scanner1 = new Scanner(System.in);
        String inputFileName = scanner1.next();

        System.out.println("Please enter your text:");
        String inputText = "";

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(getPath(inputFileName))));
        while(!(inputText.contains("*exit*"))){
            Scanner scanner2 = new Scanner(System.in);
            inputText = scanner2.nextLine();
            writer.write(inputText);
            writer.newLine();
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
