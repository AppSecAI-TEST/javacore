package com.kitcenter.app.classwork.lesson5;

import org.junit.*;

public class CalculatorTest {
    int numberOne, numberTwo;

    /*
     Initialize test data for Calculator functionality
     */
    @BeforeClass
    public static void setBeforeClassSetup(){

    }

    @Before
    public void setup(){
        numberOne = 10;
        numberTwo = 40;
    }

    @Test
    public void sumTest(){
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void substractTest(){
        int expectedResult = -30;

        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);

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
