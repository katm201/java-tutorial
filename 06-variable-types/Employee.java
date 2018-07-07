import java.io.*;
public class Employee {
  // instance variable - visible to all child classes
  public String name;
  // instance variable - only visible to Employee class
  private double salary;

  // name variable is assigned in the constructor
  public Employee (String empName) {
    name = empName;
  }

  // salary variable is assigned in the method
  public void setSalary (double empSal) {
    salary = empSal;
  }

  public void printEmp() {
    System.out.println("name: " + name);
    System.out.println("salary: " + salary);
  }

  public static void main(String[] args) {
    Employee empOne = new Employee("Katherine");
    empOne.printEmp(); // prints salary of 0.0
    empOne.setSalary(100000);
    empOne.printEmp(); // prints salary of 100000.0
  }
}