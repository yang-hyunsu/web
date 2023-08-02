package com.web.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}


	
