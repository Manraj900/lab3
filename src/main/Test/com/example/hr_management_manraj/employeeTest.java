package com.example.hr_management_manraj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class employeeTest {

    @Test
    void testYearlySalaryForRegularEmployee() {
        employee employee = new employee(1, "molly", "67@gmail.com", "5000");
        assertEquals(employee.getYearlySalary(), 5000 * 12);
    }

}