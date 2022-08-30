package com.example.springmybatish2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmybatish2.entity.Employee;
import com.example.springmybatish2.repository.EmployeeMapper;

@Controller
public class EmployeeController {

		@Autowired
		EmployeeMapper empRepo;
		
		@GetMapping("/getAll")
		public List<Employee> getAllEmp(){
			return empRepo.findAll();
		}
}
