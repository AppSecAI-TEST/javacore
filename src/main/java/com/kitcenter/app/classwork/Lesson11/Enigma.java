package com.kitcenter.app.classwork.Lesson11;

public class Enigma {
    public String toEncode(String stringToEncode){
        String plainText = "ABCDEFGHIJKLO";
        String cypherText = "MVPSZXYUTQWNR";
        StringBuilder builder = new StringBuilder(stringToEncode);

        for(int i = 0; i < builder.length(); i++){
            for(int j = 0; j < plainText.length();j++){
                if(builder.charAt(i)==plainText.charAt(j)){
                    builder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        String encodedString = builder.toString();
        System.out.println(encodedString);
        return encodedString;
    }
}
