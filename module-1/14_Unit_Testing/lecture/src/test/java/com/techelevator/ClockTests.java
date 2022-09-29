package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ClockTests {

    @Test
    public void whenMondayAndNotOnVacationShouldBe700() {

        //arrange
        AlarmClock c = new AlarmClock();
        int monday = 1;
        boolean onVacation = false;

        //act
        String result = c.wakeUp(monday, onVacation);
        //assert
        Assert.assertEquals("should wake up at 7am", "7:00", result);
    }

    @Test
    public void whenSundayAndNotOnVacationShouldBe1000() {
        //arrange
        AlarmClock c = new AlarmClock();
        int sunday = 0;
        boolean onVacation = false;
        //act
        String result = c.wakeUp(sunday, onVacation);

        //assert
        Assert.assertEquals("should wake up at 10:00", "10:00", result);
    }
    @Test
    public void whenSundayAndNotOnVacationShouldBeOff() {
        //arrange
        AlarmClock c = new AlarmClock();
        int sunday = 0;
        boolean onVacation = true;
        //act
        String actual = c.wakeUp(sunday, onVacation);

        //assert
        Assert.assertEquals("should wake up whenever", "off", actual);
    }
}
