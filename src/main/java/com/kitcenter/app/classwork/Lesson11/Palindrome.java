package com.kitcenter.app.classwork.Lesson11;

public class Palindrome {
    public void isPalindrome(String palindrome){
        StringBuilder builder = new StringBuilder(palindrome);
        builder.reverse();
        if(palindrome.equals(builder.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
