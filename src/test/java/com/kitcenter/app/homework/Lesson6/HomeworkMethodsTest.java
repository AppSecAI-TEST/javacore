package com.kitcenter.app.homework.Lesson6;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkMethodsTest {

    @Test
    public void calculateTest() {
        double expectedResult = 12.566370614359172;

        HomeworkMethods circleArea = new HomeworkMethods();
        double actualResult = circleArea.calculateArea();

        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void calculateBiggerTest() {
        int area1 = 12;
        int area2 = 15;
        int expectedResult = 15;

        HomeworkMethods calculateBiggerArea = new HomeworkMethods();
        int actualResult = calculateBiggerArea.calculateBigger(area1, area2);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isAdultTest(){
        int age = 17;
        boolean expectedResult = false;

        HomeworkMethods isAdultActual = new HomeworkMethods();
        boolean actualResult = isAdultActual.isAdult(age);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isAdultTest2(){
        int age = 18;
        boolean expectedResult = true;

        HomeworkMethods isAdultActual = new HomeworkMethods();
        boolean actualResult = isAdultActual.isAdult(age);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void perimeterTest(){
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int expectedResult = 14;

        HomeworkMethods perimeterActual = new HomeworkMethods();
        int actualResult = perimeterActual.perimeter(a,b,c,d);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void perimeterSquareTest(){
        int a = 2;
        int expectedResult = 8;

        HomeworkMethods perimeterActual = new HomeworkMethods();
        int actualResult = perimeterActual.perimeterSquare(a);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void rectangleAreaTest(){
        int a = 25;
        int b = 10;
        int expectedResult = 250;

        HomeworkMethods rectangleAreaActual = new HomeworkMethods();
        int actualResult = rectangleAreaActual.rectangleArea(a,b);

        Assert. assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTest(){
        double a = 0.25;
        double b = 5;
        double expectedResult = 0.05;

        HomeworkMethods divideActual = new HomeworkMethods();
        double actualResult = divideActual.divide(a,b);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void multiplyTest(){
        double a = 5.25;
        double b = 4;
        double expectedResult = 21.0;

        HomeworkMethods multiplyActual = new HomeworkMethods();
        double actualResult = multiplyActual.multiply(a,b);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void sqrtTest(){
        int a = 25;
        double expectedResult = 5.0;

        HomeworkMethods sqrtActual = new HomeworkMethods();
        double actualResult = sqrtActual.sqrt(a);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void cbrtTest(){
        int a = 27;
        double expectedResult = 3.0;

        HomeworkMethods cbrtActual = new HomeworkMethods();
        double actualResult = cbrtActual.cbrt(a);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void ceilTest(){
        double a = 27.15;
        double expectedResult = 28.0;

        HomeworkMethods ceilActual = new HomeworkMethods();
        double actualResult = ceilActual.ceil(a);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void floorTest(){
        double a = 27.15;
        double expectedResult = 27.0;

        HomeworkMethods floorActual = new HomeworkMethods();
        double actualResult = floorActual.floor(a);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

}

