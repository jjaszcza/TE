package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {


    @Test
    public void Minimum_Cigar_Count() {
        //arrange
        CigarParty c = new CigarParty();
        int cigars = 40;

        //act
        boolean actual = c.haveParty(cigars, false);
        //assert
        Assert.assertEquals("the minimum is at least 40", true, actual);
    }

    @Test
    public void Maximum_Cigar_Count_Not_Weekend() {

        //arrange
        CigarParty c = new CigarParty();
        int cigars = 60;

        //act
        boolean actual = c.haveParty(cigars, false);
        //assert
        Assert.assertEquals("Maximum can be no greater than 60 on a weeknight", true, actual);
    }
    @Test
    public void Cannot_Be_More_Than_60_On_Weeknight() {
        //arrange
        CigarParty c = new CigarParty();
        int cigars = 80;
        //act
        boolean actual = c.haveParty(cigars, false);
        //assert
        Assert.assertEquals("Maximum can be no greater than 60 on a weeknight", false, actual);
    }
    @Test
    public void No_Maximum_On_Weekend() {
        //arrange
        CigarParty c = new CigarParty();
        int cigars = 200;
        //act
        boolean actual = c.haveParty(cigars, true);
        //assert
        Assert.assertEquals("There is no maximum amount on weekend days", true, actual);
    }
}
