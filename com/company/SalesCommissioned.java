package com.company;

public class SalesCommissioned  extends Employee {
  private double percentageCommission;
  private double totalSales;

  public SalesCommissioned(String empName, double percentageCommission, double totalSales) {
    super(empName);
    this.percentageCommission = percentageCommission;
    this.totalSales = totalSales;
  }

  public double getPercentageCommission() {
    return percentageCommission;
  }

  public double getTotalSales() {
    return totalSales;
  }

  @Override
  public double computePay() {
    double pay = ((getPercentageCommission()/100) * getTotalSales());
    return pay;
  }

  @Override
  public String toString() {
    return super.toString() + "SalesCommissioned{" +
      "percentageCommission=" + percentageCommission +
      ", totalSales=" + totalSales +
      '}';
  }
}