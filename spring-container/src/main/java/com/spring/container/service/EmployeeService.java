package com.spring.container.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.container.dto.EmployeeDTO;
import com.spring.container.entity.EmployeeEntity;
import com.spring.container.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDTO registerEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employeeDTO.getName());
        employeeEntity.setDepartment(employeeDTO.getDepartment());
        employeeEntity.setRole(employeeDTO.getRole());
        employeeRepository.save(employeeEntity);
        return employeeDTO;
    }

    public EmployeeDTO loginEmployee(String name) {
        EmployeeEntity employeeEntity = employeeRepository.findByName(name);
        if (employeeEntity != null) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(employeeEntity.getId());
            employeeDTO.setName(employeeEntity.getName());
            employeeDTO.setDepartment(employeeEntity.getDepartment());
            employeeDTO.setRole(employeeEntity.getRole());
            return employeeDTO;
        }
        return null;
    }
}

