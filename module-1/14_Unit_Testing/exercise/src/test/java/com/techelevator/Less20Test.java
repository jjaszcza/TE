package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
    @Test
    public void Is_One_Or_Two_Less_Than_Multiple_Of_20() {
        //arrange
        Less20 l = new Less20();
        int n = 58;

        //act
        boolean actual = l.isLessThanMultipleOf20(n);
        //assert

        Assert.assertEquals("n % 20 is 19", true, actual);
        Assert.assertEquals("n % 20 is 18", true, actual);
    }
    @Test
    public void Not_One_Or_Two_Less_Than_20() {
        //arrange
        Less20 l = new Less20();
        int n = 5;
        //act
        boolean actual = l.isLessThanMultipleOf20(n);
        //assert
        Assert.assertEquals("n % 20 is not 18 or 19", false, actual);
    }
}
