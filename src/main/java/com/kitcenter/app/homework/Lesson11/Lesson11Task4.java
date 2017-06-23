package com.kitcenter.app.homework.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson11Task4 {
    String plainText = "abcdefghijklmnopqrstuvwxyz";
    StringBuilder builder = new StringBuilder(plainText);
    String cypherText = builder.reverse().toString();
    String encodedString;
    String decodedString;

    public String encode() {
        System.out.println("Please enter your word to encode:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        try {
            input = reader.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder builderToEncode = new StringBuilder(input);

        for (int i = 0; i < builderToEncode.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (builderToEncode.charAt(i) == plainText.charAt(j)) {
                        builderToEncode.setCharAt(i, cypherText.charAt(j));
                        break;
                }
            }
        }
        encodedString = builderToEncode.toString();
        System.out.println(encodedString);
        return encodedString;
    }

    public String decode(String encodedString){
        StringBuilder builderToDecode = new StringBuilder(encodedString);
        for (int i = 0; i < builderToDecode.length(); i++) {
            for (int j = 0; j < cypherText.length(); j++) {
                if (builderToDecode.charAt(i) == cypherText.charAt(j)) {
                    builderToDecode.setCharAt(i, plainText.charAt(j));
                    break;
                }
            }
        }
        decodedString = builderToDecode.toString();
        System.out.println("Your decoded word is: " + decodedString);
        return decodedString;
    }
}
