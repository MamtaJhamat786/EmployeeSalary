package com.company;

public class Employee{
  private String empName;

  public Employee(String empName) {
    this.empName = empName;
  }

  public String getEmpName() {
    return empName;
  }

  public double computePay(){
    return 0;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "empName='" + empName + '\'' +
      '}';
  }
}
