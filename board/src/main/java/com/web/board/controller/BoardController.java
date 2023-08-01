package com.web.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.board.service.BoardService;
import com.web.board.vo.Board;
import com.web.board.vo.Member;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	// http://localhost:5050/boardList
	@RequestMapping("boardList")
	public String boardList(Board sch, Model d) {
		d.addAttribute("boardList", service.boardList(sch));
		return "a01_boardList";
	}
	// http://localhost:5050/login
	@RequestMapping("login")
	public String login(Member mem, HttpSession session, Model d) {
		String msg = "";
		if(mem.getId()!=null) { // 초기화면과 구분..			
			msg = "로그인 실패";
			Member login = service.login(mem);
			if(login!=null) {
				msg = "로그인 성공";
				session.setAttribute("mem", login);
			}
			d.addAttribute("msg", msg);
		}
		
		return "a02_login";
	}
	
}
