package com.kitcenter.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void sumTest(){
        int numberOne = 10;
        int numberTwo = 40;
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(numberOne, numberTwo);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void substractTest(){
        int number1 = 100;
        int number2 = 90;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int actualResult = calculator.substract(number1, number2);
        Assert.assertEquals(expectedResult, actualResult);

    }
}
