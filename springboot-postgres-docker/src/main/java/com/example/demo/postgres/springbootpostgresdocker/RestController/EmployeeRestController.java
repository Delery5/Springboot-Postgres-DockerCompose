package com.example.demo.postgres.springbootpostgresdocker.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.postgres.springbootpostgresdocker.entity.Employee;
import com.example.demo.postgres.springbootpostgresdocker.repos.EmployeeRepository;


@RestController
public class EmployeeRestController {
@Autowired
EmployeeRepository repository;

@RequestMapping(value = "/employees/", method = RequestMethod.GET)
public List<Employee> getEmployee() {
	return repository.findAll();
}

@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
public Employee getEmployee(@PathVariable("id") long id) {
	return repository.findById(id).get();
}

@RequestMapping(value = "/employees/", method = RequestMethod.POST)
public Employee createEmployee(@RequestBody Employee employee) {
	return repository.save(employee);
}
@RequestMapping(value = "/employees/", method = RequestMethod.PUT)
public Employee updateEmployee(@RequestBody Employee employee) {
	return repository.save(employee);
}

@RequestMapping(value = "/accounts/{id}", method = RequestMethod.DELETE)
public void deleteAccount(@PathVariable("id") long id) {
	repository.findById(id);
}
}
