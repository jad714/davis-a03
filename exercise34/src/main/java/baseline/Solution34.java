package baseline;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution34{
    // Instantiate new Scanner object.
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        // Instantiate new EmployeeRemoval method.
        EmployeeRemoval removeEmployee = new EmployeeRemoval();
        List<String> employeeList;
        // Creates the list of employees.
        employeeList = (ArrayList<String>) removeEmployee.createEmployeeList();
        // Print the current list of employees (method call).
        removeEmployee.printList(employeeList);
        // Scan for user input for the employee to search for and delete.
        System.out.print("Enter an employee name to remove: ");
        String name = userInput.nextLine();
        // Call deleteEmployee to remove the employee from the list.
        employeeList = removeEmployee.deleteEmployee(name, employeeList);
        System.out.printf("%n");
        // Print the new list of employees (method call).
        removeEmployee.printList(employeeList);
    }
}
