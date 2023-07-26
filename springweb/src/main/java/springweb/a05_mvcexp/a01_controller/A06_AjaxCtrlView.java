package springweb.a05_mvcexp.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springweb.a05_mvcexp.z01_vo.Job;
import springweb.a05_mvcexp.a02_service.A06_JobService;
import springweb.a05_mvcexp.z01_vo.Member;

@Controller
public class A06_AjaxCtrlView {
	@Autowired
	private A06_JobService service;
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
	
	@RequestMapping("jobListData2.do")
	public ResponseEntity<List<Job>> jobList(Job sch) {
		return ResponseEntity.ok(service.getJobList(sch));
	}
	// jobInsAjax.do?job_id=ASS&job_title=개발자&min_salary=3500&max_salary=12000
	@RequestMapping("jobInsAjax.do")
	@ResponseBody
	public String insertJob(Job ins){
		service.insertJob(ins);
		return "등록성공";
	}
	// jobInsAjax2.do?job_id=ASS4&job_title=개발자4&min_salary=3500&max_salary=12000
	@RequestMapping("jobInsAjax2.do")
	public ResponseEntity<String> insertJob2(Job ins){
		return ResponseEntity.ok(service.insertJob(ins));
	}
	
	
}
