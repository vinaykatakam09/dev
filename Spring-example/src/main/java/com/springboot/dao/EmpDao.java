package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.bean.Employee;

public interface EmpDao extends CrudRepository<Employee, Long>{

}
