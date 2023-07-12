package springweb.a02_emp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Emp;
// springweb.a02_emp.A01_EmpController
@Controller
public class A01_EmpController {
	private A04_PreparedDao dao;
	public A01_EmpController(){
		dao = new A04_PreparedDao();
	}
	// ename=홍길동&job=사원  ==> form
	// <c:forEach var="emp" items="${empList}"/>
	@RequestMapping("empList.do")
	public String empList(Emp sch, Model d) {
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
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
	public String empInsert(Emp ins, Model d) {
		if(ins.getEmpno()!=0) {
			dao.insertEmp(ins);
			d.addAttribute("proc", "ins");//등록 처리 process 
		}
		return "WEB-INF\\views\\a02_emp\\a03_emp_insForm.jsp";
	}	
	@RequestMapping("empUpdate.do")
	public String empUpdate(Emp upt, Model d) {
		dao.updateEmp(upt);
		d.addAttribute("proc", "upt"); // 수정 처리 process
		return "WEB-INF\\views\\a02_emp\\a02_emp_datail.jsp";
	}
	@RequestMapping("empDelete.do")
	public String empDelete(@RequestParam("empno") int empno, 
							Model d) {
		dao.deleteEmp(empno);
		d.addAttribute("proc", "del"); // 삭제 처리 process
		return "WEB-INF\\views\\a02_emp\\a02_emp_datail.jsp";
	}	
	
}
