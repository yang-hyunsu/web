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
	/// ex) A02_CallController.java ==> 
	//           주의) container(xml) 등록,
	//                @Controller 클래스 상단 선언
	//      기능 메서드 추가하고
	//      http://localhost:7080/springweb/callCtrl1.do
	//      모델데이터 greet : "hello spring"
	//      a02_callView.jsp를 호출해서 모델 데이터 출력
	//      
	
}
