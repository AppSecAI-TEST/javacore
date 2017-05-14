package com.kitcenter.app.homework.Lesson8;

import com.kitcenter.app.classwork.Lesson8.CountEvenNumbers;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CountEvenNumbersTest {

    @Test
    @FileParameters(value="src/test/resources/count_even_test_data.csv", mapper=CsvWithHeaderMapper.class)
    public void countEvenNumbersTest(int from, int to, int expRes){
        CountEvenNumbers countEvenNumbers = new CountEvenNumbers();
        Assert.assertEquals(expRes, countEvenNumbers.countEvenNumbers2(from, to));
    }

}
