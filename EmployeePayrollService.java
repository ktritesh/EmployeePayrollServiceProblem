package com.bridgelabz.employeepayrollservice;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    List<EmployeePayrollData> employeePayrollDataList;

    // assume as repository
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollData) {
        this.employeePayrollDataList = employeePayrollData;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> payrollDataList = new ArrayList<>();
        EmployeePayrollService service = new EmployeePayrollService(payrollDataList);

        Scanner input = new Scanner(System.in);
        service.readEmpData(input);
        service.writeEmpData();
    }

    private void writeEmpData() {
        System.out.println("Employee payroll data: \n"+ employeePayrollDataList);
    }

    public void readEmpData(Scanner input){
        System.out.println("Enter Employee Id: ");
        int empID = input.nextInt();

        System.out.println("Enter Employee Name: ");
        String empName = input.next().concat(input.nextLine());

        System.out.println("Enter the employee salary: ");
        double empSalary = input.nextDouble();

        EmployeePayrollData emp = new EmployeePayrollData(empID,empName, empSalary);

        employeePayrollDataList.add(emp);
    }

}
