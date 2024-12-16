package com.spring.container.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.container.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    EmployeeEntity findByName(String name);
}

