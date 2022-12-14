package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
  private double salary;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public SalariedEmployee(String name, LocalDate hireDate, double salary){
    this(name, hireDate);
    setSalary(salary);
  }

  public void pay(){
    System.out.printf("%s is paid hourly, for a total of %,.2f%n", getName(), getSalary());
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return super.toString() + ", salary=" + getSalary();
  }
}
