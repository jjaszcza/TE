package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {

    private AnimalGroupName a;

    @Before
     public void setup() {
        this.a = new AnimalGroupName();
    }

    @Test
    public void Return_Group_Of_Inputted_Animal() {

        //arrange
        String name  = "Rhino";

        //act
        String actual = a.getHerd(name);
        //assert
        Assert.assertEquals("should return Crash", "Crash", actual);
    }

    @Test
    public void Can_Be_Upper_Or_Lower_Case_Input() {
        //arrange
        String name = "rHiNo";

        //act
        String actual = a.getHerd(name);
        //assert
        Assert.assertEquals("should return Crash", "Crash", actual);
    }
    @Test
    public void Can_Be_Unknown_If_Empty() {
        //arrange
        String name = "";

        //act
        String actual = a.getHerd(name);
        //assert
        Assert.assertEquals("should return unknown", "unknown", actual);
    }
    @Test
    public void Can_Be_Unknown_If_Not_In_Map() {
        //arrange
        String name = "zebra";

        //act
        String actual = a.getHerd(name);
        //assert
        Assert.assertEquals("should return unknown", "unknown", actual);
    }
    @Test
    public void Can_Be_Unknown_If_Null() {
        //arrange
        String name = null;

        //act
        String actual = a.getHerd(name);
        //assert
        Assert.assertEquals("should return unknown", "unknown", actual);
    }
}
