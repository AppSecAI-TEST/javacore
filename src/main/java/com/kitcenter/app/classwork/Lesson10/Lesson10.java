package com.kitcenter.app.classwork.Lesson10;

public class Lesson10 {
    boolean palindromeRes = true;

    public boolean isPalindrome(String palindrome){
        for(int i = 0; i < palindrome.length()/2; i++){
            palindromeRes = palindromeRes && (palindrome.charAt(i) == palindrome.charAt(palindrome.length()-i-1));
        }
        return palindromeRes;
    }

}
