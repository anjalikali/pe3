package com.stackroute.unittest.pe1;

public class StudentMarks {

    int noOfStudents ;
    int []stuGrades = new int[noOfStudents];


    public boolean checkMarks(int noOfStudents,int[] stuGrades) {
        this.noOfStudents = noOfStudents;
        this.stuGrades = stuGrades;
        for(int i = 0; i < noOfStudents; i++) {
            if(stuGrades[i] < 0 || stuGrades[i] > 100) {
                return false;
            }
        }
        return true;
    }
}
