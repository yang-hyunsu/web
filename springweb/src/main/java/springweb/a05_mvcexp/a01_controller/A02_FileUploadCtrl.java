package springweb.a05_mvcexp.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class A02_FileUploadCtrl {
	@GetMapping("upload01.do")
	public String upload01() {
		return "WEB-INF\\views\\a05_mvcexp\\a03_fileupload.jsp";
	}
	@PostMapping("upload01.do")
	public String upload01(@RequestParam("report") MultipartFile[] mfs,						   @RequestParam("title") String title) {
		for(MultipartFile mf:mfs) {
			System.out.println("업로드파일:"+mf.getOriginalFilename());
		}
		System.out.println("자료명:"+title);
		return "WEB-INF\\views\\a05_mvcexp\\a03_fileupload.jsp";
	}
	//
	@GetMapping("upload02.do")
	public String upload02() {
		return "WEB-INF\\views\\a05_mvcexp\\a04_fileupload.jsp";
	}
	@PostMapping("upload02.do")
	public String upload02(@RequestParam("image") MultipartFile[] images,
			               @RequestParam("img01") String img01 ) {
		for(MultipartFile mp:images) {
			System.out.println("이미지:"+mp.getOriginalFilename());
		}
		System.out.println("자료명:"+img01);
		return "WEB-INF\\views\\a05_mvcexp\\a04_fileupload.jsp";
	}	
	
	
	
	
}
