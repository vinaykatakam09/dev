package com.springboot.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Employee;
import com.springboot.dao.EmpDao;

@RestController
public class EmpController {

	@Autowired
	private EmpDao dao;

	@PostMapping("insert")
	public Employee insertEmp(@RequestBody Employee emp){
		return dao.save(emp);
	}
	
	@GetMapping("get")
	public List<Employee> fetchAll(){
		List<Employee> employees=new ArrayList<>();
		dao.findAll().forEach(employees::add);
		return employees;
	}
}
