package springweb.a02_emp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Emp;

@Controller
public class A01_EmpController {
	private A04_PreparedDao dao;
	public A01_EmpController(){
		dao = new A04_PreparedDao();
	}
	@RequestMapping("empList.do")
	public String empList(Emp sch, Model d) {
		d.addAttribute("empList", dao.getEmpList(sch));
		return "WEB-INF\\views\\a02_emp\\a01_empList.jsp";
	}
	@RequestMapping("empDetail.do")
	public String empDetail(@RequestParam("empno") int empno,
							Model d) {
		d.addAttribute("emp", dao.getEmp(empno));
		return "WEB-INF\\views\\a02_emp\\a02_emp_datail.jsp";
	}
	@RequestMapping("empInsert.do")
	public String empInsert(Emp ins) {
		if(ins.getEmpno()==0) {
			dao.insertEmp(ins);
		}
		return "WEB-INF\\views\\a02_emp\\a03_emp_insForm.jsp";
	}	
	@RequestMapping("empUpdate.do")
	public String empUpdate(Emp upt) {
		dao.updateEmp(upt);
		return "WEB-INF\\views\\a02_emp\\a02_emp_datail.jsp";
	}
	@RequestMapping("empDelete.do")
	public String empDelete(@RequestParam("empno") int empno) {
		dao.
		return "WEB-INF\\views\\a02_emp\\a02_emp_datail.jsp";
	}	
	
}
