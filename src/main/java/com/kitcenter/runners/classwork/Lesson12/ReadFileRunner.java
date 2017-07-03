package com.kitcenter.runners.classwork.Lesson12;

import com.kitcenter.app.classwork.Lesson12.ReadFile;

import java.io.IOException;

public class ReadFileRunner {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.readFile("src\\main\\resources\\input.txt");
    }
}
