package com.stackroute.unittest.pe1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddMatrix {

    public static void main(String[] args) {

        int rows;
        int coloums;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        rows = sc.nextInt();

        System.out.println("Enter the coloums");
        coloums = sc.nextInt();

        int[][] matrix1 = new int[rows][coloums];
        int[][] matrix2 = new int[rows][coloums];
        int[][] sum = new int[rows][coloums];

        System.out.print("Enter the 1st matrix");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < coloums; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the 2nd matrix");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < coloums; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The sum is ");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < coloums; j++) {
                System.out.print((matrix1[i][j]+matrix2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
