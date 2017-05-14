package com.kitcenter.app.classwork.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {
    int numberOne, numberTwo;

    /*
     Initialize test data for Calculator functionality
     */
    @BeforeClass
    public static void setBeforeClassSetup(){

    }

    @Test
    @FileParameters(value="src/test/resources/calculator_sum_test_data.csv", mapper=CsvWithHeaderMapper.class)
    public void sumTest(int numberOne, int numberTwo, int expRes){
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expRes, actualResult);
    }

    @Test
    @FileParameters(value="src/test/resources/calculator_substract_test_data.csv", mapper=CsvWithHeaderMapper.class)
    public void substractTest(int numberOne, int numberTwo, int expRes){
        Calculator calculator = new Calculator();
        Assert.assertEquals(expRes, calculator.substract(numberOne, numberTwo));

    }

    @After
    public void tearDown(){
        System.out.println("Postcondition for every test");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("Postcondition for class test");
    }
}
