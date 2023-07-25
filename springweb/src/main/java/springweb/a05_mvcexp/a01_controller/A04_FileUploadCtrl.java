package springweb.a05_mvcexp.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a05_mvcexp.a02_service.A04_FileUploadService;
import springweb.a05_mvcexp.z01_vo.FileVo;
import springweb.a06_util.DownloadViewer;

@Controller
public class A04_FileUploadCtrl {
	
	@Autowired
	private A04_FileUploadService service;
//	@Autowired
//	private DownloadViewer down;
	
	// 초기화면 구성과 파일업로드 요청 처리를 한번에 처리..
	@RequestMapping("upload04.do")
	public String upload04(FileVo vo,  Model d) {
		if(vo.getContent()!=null) {
			d.addAttribute("msg", service.uploadFile(vo));
		}
//		System.out.println("다운로드 위치:"+down.getPath());
		d.addAttribute("rlist",service.restoreList());
		return "WEB-INF\\views\\a05_mvcexp\\a06_fileupload.jsp";
	}
	
	
}
