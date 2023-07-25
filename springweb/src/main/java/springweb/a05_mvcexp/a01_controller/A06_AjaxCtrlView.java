package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springweb.a05_mvcexp.z01_vo.Member;

@Controller
public class A06_AjaxCtrlView {
	// 초기 화면 호출
	@GetMapping("memListAjax.do")
	public String memListAjax(Member sch) {
		return "WEB-INF\\views\\a05_mvcexp\\a07_ajaxList.jsp";
		
	}
	
	
	// ajax데이터 처리
}
