package springweb.a05_mvcexp.a02_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a05_mvcexp.a03_dao.A04_FileUploadDao;
import springweb.a05_mvcexp.z01_vo.FileVo;
import springweb.a05_mvcexp.z01_vo.Restore;

@Service
public class A04_FileUploadService {
	@Autowired
	private A04_FileUploadDao dao;
	
	public String uploadFile(FileVo vo) {
		String msg = "업로드 성공";
		
		dao.insFileInfo(new Restore(2, "파일내용", "파일명"));
		return msg;
	}
}
