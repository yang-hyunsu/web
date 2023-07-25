package springweb.a05_mvcexp.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import backendWeb.z01_vo.Job;
import springweb.a05_mvcexp.a02_service.A06_AjaxService;
import springweb.a05_mvcexp.z01_vo.Member;

@Controller
public class A06_AjaxCtrlView {
	@Autowired
	private A06_AjaxService service;
	// 초기 화면 호출
	@GetMapping("jobListAjax.do")
	public String jobListAjax(Member sch) {
		return "WEB-INF\\views\\a05_mvcexp\\a07_ajaxList.jsp";
		
	}
	// ajax데이터 처리
	@RequestMapping("jobListData.do")
	public String jobList(Job sch, Model d) {
		d.addAttribute("jList",service.getJobList(sch) );
		return "jsonView";
	}
}