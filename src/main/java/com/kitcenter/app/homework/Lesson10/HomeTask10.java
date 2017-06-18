package com.kitcenter.app.homework.Lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask10 {
    String input = "";
    boolean res;
    boolean res2;
    public String readInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word to define if it is Palindrome:");
        input = scanner.next().toLowerCase();
        return input;
    }

    public boolean isPalindrome1(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(input.length() - i - 1)) {
                res = true;
            } else {
                res = false;
                break;
            }
        }
        return res;
    }
    public void responseIsPalindrome1(){
        String input1 = readInput();
        boolean result = isPalindrome1(input1);
        if(result == true){
            System.out.println("Your word is Palindrome!");
        }else{
            System.out.println("Your word is not Palindrome :(");
        }
    }

    public boolean isPalindrome2(String input){
        char[] inputArr = new char[input.length()];
        char[] reverseInputArr = new char[input.length()];
        for(int i = 0; i < input.length(); i++){
            inputArr[i] = input.charAt(i);
        }
        for(int k = 0; k < input.length(); k++){
            reverseInputArr[k] = inputArr[inputArr.length-k-1];
        }
        String inputString = Arrays.toString(inputArr);
        String reverseString = Arrays.toString(reverseInputArr);
        if(inputString.equals(reverseString)){
            res2 = true;
        }
        return res2;
    }

    public void responseIsPalindrome2(){
        String input2 = readInput();
        boolean result = isPalindrome2(input2);
        if(result == true){
            System.out.println("Your word is Palindrome!");
        }else{
            System.out.println("Your word is not Palindrome :(");
        }
    }

    public void responseIsPalindrome3(){
        String input3 = readInput();
        StringBuilder builder = new StringBuilder(input3);
        builder.reverse();
        if(input3.equals(builder.toString())){
            System.out.println("Your word is Palindrome!");
        }else{
            System.out.println("Your word is not Palindrome :(");
        }
    }


}
