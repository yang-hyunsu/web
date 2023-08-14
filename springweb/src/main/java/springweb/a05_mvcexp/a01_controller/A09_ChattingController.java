package springweb.a05_mvcexp.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springweb.a06_util.ChatHandler;

@Controller
public class A09_ChattingController {
	// http://192.168.10.99:7080/springweb/chatting.do
	@GetMapping("chatting.do")
	public String chatting() {
		return "WEB-INF\\views\\a05_mvcexp\\a12_chatting.jsp";
	}
	// A09_ChattingController.java
	// getChatMem.do
	@Autowired
	private ChatHandler chatHandler;
	// ajax로 현재 접속한 인원 확인
	@GetMapping("getChatMem.do")
	public ResponseEntity<List<String>> getChatMem() {
		return ResponseEntity.ok(chatHandler.getIds());
	}
}







