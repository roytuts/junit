package com.roytuts.java.junit.expected.exception;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SecondsToMinutesUtilsExceptionTest {

    private SecondsToMinutesUtils secsToMins;

    @Before
    public void setUp() throws Exception {
        secsToMins = new SecondsToMinutesUtils();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSecsToMins() {
        int seconds = 2;
        int expResult = 0;
        
        int result = secsToMins.secsToMins(seconds); // should throw exception

        assertEquals(expResult, result);
    }

}
