package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    @Test
    public void Answer_Is_Maybe() {
        //arrange
        DateFashion d = new DateFashion();
        int you = 3;
        int date = 7;
        //act
        int actual = d.getATable(you, date);
        //assert
        Assert.assertEquals("Result should be 1", 1, actual);
    }

    @Test
    public void Answer_Is_Yes() {
        //arrange
        DateFashion d = new DateFashion();
        int you = 3;
        int date = 9;
        //act
        int actual = d.getATable(you, date);
        //assert
        Assert.assertEquals("Result should be 2", 2, actual);
    }
    @Test
    public void Answer_Is_No() {
        //arrange
        DateFashion d = new DateFashion();
        int you = 1;
        int date = 10;
        //act
        int actual = d.getATable(you, date);
        //assert
        Assert.assertEquals("Result should be 0", 0, actual);
    }
}
