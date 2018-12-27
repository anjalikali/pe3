package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeEmailTest {

    @Test
    public void addEmployeeEmailId() {
        EmployeeEmail employeeEmail = new EmployeeEmail();
        String result = employeeEmail.addEmployeeEmailId("xam@gmail.com");
        assertEquals("success",result);
    }


}