package com.stackroute.unittest.pe1;

public class ChessBoard {

    public static String printChessBoard() {
        String output="";
        for(int i=0;i<8;i++) {
            if(i%2==0) {
                output+=  "WW|BB|WW|BB|WW|BB|WW|BB|"+"\n";

            }
            else {
                output+="BB|WW|BB|WW|BB|WW|BB|WW|"+"\n";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(printChessBoard());
    }

}
