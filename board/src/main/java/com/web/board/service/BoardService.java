package com.web.board.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.web.board.dao.BoardDao;
import com.web.board.vo.Board;
import com.web.board.vo.BoardFile;
import com.web.board.vo.Member;

@Service
public class BoardService {

	
	@Autowired
	private BoardDao dao;
	public List<Board> boardList(Board sch){
		if(sch.getSubject()==null) sch.setSubject("");
		if(sch.getWriter()==null) sch.setWriter("");
		return dao.boardList(sch);
	}
	
	public Member login(Member mem) {
		return dao.login(mem);
	}
	@Value("${upload}")
	private String path;	
	public String insertBoard(Board insert) {
		int no = dao.getNo();
		insert.setNo(no);
		String msg = "업로드 성공";
		for(MultipartFile mf:insert.getReport() ) {
			String fname = mf.getOriginalFilename();
			if(fname!=null && !fname.trim().equals("")) {
				File f = new File(path+fname);
				try {
					mf.transferTo(f);
					
				} catch (IllegalStateException e) {
					msg = "예외발생1:"+e.getMessage();
				} catch (IOException e) {
					msg = "예외발생2:"+e.getMessage();
				}
				if(msg.equals("업로드 성공")) {
					dao.insertBoardFile(
						new BoardFile(no,fname,insert.getSubject()));
				}
			}
		}
		System.out.println("파일첨부내용:"+msg);
		return dao.insertBoard(insert)>0?
				"등록성공":"등록되지 않았습니다";
	}	
	public Board getDetail(int no) {
		// 조회할 때, 조회횟수 증가 처리..
		dao.readCntUp(no);
		return dao.getBoard(no);
	}
	public Board getBoard(int no) {
		return dao.getBoard(no);
	}	
	public String updateBoard(Board upt) {
		return dao.updateBoard(upt)>0?
					"수정완료":"수정되지 않았습니다.";
	}
	public String deleteBoard(int no) {
		return dao.deleteBoard(no)>0?
				"삭제완료":"삭제되지 않았습니다.";
	}

	
	

}
