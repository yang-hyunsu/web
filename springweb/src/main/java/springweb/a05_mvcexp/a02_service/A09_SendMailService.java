package springweb.a05_mvcexp.a02_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import springweb.a05_mvcexp.z01_vo.MailSender;

@Service
public class A09_SendMailService {
	// container에서 선언한 객체 호출.
	// required = false : 객체가 생성되지 않더라도 에러 발생하지 않게 처리..
	@Autowired(required = false)
	private JavaMailSender sender;
	
	// 메일 발송 메서드
	public String sendMail(MailSender email) {
		
		return "";
	}
	
}
