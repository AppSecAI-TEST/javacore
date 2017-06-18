package com.kitcenter.app.homework.Lesson6;

import org.junit.Assert;
import org.junit.Test;

public class HomeTask6Test {

    @Test
    public void calculateTest() {
        double expectedResult = 12.566370614359172;

        HomeTask6 circleArea = new HomeTask6();
        double actualResult = circleArea.calculateArea(2);

        Assert.assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void calculateBiggerTest() {
        int area1 = 12;
        int area2 = 15;
        int expectedResult = 15;

        HomeTask6 calculateBiggerArea = new HomeTask6();
        int actualResult = calculateBiggerArea.calculateBigger(area1, area2);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isAdultTest(){
        int age = 17;
        boolean expectedResult = false;

        HomeTask6 isAdultActual = new HomeTask6();
        boolean actualResult = isAdultActual.isAdult(age);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isAdultTest2(){
        int age = 18;
        boolean expectedResult = true;

        HomeTask6 isAdultActual = new HomeTask6();
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

        HomeTask6 perimeterActual = new HomeTask6();
        int actualResult = perimeterActual.perimeter(a,b,c,d);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void perimeterSquareTest(){
        int a = 2;
        int expectedResult = 8;

        HomeTask6 perimeterActual = new HomeTask6();
        int actualResult = perimeterActual.perimeterSquare(a);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void rectangleAreaTest(){
        int a = 25;
        int b = 10;
        int expectedResult = 250;

        HomeTask6 rectangleAreaActual = new HomeTask6();
        int actualResult = rectangleAreaActual.rectangleArea(a,b);

        Assert. assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideTest(){
        double a = 0.25;
        double b = 5;
        double expectedResult = 0.05;

        HomeTask6 divideActual = new HomeTask6();
        double actualResult = divideActual.divide(a,b);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void multiplyTest(){
        double a = 5.25;
        double b = 4;
        double expectedResult = 21.0;

        HomeTask6 multiplyActual = new HomeTask6();
        double actualResult = multiplyActual.multiply(a,b);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void sqrtTest(){
        int a = 25;
        double expectedResult = 5.0;

        HomeTask6 sqrtActual = new HomeTask6();
        double actualResult = sqrtActual.sqrt(a);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void cbrtTest(){
        int a = 27;
        double expectedResult = 3.0;

        HomeTask6 cbrtActual = new HomeTask6();
        double actualResult = cbrtActual.cbrt(a);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void ceilTest(){
        double a = 27.15;
        double expectedResult = 28.0;

        HomeTask6 ceilActual = new HomeTask6();
        double actualResult = ceilActual.ceil(a);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void floorTest(){
        double a = 27.15;
        double expectedResult = 27.0;

        HomeTask6 floorActual = new HomeTask6();
        double actualResult = floorActual.floor(a);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

}

