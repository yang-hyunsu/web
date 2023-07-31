package com.web.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// 15:10~
@Controller
public class A01_Controller {
	// http://localhost:5050/start
	@GetMapping("start")
	public String start() {
		return "a01_exp/a01_start";
	}
	// http://localhost:5050/bootstrap
	@GetMapping("bootstrap")
	public String a02_bootstrapTmp() {
		return "a01_exp/a02_bootstrapTmp";
	}
	// ex) http://localhost:5050/a03_exp
	//     안녕하세요 시작입니다.
	//     a03_exp.jsp 호출..
	// http://localhost:5050/a03_exp
	@GetMapping("a03_exp")
	public String a03_exp() {
		return "a01_exp/a03_exp";
	}	
	// http://localhost:5050/a04_model
	@GetMapping("a04_model")
	public String a04_model(Model d) {
		d.addAttribute("msg", "안녕하세요");
		return "a01_exp/a04_model";
	}	
	// 
	
	
}
