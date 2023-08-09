package springweb.a05_mvcexp.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.a05_mvcexp.a02_service.A08_FullCalService;
import springweb.a05_mvcexp.z01_vo.Calendar;
import springweb.a05_mvcexp.z01_vo.Job;

@Controller
public class A08_FullCalController {
	@Autowired
	private A08_FullCalService service;
	// http://localhost:7080/springweb/calendar.do
	@GetMapping("calendar.do")
	public String calendar() {
		return "WEB-INF\\views\\a05_mvcexp\\a11_fullcalendar.jsp";
	}
	// http://localhost:7080/springweb/calList.do
	@RequestMapping("calList.do")
	public ResponseEntity<List<Calendar>> calList() {
		return ResponseEntity.ok(service.calList());
	}	
	// http://localhost:7080/springweb/insertCalendar.do?id=0&title=%EC%84%B8%EB%B2%88%EC%A7%B8%EC%9D%BC%EC%A0%95&writer=%EB%A7%88%EA%B8%B8%EB%8F%99&start=2023-08-03&end=2023-08-04&content=%EC%9D%BC%EC%A0%95%EB%93%B1%EB%A1%9D&backgroundColor=%23cc1400&textColor=%23ccffff&allDay=1&urlLink=
	// insertCalendar.do?title=등록2&writer=마길동&start=2023-08-01&end=2023-08-02&content=내용2&backgroundColor=blue&textColor=white&allDay=1&url=http://www.naver.com
	@RequestMapping("insertCalendar.do")
	public ResponseEntity<String> insertCalendar(Calendar ins) {
		return ResponseEntity.ok(service.insertCalendar(ins));
	}	
	@RequestMapping("calendarUpdate.do")
	public ResponseEntity<String> calendarUpdate(Calendar upt) {
		return ResponseEntity.ok(service.uptCalendar(upt));
	}	
	// http://localhost:7080/springweb/calendarDelete.do?id=10
	@RequestMapping("calendarDelete.do")
	public ResponseEntity<String> calendarDelete(@RequestParam("id") int id) {
		return ResponseEntity.ok(service.delCalendar(id));
	}		
	
}
