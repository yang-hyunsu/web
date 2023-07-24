package springweb.a05_mvcexp.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import springweb.a05_mvcexp.a02_service.A02_FileUploadSevice;

@Controller
public class A02_FileUploadCtrl {
	@Value("${name}")
	private String name;
	@Value("${age}")
	private String age;
	@Value("${loc}")
	private String loc;
	
	@Autowired
	private A02_FileUploadSevice service;
	
	
	@GetMapping("upload01.do")
	public String upload01() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("사는곳:"+loc);
		return "WEB-INF\\views\\a05_mvcexp\\a03_fileupload.jsp";
	}
	@PostMapping("upload01.do")
	public String upload01(@RequestParam("report") MultipartFile[] mfs,						   @RequestParam("title") String title,
							Model d) {
//		for(MultipartFile mf:mfs) {
//			System.out.println("업로드파일:"+mf.getOriginalFilename());
//		}
//		System.out.println("자료명:"+title);
		d.addAttribute("msg",service.uploadFile(mfs, title));
		/*  # jsp단에 처리 내용#
    		var msg = "${msg}"
    		if(msg!=""){
    			alert(msg)
    		}
    		
    	ex) A03_FileUoadService.java
    		A03_FileUploadCtrl.java
    		로 파일이 업로드 처리되게 하세요.
		 * */
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
