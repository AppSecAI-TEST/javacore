package com.kitcenter.runners.homework.Lesson14;

import com.kitcenter.app.homework.Lesson14.WhiteCollar;

public class WhiteCollarRunner {
    public static void main(String[] args) {
        WhiteCollar whiteCollar = new WhiteCollar(27, "Olga", "");
        whiteCollar.setCompanyName("Google-Corp develop,test");
        System.out.println(whiteCollar.getCompanyName());
    }
}
