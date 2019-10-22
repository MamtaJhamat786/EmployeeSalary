package com.company;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases {
  @Test
  public void testHourPayComputePay(){
    Employee employee = new HourlyPaid("John", 5, 125);
    double expectedResults = 625;
    assertEquals(expectedResults, employee.computePay());
  }

  @Test
  public void testSalesCommissionedComputePay(){
    Employee employee = new SalesCommissioned("Lennon", 10, 43535);
    double expectedResults = 4353.5;
    assertEquals(expectedResults, employee.computePay());
  }

  @Test
  public void testExecutiveComputePay(){
    Employee employee = new Executive("Brown");
    double expectedResults = 1405.0;
    assertEquals(expectedResults, employee.computePay());
  }
}
