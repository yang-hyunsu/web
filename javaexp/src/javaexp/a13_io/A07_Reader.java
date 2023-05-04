package javaexp.a13_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class A07_Reader {
	/*
	# 파일에 있는 내용 읽어 오는 Reader객체
	1. 지정한 파일객체에 있는 내용을 읽어와서 출력처리
	2. 처리 순서
		1) Reader 객체를 상위로 하여 FileReader 객체 생성
		2) read() 메서드를 통해 문자 한자씩 가져와서 담기 처리
		3) 위 내용이 코드 번호이기에 char로 형변환 처리
		4) 더이상 읽어올 데이터가 없는 -1일 경우 종료 처리..
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\user\\git\\web2\\javaexp\\src\\javaexp\\a13_io\\";
		Reader reader = null;
		try {
			reader = new FileReader(path+"z03_data.txt");
			while(true) {
				int code = reader.read(); // 한자씩 코드값을 가져온다.
				if(code==-1) { // 더이상 데이터가 없을 때, 반복 중단
					break;
				}
				System.out.print((char)code);
			}
			reader.close();
			System.out.println("읽기 종료!!");
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 읽을 수 없네요!");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 예외");
			System.out.println(e.getMessage());
		}
		// ex) z04_data.txt 좋아하는 음악 가사
		// A08_Reader.java를 통해서 해당 가사를
		// 출력하게 하세요..
		//
	}

}
