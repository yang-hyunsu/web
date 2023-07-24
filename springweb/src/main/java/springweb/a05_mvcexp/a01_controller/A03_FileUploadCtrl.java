package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class A03_FileUploadCtrl {
	@GetMapping("uploadExp03.do")
	public String uploadExp03() {
		return "WEB-INF\\views\\a05_mvcexp\\a05_fileupload.jsp";
	}
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
