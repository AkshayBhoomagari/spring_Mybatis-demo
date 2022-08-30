package com.example.springmybatish2.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.springmybatish2.entity.Employee;

@Mapper
public interface EmployeeMapper {
	
	 @Select("select * from employee")
	 public List < Employee > findAll();
	 
	 @Insert("INSERT INTO employee(id, first_name, last_name,email_address) " +
		        " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
		    public int insert(Employee employee);

}
