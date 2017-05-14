package com.kitcenter.app.classwork.Lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Lesson7Test {

    @Test
    @FileParameters(value="src/test/resources/triangle_sides_test_data.csv", mapper=CsvWithHeaderMapper.class)
    public void checkIfCouldBeSides1Test(int a, int b, int c, boolean expResult){
        Triangle triangle = new Triangle();
        Assert.assertEquals(expResult, triangle.checkIfCouldBeSides(a, b, c));
    }

    @Test
    public void checkIfCouldBeSides2Test(){
        int a = 1;
        int b = 4;
        int c = 3;
        boolean expectedResult = false;

        Triangle triangle = new Triangle();
        boolean actualResult = triangle.checkIfCouldBeSides(a, b, c);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    @FileParameters(value="src/test/resources/number_even_test_data.csv", mapper=CsvWithHeaderMapper.class)
    public void isEven1Test(int a, boolean expRes){
        NumberEven number = new NumberEven();
        Assert.assertEquals(expRes, number.isEven(a));
    }

    @Test
    public void isEven2Test(){
        int a = 25;
        boolean expectedResult = false;

        NumberEven number = new NumberEven();
        boolean actualResult = number.isEven(a);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    @FileParameters(value="src/test/resources/number_bigger_test_data.csv", mapper=CsvWithHeaderMapper.class)
    public void numberBiggerNoScanner1Test(int n1, int n2, int expRes){
        NumberBigger numberBigger = new NumberBigger();
        Assert.assertEquals(expRes, numberBigger.numberBiggerNoScanner(n1,n2));
    }

    @Test
    public void numberBiggerNoScanner2Test(){
        int n1 = 21;
        int n2 = 52;
        int expectedResult = 2;

        NumberBigger numberBigger = new NumberBigger();
        int actualResult = numberBigger.numberBiggerNoScanner(n1,n2);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void numberBiggerNoScanner3Test(){
        int n1 = 21;
        int n2 = 21;
        int expectedResult = 0;

        NumberBigger numberBigger = new NumberBigger();
        int actualResult = numberBigger.numberBiggerNoScanner(n1,n2);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
