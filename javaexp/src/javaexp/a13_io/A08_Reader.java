package javaexp.a13_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class A08_Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\user\\git\\web2\\javaexp\\src\\javaexp\\a13_io\\";
		Reader reader=null;
		try {
			reader = new FileReader(path+"z04_data.txt");
			while(true) {
				int code = reader.read();
				if(code==-1) {
					break;
				}
				System.out.print((char)code);
			}
			reader.close();
			System.out.println("\n읽어오기 종료!!");

		}catch (FileNotFoundException e) {
			System.out.println("파일 없음.");
		}catch (IOException e) {
			System.out.println("IO예외");
		}catch (Exception e) {
			System.out.println("기타예외"+e.getMessage());
		}finally {
			if(reader!=null) { 
				// reader객체가 메모리에 있을 때, 최종으로 자원해제
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("# 최종 자원 해제 #");
			}
		}
	}

}
