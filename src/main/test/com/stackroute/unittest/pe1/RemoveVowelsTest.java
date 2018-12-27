package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;

    @Before
    public void setUp() throws Exception {
        removeVowels=new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        removeVowels=null;
    }

    @Test
    public void removeVowels() {
        String input[]={"Keshav","Kumar","India"};
        String output[]={"Kshv","Kmr","nd"};

        assertEquals("error",output,removeVowels.removeVowels(input));
    }

    @Test
    public void removeVowels1() {
        String input[]={"Anjali","kali","India"};
        String output[]={"njl","kl","nd"};

        assertEquals("error",output,removeVowels.removeVowels(input));
    }



    @Test
    public void removeVowels2() {
        String input[]={"Death","is","interesting"};
        String output[]={"Dth","s","ntrstng"};

        assertEquals("error",output,removeVowels.removeVowels(input));
    }
}
