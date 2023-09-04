package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a05_mvcexp.z01_vo.Product;


@Controller
public class A12_OneMutiController {
	// http://localhost:7080/springweb/showForm.do
	@RequestMapping("showForm.do")
	public String showForm() {
		return "WEB-INF\\views\\a05_mvcexp\\a15_multiForm.jsp";
	}
	@RequestMapping("insertForm.do")
	public String addForm(Product ins) {
		
		// service.insertProdu(ins)
		
		// 서비스단에서 
		// 반복처리하는 dao insert 처리
		System.out.println("# 등록할 정보 #");
		System.out.println(ins.getPname());
		System.out.println("방의갯수:"+ins.getName().length);
		
		for(int idx=0;idx<ins.getName().length;idx++) {
			System.out.print(ins.getName()[idx]+"\t");
			System.out.print(ins.getPrice()[idx]+"\t");
			System.out.println(ins.getCnt()[idx]);
			// dao.insertRoom(ins.getProd_id(), ins.getRoom_id()[idx],.....)
		}
		// dao.insertProduct(.....  )
		
		
		return "WEB-INF\\views\\a05_mvcexp\\a15_multiForm.jsp";
	}
		
	
}
