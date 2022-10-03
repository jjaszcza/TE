package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void String_Three_Or_More_Characters() {
        //arrange
        FrontTimes f = new FrontTimes();
        String str = "julian";
        int n = 3;
        //act
        String actual = f.generateString(str, n);
        //assert
        Assert.assertEquals("Should return juljuljul", "juljuljul", actual);
    }
    @Test
    public void String_Two_Or_Less_Characters() {
        //arrange
        FrontTimes f = new FrontTimes();
        String str = "ha";
        int n = 4;

        //act
        String actual = f.generateString(str, n);
        //assert
        Assert.assertEquals("Should return hahahaha", "hahahaha", actual);
    }
    @Test
    public void String_Is_Null(){
        //arrange
        FrontTimes f = new FrontTimes();
        String str = null;
        int n = 2;
        //act
        String actual = f.generateString(null, n);
        //assert
        Assert.assertNull(str);
    }
}
