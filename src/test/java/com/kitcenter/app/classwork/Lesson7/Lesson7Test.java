package com.kitcenter.app.classwork.Lesson7;

import com.kitcenter.app.classwork.Lesson7.NumberBigger;
import com.kitcenter.app.classwork.Lesson7.NumberEven;
import com.kitcenter.app.classwork.Lesson7.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class Lesson7Test {

    @Test
    public void checkIfCouldBeSides1Test(){
        int a = 3;
        int b = 4;
        int c = 5;
        boolean expectedResult = true;

        Triangle triangle = new Triangle();
        boolean actualResult = triangle.checkIfCouldBeSides(a, b, c);

        Assert.assertEquals(expectedResult, actualResult);
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
    public void isEven1Test(){
        int a = 24;
        boolean expectedResult = true;

        NumberEven number = new NumberEven();
        boolean actualResult = number.isEven(a);

        Assert.assertEquals(expectedResult, actualResult);
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
    public void numberBiggerNoScanner1Test(){
        int n1 = 25;
        int n2 = 12;
        int expectedResult = 1;

        NumberBigger numberBigger = new NumberBigger();
        int actualResult = numberBigger.numberBiggerNoScanner(n1,n2);

        Assert.assertEquals(expectedResult, actualResult);
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
