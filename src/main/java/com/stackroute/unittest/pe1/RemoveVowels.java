package com.stackroute.unittest.pe1;

import java.util.List;
import java.util.ArrayList;
public class RemoveVowels {

    public String [] removeVowels(String []input) {
        String []output = new String[input.length];
        for(int i=0;i<input.length;i++) {
            output[i]= input[i].replaceAll("[aeiouAEIOU]", "");
        }
        return output;
    }

}
