package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {
    @Test
    public void Can_Not_Contain_1() {
        //arrange
        Lucky13 l = new Lucky13();
        int[] nums = {1,2,4};
        //act
        boolean actual = l.getLucky(nums);
        //assert
        Assert.assertEquals("1 cannot be in array", false, actual);
    }
    @Test
    public void Can_Not_Contain_3() {
        //arrange
        Lucky13 l = new Lucky13();
        int[] nums = {2,3,4};
        //act
        boolean actual = l.getLucky(nums);
        //assert
        Assert.assertEquals("3 cannot be in array", false, actual);
    }
    @Test
    public void Can_Contain_Any_Other_Num() {
        //arrange
        Lucky13 l = new Lucky13();
        int[] nums = {10,100,30,300};
        //act
        boolean actual = l.getLucky(nums);
        //assert
        Assert.assertEquals("Does not contain 1 or 3", true, actual);
    }
}
