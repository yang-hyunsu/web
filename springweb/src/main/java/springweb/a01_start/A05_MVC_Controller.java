package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// springweb.a01_start.A05_MVC_Controller
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backendWeb.z01_vo.Calculator;
@Controller
public class A05_MVC_Controller {
	// /mvc01.do
	// ?num01=30&cal= * &num02=5
	@RequestMapping("mvc01.do")
	public String mvc01(Calculator c) { //
		// Calculator : 매개변수로 선언하면, default로
		// 요청값을 처리할뿐이니라 모델객체로 선언된다. calculator
		if(c.getCal()!=null) {
			if(c.getCal().equals(" + ")) c.setTot(c.getNum01()+c.getNum02());
			if(c.getCal().equals(" - ")) c.setTot(c.getNum01()-c.getNum02());
			if(c.getCal().equals(" * ")) c.setTot(c.getNum01()*c.getNum02());
			if(c.getCal().equals(" / ")) c.setTot(c.getNum01()/c.getNum02());
		}
		
		return "WEB-INF\\views\\a01_start\\a02_mvc_view.jsp";
	}
	// /mvc02.do?name=
	@RequestMapping("mvc02.do")
	public String mvc02(@RequestParam("name") String name,
			Model d) {
		d.addAttribute("names", name+"@");
		return "WEB-INF\\views\\a01_start\\a03_mvc_view.jsp";
	}
	// /mvc03.do
	// 클릭시, +1 입력한 나이보다 증가하게 처리.
	// defaultValue : 요청값이 없을 시 default로 요청값을 설정
	@RequestMapping("mvc03.do")
	public String mvc03(@RequestParam(value="age", 
							defaultValue = "0") int age,
						 Model d) {
		d.addAttribute("ages", age+1);
		return "WEB-INF\\views\\a01_start\\a04_mvc_view.jsp";
	}
	
}
