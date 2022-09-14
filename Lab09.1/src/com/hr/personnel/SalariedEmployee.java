package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee implements TaxPayer {
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

  @Override
  public void payTaxes(){
    double taxes = getSalary() * SALARIED_TAX_RATE;
    System.out.println(getName()+ taxes );
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
