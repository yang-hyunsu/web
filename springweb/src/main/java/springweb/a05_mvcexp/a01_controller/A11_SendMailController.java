package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import springweb.a05_mvcexp.z01_vo.MailSender;

@Controller
public class A11_SendMailController {
	// 초기화면 로딩
	@GetMapping("mailForm.do")
	public String mailForm() {
		return "WEB-INF\\views\\a05_mvcexp\\a14_mailForm.jsp";
	}
	
	
	// 메일발송 처리(service단 처리)
	@PostMapping("mailSend.do")
	public String mailSend(MailSender mail, Model d) {
		
		return "WEB-INF\\views\\a05_mvcexp\\a14_mailForm.jsp";
	}
}
