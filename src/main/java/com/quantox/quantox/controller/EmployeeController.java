package com.quantox.quantox.controller;

import com.quantox.quantox.model.Employee;
import com.quantox.quantox.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService emoployeeService;

    public EmployeeController(EmployeeService emoployeeService) {
        super();
        this.emoployeeService = emoployeeService;
    }

    //build create employee REST API
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
    return new ResponseEntity<>(emoployeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping()
    public List<Employee> getAllEmployees(){
        return emoployeeService.getallEmployees();
    }
    @GetMapping("{id}")
    public ResponseEntity<Employee> saveEmployee(@PathVariable("id") long id){
        return new ResponseEntity<>(emoployeeService.getEmployeeById(id), HttpStatus.CREATED);
    }

}
