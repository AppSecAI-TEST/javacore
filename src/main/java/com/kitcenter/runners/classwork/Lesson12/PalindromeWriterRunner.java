package com.kitcenter.runners.classwork.Lesson12;

import com.kitcenter.app.classwork.Lesson12.PalindromeWriter;
import java.io.IOException;

public class PalindromeWriterRunner {
    public static void main(String[] args) throws IOException {
        String inputPath = "src\\main\\resources\\input.txt";
        String outputPath = "D:\\IT\\Javacore\\javacore\\src\\main\\resources\\output.txt";
        String inputName = "input2.txt";
        String outputName = "output2.txt";

        PalindromeWriter palindromeWriter = new PalindromeWriter();
        palindromeWriter.writeIfPalindrome(inputPath, outputPath);
        palindromeWriter.writeIfPalindromeFromResources(inputName, outputName);
    }
}