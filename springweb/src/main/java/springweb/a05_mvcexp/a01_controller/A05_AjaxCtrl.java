package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import backendWeb.z01_vo.Person;

@Controller
public class A05_AjaxCtrl {
	// ajax01.do
	@GetMapping("ajax01.do")
	public String ajax01(Model d) {
		d.addAttribute("p01", new Person("홍길동",25,"서울"));
		return "jsonView";
	}
}
