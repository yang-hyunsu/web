package springweb.a05_mvcexp.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import backendWeb.z01_vo.Emp;
import backendWeb.z01_vo.Person;
import backendWeb.z01_vo.Product;
import springweb.a03_empMVC.A02_EmpService;
import springweb.a05_mvcexp.a02_service.A01_MemberService;
import springweb.a05_mvcexp.z01_vo.Member;

@Controller
public class A05_AjaxCtrl {
	// ajax01.do
	@GetMapping("ajax01.do")
	public String ajax01(Model d) {
		d.addAttribute("p01", new Person("홍길동",25,"서울"));
		return "jsonView";
	}
	@GetMapping("ajax02.do")
	public String ajax02(Model d) {
		// Member(String id, String pass, String name, String auth, int point) 
		d.addAttribute("mem", 
		new Member("himan","7777","홍길동","관리자",10000));
		return "jsonView";
	}
	@Autowired
	private A02_EmpService service;
	
	@GetMapping("ajax03.do")
	public String ajax03(Model d) {
		d.addAttribute("empList", 
				service.getEmpList(new Emp()));
		return "jsonView";
	}
	// ex) 회원정보(Member) 리스트 가져와서 json데이터
	//     처리 출력하세요..
	@Autowired
	private A01_MemberService service2;
	@GetMapping("ajax04.do")
	public String ajax04(Model d) {
		d.addAttribute("memList", service2.memberList(new Member()));
		return "jsonView";
	}
		
	
	@GetMapping("ajax05.do")
	@ResponseBody
	public String ajax05() {
		return "hello";
	}
	@GetMapping("ajax06.do")
	@ResponseBody
	public String ajax06() {
		Gson g = new Gson();
		
		return g.toJson(new Person("hong",25,"busan"));
	}
	// ex) ajax07.do
	//     Good day!! 출력
	@GetMapping("ajax07.do")
	@ResponseBody
	public String ajax07() {
		return "Good day!!";
	}
	//     ajax08.do
	//     Gson을 이용해 물건 Product정보 출력..
	@GetMapping("ajax08.do")
	@ResponseBody
	public String ajax08() {
		Gson g = new Gson();
		
		return g.toJson(new Product("apple",1500,5));
	}
	// ajax09.do?name=사과&price=1200&cnt=3
	@GetMapping("ajax09.do")
	public ResponseEntity<Product> ajax09(Product prod){
		
		return ResponseEntity.ok(prod); 
	}
	@GetMapping("ajax10.do")
	public ResponseEntity<Emp> ajax10(Emp sch){
		return ResponseEntity.ok(sch); 
	}	
	@GetMapping("ajax11.do")
	public ResponseEntity<List<Member>> ajax11(Member sch){
		return ResponseEntity.ok(service2.memberList(sch)); 
	}	
	
	
	
	
}
