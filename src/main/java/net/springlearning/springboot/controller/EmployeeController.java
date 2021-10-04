package net.springlearning.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.springlearning.springboot.model.Employee;
import net.springlearning.springboot.repository.EmployeeRepository;

@RestController
@RequestMapping("api/V1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRespository;
	
	//get all employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeRespository.findAll();
	}
	
}
