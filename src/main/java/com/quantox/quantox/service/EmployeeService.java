package com.quantox.quantox.service;

import com.quantox.quantox.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getallEmployees();
    Employee getEmployeeById(long id);
}
