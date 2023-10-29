package com.example.demo.postgres.springbootpostgresdocker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.postgres.springbootpostgresdocker.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
