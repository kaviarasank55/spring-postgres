package com.spring.container.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.container.dto.EmployeeDTO;
import com.spring.container.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public EmployeeDTO registerEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.registerEmployee(employeeDTO);
    }

    @GetMapping("/login")
    public EmployeeDTO loginEmployee(@RequestParam String name) {
        return employeeService.loginEmployee(name);
    }
}

