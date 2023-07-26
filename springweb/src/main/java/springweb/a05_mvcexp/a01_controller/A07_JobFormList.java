package springweb.a05_mvcexp.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a05_mvcexp.a02_service.A06_JobService;
import springweb.a05_mvcexp.z01_vo.Job;

@Controller("jobCtrl")
public class A07_JobFormList {
	@Autowired
	private A06_JobService service;
	
	@RequestMapping("jobFormList.do")
	public String jobList(Job sch, Model d) {
		return "WEB-INF\\views\\a05_mvcexp\\a08_jobFormList.jsp";
	}
}




