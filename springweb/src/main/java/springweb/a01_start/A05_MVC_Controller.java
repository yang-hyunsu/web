package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
// springweb.a01_start.A05_MVC_Controller
import org.springframework.web.bind.annotation.RequestMapping;

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

	//WEB-INF\views\a01_start\a02_mvc_view.jsp
}
