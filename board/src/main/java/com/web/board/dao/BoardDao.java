package com.web.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.board.vo.Board;
import com.web.board.vo.Member;
// com.web.board.dao.BoardDao
@Mapper
public interface BoardDao {
	public List<Board> boardList(Board sch);
	public Member login(Member mem);
	public int getNo();
	public int insertBoard(Board insert);
	public Board getBoard(int no);
	public void readCntUp(int no);
	public int updateBoard(Board upt);
}
