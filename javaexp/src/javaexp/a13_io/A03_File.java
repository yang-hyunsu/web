package javaexp.a13_io;

import java.io.File;
import java.io.IOException;

public class A03_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 파일 입력
		1. 데이터는 코드를 통해서 전기적 메모리에 할당해서 
		전송/출력할 수 있지만, 하드웨어적으로 저장하여 처리할 수도 
		있는데, 이렇게 하드웨어적으로 저장해주는 객체가 File 객체이다.
		2. 파일 객체의 처리하는 내용
			1) 일반 데이터를 물리적이고 장기간 저장 가능
			2) 장기간 저장한 데이터를 일반 데이터로 호출 사용
			3) 특정한 파일을 저장 처리
			4) 특정한 경로를 저장 처리
			5) 파일의 메서드로 확인할 수 있는 데이터
				파일의 크기, 파일 이름, 파일의 속성(쓰기/읽기/권한)
				파일의 생성/삭제
				디렉토리의 생성, 디렉토리에 포함된 파일 객체 가져오기
				
		 * */
		// 1. 같은 폴드에 있는 파일 객체 생성
		File f01 = new File("C:\\Users\\user\\git\\web2\\javaexp\\src\\javaexp\\a13_io\\z01_data.txt");
		System.out.println("물리적 파일존재여부:"+f01.exists());
		// 2. 파일 생성(물리적 파일)
		File f02 = new File("C:\\Users\\user\\git\\web2\\javaexp\\src\\javaexp\\a13_io\\z03_data.txt");
		// 3. 폴드 생성
		String path = "C:\\Users\\user\\git\\web2\\javaexp\\src\\javaexp\\a13_io\\";
		File f03 = new File(path+"a02_fold");
		File f04 = new File(path+"a03_fold");
		File f05 = new File(path+"a04_fold");
		File f06 = new File(path+"a05_fold");
		try {
			// io가 일어나기에 필수 예외 처리
			f02.createNewFile();
			// 경로를 만들때, 사용하는 메서드..
			f03.mkdir();
			f04.mkdir();
			f05.mkdir();
			f06.mkdir();
			// ex) A05_DirFile.java
			// javaexp.a13_io.a01_fold 밑에 
			// 		a01~a09 폴드 생성되게 처리하세요.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
