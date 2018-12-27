package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveNumbersTest {


    ConsecutiveNumbers consecutiveNumbers;
    @Before
    public void setUp() throws Exception {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumbers = null;
    }

    @Test
    public void testConsecutiveNumber() {
        String input = "22,23,24,25,26,27,28";

        assertEquals("error",true,consecutiveNumbers.checkConsecutiveNumber(input));
    }

    @Test
    public void testConsecutiveNumber1() {
        String input = "20,22,23,24,25,26,27,28";

        assertEquals("error",false,consecutiveNumbers.checkConsecutiveNumber(input));
    }

    @Test
    public void testConsecutiveNumber2() {
        String input = "19,21,22,23,24,25,26,27,28";

        assertEquals("error",false,consecutiveNumbers.checkConsecutiveNumber(input));
    }
}
