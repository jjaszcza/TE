package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DriverTests {

    private Driver driver;

    @Before
    public void setup() {
        this.driver = new Driver();
        System.out.println("running setup");

    }

    @After
    public void cleanUp() {
        this.driver = null; //this is not necessary. for demo only
        System.out.println("running cleanup");
    }

    @Test
    public void whenDriverHasPermitAndWithLicensedDriver_ReturnTrue() {

        //arrange
        Driver d = new Driver();
        boolean hasPermit = true;
        boolean withLicensedDriver = true;

        //act
        boolean result = d.canDrive(hasPermit, withLicensedDriver);
        //assert
        Assert.assertTrue("should be able to drive", result);
    }

    @Test
    public void whenDriverHasPermitButNotWithLicensedDriver() {

        Driver d = new Driver();
        boolean hasPermit = true;
        boolean withLicensedDriver = false;

        boolean result = d.canDrive(hasPermit, withLicensedDriver);

        Assert.assertFalse("can't drive without licensed driver", result);
    }

}
