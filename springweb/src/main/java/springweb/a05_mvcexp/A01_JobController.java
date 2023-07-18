package springweb.a05_mvcexp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class A01_JobController {

	@Autowired
	private A02_JobService service;
	
	// http://localhost:7080/springweb/jobList.do
	@RequestMapping("jobList.do")
	public String jobList(@RequestParam(value = "job_id", 
			defaultValue = "") String job_id, Model d) {
		d.addAttribute("jobList", service.getJobs(job_id));
		
		return "WEB-INF\\views\\a05_mvcexp\\a01_jobList.jsp";
	}
	
}
