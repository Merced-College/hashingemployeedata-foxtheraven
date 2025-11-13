//Xandra Quevedo
//11/6/25
//Using Hash Tables Lab

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // TODO: create your ChainingHashTable using zyBook code
        ChainingHashTable<String, Employee> table = new ChainingHashTable<>(11);

        // TODO: make an ArrayList to store duplicate Employee objects
        // ArrayList<Employee> duplicates = ...
        ArrayList<Employee> duplicates = new ArrayList<>();

        // TODO: make counters to keep track of total employees and duplicates
        int totalLoaded = 0;
        int duplicatesFound = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("Employee_data.csv"))) {
            String line = br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",", -1);
                if (cols.length < 6) continue;

                // Create the Employee object from the CSV
                Employee emp = new Employee(
                        cols[0].trim(),  // LAST NAME
                        cols[1].trim(),  // FIRST NAME
                        cols[2].trim(),  // JOB TITLE
                        cols[3].trim(),  // DEPARTMENT
                        parseMoney(cols[4]),
                        parseMoney(cols[5])
                );

                // TODO: increment your total counter
                totalLoaded++;

                // Create the hash key using last + first name
                String key = (emp.lastName + emp.firstName).toLowerCase();

                // TODO: use table.get(key) to see if an employee already exists
                // if it exists, and it’s the same department, treat it as a duplicate
                // otherwise insert into the hash table

                //

                if (table.get(key) != null) {
                    Employee existing = table.get(key);
                    if (existing.getDepartment().equals(emp.getDepartment())) {
                        duplicates.add(emp);
                        duplicatesFound++;
                    } else {
                        table.insert(key, emp);
                    }
                }
                else {
                    table.insert(key, emp);
                }

                // Example:
                // Employee existing = table.get(key);
                // if (existing != null) {
                //     if (existing.department.equalsIgnoreCase(emp.department)) {
                //         duplicates.add(emp);
                //         duplicatesFound++;
                //     } else {
                //         table.insert(key, emp);
                //     }
                // } else {
                //     table.insert(key, emp);
                // }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TODO: print total employees, duplicates found, and duplicate list
        for (int i = 0; i < duplicates.size(); i++) {
            System.out.println(duplicates.get(i).getLastName() + ", " + duplicates.get(i).getFirstName() +
                    " - " + duplicates.get(i).getDepartment());
        }
        System.out.println("Total employees loaded: " + totalLoaded);
        System.out.println("Total duplicates found: " + duplicatesFound);

        Employee newEmp = new Employee("QUEVEDO", "XANDRA", 
        "ILLUSTRATOR", "STUDENT", 500, 500);
        String key = (newEmp.lastName + newEmp.firstName).toLowerCase();
        System.err.println(newEmp);
        


    }

    // helper for cleaning up salary strings
    private static double parseMoney(String s) {
        if (s == null || s.isBlank()) return 0.0;
        try {
            return Double.parseDouble(s.replace("$", "").replace(",", "").trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
