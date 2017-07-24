package com.kitcenter.app.homework.Lesson14;

import com.kitcenter.app.homework.Lesson13.Human;
import java.util.regex.Pattern;

public class WhiteCollar extends Human{
    private String companyName;

    public WhiteCollar(int age, String name, String companyName){
        super(age, name);
        this.companyName = companyName;
    }

    public void setCompanyName(String company){
        boolean resultMatch = Pattern.compile("([a-zA-Z]|\\s|-|,)+").matcher(company).matches();
        if(resultMatch == true){
            companyName = company;
            System.out.println("Name is saved");
        }else{
            System.out.println("Company name is invalid");
        }
    }

    public String getCompanyName() {
        return companyName;
    }
}
