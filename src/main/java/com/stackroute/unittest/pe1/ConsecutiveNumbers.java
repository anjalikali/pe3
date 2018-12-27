package com.stackroute.unittest.pe1;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveNumbers {
    String input = "";

    public boolean checkConsecutiveNumber(String input) {
        this.input = input;
        String[] numbers = this.input.split(",");
        List<Integer> number = new ArrayList<Integer>();
        for(String s:numbers) {
            number.add(Integer.parseInt(s));
        }

        for(int i = 1; i < (number.size()-1); i++) {
            if((number.get(i-1) + number.get(i+1) != (2 * number.get(i)))) {
                return false;
            }
        }
        return true;
    }
}
