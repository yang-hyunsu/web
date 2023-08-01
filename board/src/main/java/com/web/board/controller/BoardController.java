package com.web.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.board.service.BoardService;
import com.web.board.vo.Board;

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
	@RequestMapping("login")
	public String login() {
		return "a02_login";
	}
	
}
