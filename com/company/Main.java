package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Employee> listOfEmployees = new ArrayList<Employee>();

    public static void main(String[] args) {
        Employee emp1 = new HourlyPaid("Bill", 10, 100);
        Employee emp2 = new HourlyPaid("John", 10, 200);
        Employee emp3 = new SalesCommissioned("Mamta", 20, 3000);
        Employee emp4 = new SalesCommissioned("Kris", 34, 4000);
        Employee emp5= new Executive("Donny");
        Employee emp6= new Executive("Alhaji");

        listOfEmployees.add(emp1);
        listOfEmployees.add(emp2);
        listOfEmployees.add(emp3);
        listOfEmployees.add(emp4);
        listOfEmployees.add(emp5);
        listOfEmployees.add(emp6);
        System.out.println(emp6.computePay());


        System.out.println("==Employee Data==");
        for (Employee employee : listOfEmployees){
            System.out.println("Employee Name :" + employee.getEmpName() + "\t|| Salary \t:" + employee.computePay());

        }

    }
}
