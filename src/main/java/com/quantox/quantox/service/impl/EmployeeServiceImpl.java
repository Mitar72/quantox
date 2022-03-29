package com.quantox.quantox.service.impl;

import com.quantox.quantox.Exception.ResourcenotFoundException;
import com.quantox.quantox.model.Employee;
import com.quantox.quantox.repository.EmplouyeeRepository;
import com.quantox.quantox.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmplouyeeRepository employeeRepository;


    public EmployeeServiceImpl(EmplouyeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getallEmployees() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee getEmployeeById(long id) {
        System.out.println("aaaaaaaaaaaaaaaa");
        return employeeRepository.findById(id).orElseThrow(()-> new ResourcenotFoundException("Employee","id",String.valueOf(id)));

    }
}
