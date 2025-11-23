package com.spring.spring_jpa.entity;

import jakarta.persistence.*;

@Entity
public class Employee{

    @Id
    @Column(name = "employee_id" ,length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(name = "employee_Name", length = 100, nullable = false)
    private String employeeName;

    @Column(name = "employee_address", length = 255)
    private String employeeAddress;

    @Column(name = "employee_salary")
    private double employeeSalary;

    public Employee() {
    }

    public Employee(int id, String employeeName, String employeeAddress, double employeeSalary) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeSalary = employeeSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
