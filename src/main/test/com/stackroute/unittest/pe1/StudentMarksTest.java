package com.stackroute.unittest.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    private static StudentMarks studentMarks;


    @BeforeClass
    public static void setup() {
        studentMarks = new StudentMarks();
    }

    @AfterClass
    public static void teardown() {
        studentMarks = null;
    }

    @Test
    public void checkMarksPositiveResult() {

        //Intializing student marks
        int[] marks = {2,4};
        int[] marksOne = {2,4,20};
        int[] marksTwo = {2,20,40,60};
        int[] marksThree = {2,40,60,80,90};
        int[] marksFour = {2,40,60,80,90,100};

        assertEquals(true,studentMarks.checkMarks(2, marks));
        assertEquals(true,studentMarks.checkMarks(3, marksOne));
        assertEquals(true,studentMarks.checkMarks(4, marksTwo));
        assertEquals(true,studentMarks.checkMarks(5, marksThree));
        assertEquals(true,studentMarks.checkMarks(6, marksFour));
    }

    @Test
    public void checkMarksNegativeResult() {
        int[] marks = {2,400};
        int[] marksOne = {2,4,200};
        int[] marksTwo = {2,20,40,600};
        int[] marksThree = {-2,40,60,80,90};
        int[] marksFour = {-2,40,60,80,90,-100};

        assertEquals(false,studentMarks.checkMarks(2, marks));
        assertEquals(false,studentMarks.checkMarks(3, marksOne));
        assertEquals(false,studentMarks.checkMarks(4, marksTwo));
        assertEquals(false,studentMarks.checkMarks(5, marksThree));
        assertEquals(false,studentMarks.checkMarks(6, marksFour));

    }
}
