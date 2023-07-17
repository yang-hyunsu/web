package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// springweb.a01_start.A06_ReqModelController
// xml에 등록부터..
@Controller
public class A06_ReqModelController {
	// form 형태의 요청값 => 모델데이터 처리 ==> 화면단에 출력
	// url패턴을 중복이 되지 않아야 한다.
	// GetMapping : get방식으로만 호출할 때, 활용하는 형식
	@GetMapping("form01.do")
	public String showInfo() {
		System.out.println("호출1");
		return "WEB-INF\\views\\a01_start\\a08_req_model_form.jsp";
	}
	// Post방식으로 호출 하는 한 형태..
	// form에 명식적으로 속성 method="post"
	@PostMapping("form01.do")
	public String showInfo2(@RequestParam("title") String title,
			                Model d) {
		System.out.println("호출2");
		System.out.println("요청값 title:"+title);
		d.addAttribute("m01", title+", 모델데이터^^");
		return "WEB-INF\\views\\a01_start\\a08_req_model_form.jsp";
	}
	// ex1) get  form2.do
	//      post form2.do
	///  화면 : a09_form.jsp
	//         좋아하는 연예인 이름:[  ][등록]
	/////      모델데이터 : (@@@는 좋아하는 연예인이네요) 모델데이터
	
	
	
	
	
	
}
