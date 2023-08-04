package com.web.board.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.board.model.Employee;
import com.web.board.service.A01_Service;
import com.web.board.vo.Person;

@RestController
public class A02_RestController {
	// http://localhost:5050/start3
	@GetMapping("start3")
	public Person start3() {
		return new Person("홍길동",25,"서울");
	}		
	
	// http://localhost:5050/start2
	@GetMapping("start2")
	public String start2() {
		return "안녕^^";
	}	

	@Autowired
	private A01_Service service;
	
	// http://localhost:5050/a07_empList
	@RequestMapping("a07_empList")
	public List<Employee> a06_empList() {
		return service.findAll();
	}	
	// http://localhost:5050/a07_empList?ename=A&job=A
	@RequestMapping("a08_empList")
	public List<Employee> a08_empList(Employee sch) {
		return service.findByNameAndJob(sch);
	}	
	// http://localhost:5050/a09_emp?empno=7369
	@RequestMapping("a09_emp")
	public Optional<Employee> a09_emp(@RequestParam("empno") Long empno) {
		return service.findById(empno);
	}		
	
}


	
