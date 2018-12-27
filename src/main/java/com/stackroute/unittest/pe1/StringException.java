package com.stackroute.unittest.pe1;



public class StringException {
    public static void main(String args[]) {

        try{
            throw new Exception("Encountered Exception");
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        finally {
            System.out.println("Entered catch block");
        }
    }
}

