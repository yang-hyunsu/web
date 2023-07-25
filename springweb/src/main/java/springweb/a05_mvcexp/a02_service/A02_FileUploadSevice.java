package springweb.a05_mvcexp.a02_service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class A02_FileUploadSevice {
	
	@Value("${user.upload}")
	String path;
	public String uploadFile(MultipartFile[] mps, String title) {
		String msg="업로드 성공";
		//  파일객체 만들기..
		for(MultipartFile mpf : mps) {
			File upFile = new File(path + 
						mpf.getOriginalFilename());
			try {
				// 실제 파일이 생성
				mpf.transferTo(upFile);
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
				msg="업로드 에러:"+e.getMessage()+"\n";
			} catch (IOException e) {
				System.out.println("#파일업로드에러발생#");
				System.out.println(e.getMessage());
				msg="업로드 에러:"+e.getMessage()+"\n";
			}
		}
		return msg;
	}
}
