package com.web.board.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.board.member.entity.Member;
import com.web.board.security.auth.MemberPrincipalDetails;
import com.web.board.service.BoardService;
import com.web.board.vo.Board;
import com.web.board.vo.BoardSch;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	// http://localhost:5050/board/boardList
	// ModelAttribute : 요청값과 모델데이터를 동시에 처리..
	@RequestMapping("/board/boardList")
	public String boardList(@ModelAttribute("sch") BoardSch sch,  
							@AuthenticationPrincipal MemberPrincipalDetails memberPrincipalDetails,
							HttpSession session, 
							Model d) {
		Member member = memberPrincipalDetails.getMember();
		if(member!=null) session.setAttribute("member", member);
		d.addAttribute("boardList", service.boardList(sch));
		return "a01_boardList";
	}

	// http://localhost:5050/boardInsertFrm
	// 글등록화면 로딩/답글화면 로딩
	@RequestMapping("/board/boardInsertFrm")
	public String boardInsertFrm(Board ins) {
		return "a03_boardInsert";
	}	
	
	// http://localhost:5050/boardInsert
	// 글등록 DB 처리
	@RequestMapping("/board/boardInsert")
	public String boardInsert(Board ins, Model d) {
		d.addAttribute("msg", service.insertBoard(ins));
		return "a03_boardInsert";
	}
	// http://localhost:5050/boardDetail?no=0
	@GetMapping("/board/boardDetail")
	public String boardDetail(@RequestParam("no") int no, 
								Model d) {
		d.addAttribute("board", service.getDetail(no));
		return "a04_boardDetail";
	}
	// boardUpdate
	@PostMapping("/board/boardUpdate")
	public String boardUpdate(Board upt,Model d){
		d.addAttribute("msg", service.updateBoard(upt));
		d.addAttribute("board",service.getBoard(upt.getNo()));
		
		return "a04_boardDetail";
	}  
	// boardDelete?no=4
	@GetMapping("/board/boardDelete")
	public String boardDelete(@RequestParam("no") int no,
							   Model d) {
		d.addAttribute("msg", service.deleteBoard(no));
		return "a04_boardDetail"; 
	}	
	// download.do?fname="+
	@RequestMapping("/board/download.do")
	public String download(@RequestParam("fname") 
			String fname, Model d) {
		d.addAttribute("downloadFile", fname);
		System.out.println("호출!!!!");
		return "downloadViewer";
	}	
}
