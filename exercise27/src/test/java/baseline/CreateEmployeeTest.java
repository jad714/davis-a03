/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateEmployeeTest {

    @Test
    void validateInputTestAllInputsGood(){
        // A test written for this Class should be completed simply through the validateInputTest method.
        // This test ensures none of the private methods pass any incorrect output to validateInput, and
        // that validateInput produces the correct output in this case.
        CreateEmployee employeeTest = new CreateEmployee();
        String[] testArray = {"Al","Joe","34714","AB-4321"};
        assertEquals("There were no errors found.\n", employeeTest.validateInput(testArray));
    }

    @Test
    void validateInputTestFirstNameProblems(){
        // This test ensures that the First Name private method works properly and concatenates.
        CreateEmployee employeeTest = new CreateEmployee();
        String[] testArray1 = {" ", "Joe", "34714", "AB-4321"};
        String[] testArray2 = {"j", "Joe", "34714", "AB-4321"};
        String[] testArray3 = {"123!", "Joe", "34714", "AB-4321"};
        assertEquals("The first name must be filled in.\n", employeeTest.validateInput(testArray1));
        assertEquals("The first name must be at least 2 characters long.\n", employeeTest.validateInput(testArray2));
        assertEquals("The first name must not contain numbers or special characters.\n", employeeTest.validateInput(testArray3));
    }

    @Test
    void validateInputTestLastNameProblems(){
        // This test ensures all possible outputs for the last name private method produce the correct output.
        CreateEmployee employeeTest = new CreateEmployee();
        String[] testArray1 = {"Joe", " ", "34714", "AB-4321"};
        String[] testArray2 = {"Joe", "d", "34714", "AB-4321"};
        String[] testArray3 = {"Joe", "123!", "34714", "AB-4321"};
        assertEquals("The last name must be filled in.\n", employeeTest.validateInput(testArray1));
        assertEquals("The last name must be at least 2 characters long.\n", employeeTest.validateInput(testArray2));
        assertEquals("The last name must not contain numbers or special characters.\n", employeeTest.validateInput(testArray3));
    }

    @Test
    void validateInputTestZipProblems(){
        // This test ensures both conditions for outputting the required string through the zip private method produce the correct output.
        CreateEmployee employeeTest = new CreateEmployee();
        String[] testArray1 = {"Joe", "Walsh", "3471", "AB-4321"};
        String[] testArray2 = {"Joe", "Walsh", "appl!", "AB-4321"};
        assertEquals("The zipcode must be a 5 digit number.\n", employeeTest.validateInput(testArray1));
        assertEquals("The zipcode must be a 5 digit number.\n", employeeTest.validateInput(testArray2));
    }

    @Test
    void validateInputTestEmpIDProblems(){
        // This test ensures all conditions for outputting the required string through the employee ID private method produce the correct output.
        CreateEmployee employeeTest = new CreateEmployee();
        String[] testArray1 = {"Joe", "Walsh", "34714", "A1-4321"};
        String[] testArray2 = {"Joe", "Walsh", "34714", "ABa4321"};
        String[] testArray3 = {"Joe", "Walsh", "34714", ""};
        assertEquals("The employee ID must be in the format of AA-1234.\n", employeeTest.validateInput(testArray1));
        assertEquals("The employee ID must be in the format of AA-1234.\n", employeeTest.validateInput(testArray2));
        assertEquals("The employee ID must be in the format of AA-1234.\n", employeeTest.validateInput(testArray3));
    }

    @Test
    void validateInputTestAllInputsBad(){
        // This test checks the ability of the method to concatenate each String to the output.
        CreateEmployee employeeTest = new CreateEmployee();
        String[] testArray = {" "," "," "," "};
        assertEquals("The first name must be filled in.\nThe last name must be filled in.\nThe employee ID must be in the format of AA-1234.\nThe zipcode must be a 5 digit number.\n", employeeTest.validateInput(testArray));
    }

}