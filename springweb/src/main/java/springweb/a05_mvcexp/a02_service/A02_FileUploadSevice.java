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
	public void uploadFile(MultipartFile[] mps, String title) {
		//  파일객체 만들기..
		for(MultipartFile mpf : mps) {
			File upFile = new File(path + 
						mpf.getOriginalFilename());
			// MultipartFile ==> File
			try {
				mpf.transferTo(upFile);
				
			} catch (IllegalStateException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println("#파일업로드에러발생#");
				System.out.println(e.getMessage());
			}
			System.out.println("파일업로드 성공");
			
			
		}
		
	}
}
