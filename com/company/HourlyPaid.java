package com.company;

public class HourlyPaid  extends Employee{
  private double rateOfPay;
  private int weeklyHours;

  public HourlyPaid(String empName, double rateOfPay, int weeklyHours) {
    super(empName);
    this.rateOfPay = rateOfPay;
    this.weeklyHours = weeklyHours;
  }

  public double getRateOfPay() {
    return rateOfPay;
  }

  public int getWeeklyHours() {
    return weeklyHours;
  }

  @Override
  public double computePay() {
    double pay = (getRateOfPay() * getWeeklyHours());
    return pay;
  }

  @Override
  public String toString() {
    return super.toString() + "HourlyPaid{" +
      "rateOfPay=" + rateOfPay +
      ", weeklyHours=" + weeklyHours +
      '}';
  }
}
