package com.example.springmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class EmployeeController {
	
	
	@GetMapping("/listEmp")
	public String index() {
		return "listEmp";
	}
}
