/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRemovalTest{
    // The following object will be used by every test.
    static final EmployeeRemoval removeEmployeeTest = new EmployeeRemoval();
    // This field will be used by every test.
    List<String> employeeListTest = new ArrayList<>();
    public EmployeeRemovalTest(){
        employeeListTest.add("John Smith");
        employeeListTest.add("Jackie Jackson");
        employeeListTest.add("Chris Jones");
        employeeListTest.add("Amanda Cullen");
        employeeListTest.add("Jeremy Goodwin");
    }

    @Test
    void createEmployeeListTest(){
        // This test will ensure the employee list is created correctly.
        assertEquals(employeeListTest, removeEmployeeTest.createEmployeeList());
    }

    @Test
    void deleteEmployeeTest(){
        // THis test will ensure the employee list is updated correctly following removal of an employee.
        List<String> removedEmployeeList = new ArrayList<>();
        removedEmployeeList.add("Jackie Jackson");
        removedEmployeeList.add("Chris Jones");
        removedEmployeeList.add("Amanda Cullen");
        removedEmployeeList.add("Jeremy Goodwin");
        assertEquals(removedEmployeeList, removeEmployeeTest.deleteEmployee("John Smith", employeeListTest));
    }
}