/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRemoval{

    public void printList(List<String> employeeList){
        // Prints the current array list.
        System.out.println("There are " + employeeList.size() + " employees:");
        // Loop accesses each element of the employeeList.
        for(int i=0;i<employeeList.size();i++){
            System.out.printf("%s%n", employeeList.get(i));
        }
        System.out.printf("%n");
    }

    public List<String> createEmployeeList(){
        // Create the list of employee names here.
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");
        return employeeList;
    }

    public List<String> deleteEmployee(String name, List<String> employeeList){
        // Deletes an employee from the list matching "name". Returns the updated list.
        int count = 0;
        while(count<employeeList.size()){
            // Making the comparison case-insensitive.
            if(name.equalsIgnoreCase(employeeList.get(count))){
                employeeList.remove(count);
                count-=1;
            }
            count++;
        }
        return employeeList;
    }
}
