package com.stackroute.unittest.pe1;

public class ExceptionCatch {

    public static void main(String []args) {
        try {

            int[] arr = new int[-6];
        }
        catch(NegativeArraySizeException e) {
            System.out.println(e);
        }
        try {
            int[] arr = new int[1];
            int age = arr[1];
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            String s = null;
            int length = s.length();
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
    }
}
