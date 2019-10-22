package com.company;

public class Executive  extends Employee {
  private static int [] salaryIncrementalScalePoints = {400, 350 , 300, 205, 150};
  private double executivepay = 0;

  public Executive(String empName) {
    super(empName);
  }

  public double getExecutivepay() {
    if (this.executivepay != 0){
      return executivepay;
    }else {
      System.out.println("Please compute Executive salary");
      System.out.println("executing executive pay ...");
      computePay();
      return -1;
    }
  }

  public static int[] getSalaryIncrementalScalePoints() {
    return salaryIncrementalScalePoints;
  }
  @Override
  public double computePay() {
    double temp = 0;
    for (int point : getSalaryIncrementalScalePoints()){
      temp += point;
    }
    this.executivepay = temp;
    return this.executivepay;
  }

  @Override
  public String toString() {
    return super.toString() +  "Executive{" +
      "executivepay=" + executivepay +
      '}';
  }
}
