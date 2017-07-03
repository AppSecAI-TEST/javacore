package com.kitcenter.app.classwork.Lesson12;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;

public class PalindromeWriter {
    public void writeIfPalindrome(String inputPath, String outputPath) throws IOException {
        ReadFile readFile = new ReadFile();
        String input = readFile.readFile(inputPath);
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        if(input.equals(builder.toString())){
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath)));
            writer.append(input);
            writer.close();
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public void writeIfPalindromeFromResources(String inputName, String outputName) throws IOException {
        ReadFile readFile = new ReadFile();
        String input = readFile.readFileFromResources(inputName);
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        if(input.equals(builder.toString())){
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(getPath(outputName))));
            writer.append(input);
            writer.close();
        }else{
            System.out.println("Not Palindrome");
        }
    }

    private String getPath(String fileName){
        String path = null;
        URL url = PalindromeWriter.class.getClassLoader().getResource(fileName);
        if(url != null){
            path = url.getPath();
        }else{
            System.out.println("Not found resource");
        }
        return path;
    }
}
