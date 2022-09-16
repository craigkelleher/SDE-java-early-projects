/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    // change array to collection: what goes inside <> is an object: a class, interface, or array type.
    //private Employee[] employees = new Employee[100]; //Array of employees
    private final Collection<Employee> employees = new ArrayList<>();
    //private int currentIndex = 0;  // for dealing with the array

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        //for (int i = 0; i < currentIndex; i++) {
        //for each employee in list of employees, and referring to each as emp, do whats in {} after ()
        for (Employee emp: employees) {
            //System.out.println(employees[i]);  // toString() automatically called
            System.out.println(emp);
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
        //for (int i = 0; i < currentIndex; i++) {
            //employees[i].work();
            emp.work();
        }
    }

    public void payEmployees(){
        //for (int i = 0; i < currentIndex; i++){
        for (Employee emp : employees){
            //employees[i].pay();
            emp.pay();
        }
    }

    // helper/business method to add an Employee to the array
    public void addEmployee(Employee emp) {
        //employees[currentIndex++] = emp;    // add something to employee array. increment index
        employees.add(emp); //add this employee to the list.
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }
}