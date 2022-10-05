package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AlarmClockTest {

    @Test
    public void when_weekday_and_not_on_vacation() {
        //arrange
        final AlarmClock c = new AlarmClock();
        final int monday = 1;

        //act
        String actual = c.clockAlarm(monday, false);

        //assert
        Assert.assertEquals("should be 7am", "7:00", actual);


    }

    @Test
    public void when_weekend_and_not_on_vacation() {


        //arrange
        final AlarmClock c = new AlarmClock();
        final int saturday = 6;
        //act
        String actual = c.clockAlarm(saturday, false);
        //assert
        Assert.assertEquals("message", "10:00", actual);
    }
    @Test
    public void when_weekday_and_on_vacation() {
        final AlarmClock c = new AlarmClock();
        final int wednesday = 3;
        //act
        String actual = c.clockAlarm(wednesday, true);
        //assert
        Assert.assertEquals("should be 10:00", "10:00", actual);
    }
    @Test
    public void when_weekend_and_on_vacation() {
        final AlarmClock c = new AlarmClock();
        final int saturday = 6;
        //act
        String actual = c.clockAlarm(saturday, true);
        //assert
        Assert.assertEquals("should be off", "off", actual);
    }
}
