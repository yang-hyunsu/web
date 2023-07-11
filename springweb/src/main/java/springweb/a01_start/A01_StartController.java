package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// springweb.a01_start.A01_StartController
@Controller
public class A01_StartController {
	// http://localhost:7080/springweb/start.do?name
	@RequestMapping("/start.do")
	public String start(@RequestParam("name") String name, 
			Model d) {
		// view단에 넘겨줄 핵심 데이터 : 모델데이터
		// jsp ==> <h3>${msg}</h3>
		d.addAttribute("msg", "안녕하세요 스프링 모델 데이터");
		return "WEB-INF\\views\\a01_start.jsp";
	}
	@RequestMapping("/start2.do")
	public String start2() {
		return "WEB-INF\\views\\a02_start.jsp";
	}	
	// 단일 요청키
	// req01.do?name=홍길동&age=25
	@RequestMapping("req01.do")
	public String req01(@RequestParam("name") String name,
			            @RequestParam("age") int age
			           ) {
		System.out.println("받은 요청값:"+name);
		System.out.println("받은 요청값:"+age);
		return ""; // webapp 하위에 index.jsp 호출
	}
	// req02.do?pname=사과&price=3000&cnt=5
	// 로그로  물건명:@@ 가격:@@ 갯수 :@@ 출력되게 하세요.
	@RequestMapping("req02.do")
	public String req02(@RequestParam("pname") String pname,
                        @RequestParam("price") int price,
                        @RequestParam("cnt") int cnt
	                   ) {
		System.out.println("물건명:"+pname);
		System.out.println("가격:"+price);
		System.out.println("갯수:"+cnt);
		return ""; 
	}
	// req03.do?names=홍길동&names=김길동&names=신길동
	@RequestMapping("req03.do")
	public String req02(
			           	@RequestParam("names") 
			           		String[] names 
	                   ) {
		System.out.println("이름1:"+names[0]);
		System.out.println("이름2:"+names[1]);
		System.out.println("이름3:"+names[2]);
		return ""; 
	}	
	
}
