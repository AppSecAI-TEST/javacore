package com.kitcenter.runners.classwork.Lesson17;

import com.kitcenter.app.classwork.Lesson17.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        for (Company company: Company.values()){
            System.out.println(company.getFullName());
            company.setValue(10);
            System.out.println(company.getValue());
        }
    }
}
