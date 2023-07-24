package springweb.a05_mvcexp.a01_controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class A03_FileUploadCtrl {
	@GetMapping("uploadExp03.do")
	public String uploadExp03() {
		System.out.println("공통경로:"+path);
		System.out.println("데이터베이스:"+jdbc);
		
		return "WEB-INF\\views\\a05_mvcexp\\a05_fileupload.jsp";
	}
	@Value("${user.upload}")
	private String path;
	@Value("${jdbc.url}")
	private String jdbc;
	
	@PostMapping("uploadExp03.do")
	public String uploadExp03(@RequestParam("report01") MultipartFile[] mpfs,
							  @RequestParam("title01") String title01 
							  ) {
		System.out.println("자료명:"+title01);
		for(MultipartFile mf:mpfs) {
			System.out.println("파일:"+mf.getOriginalFilename());
		}
		
		return "WEB-INF\\views\\a05_mvcexp\\a05_fileupload.jsp";
	}	
}
