package javaexp.a10_exception;

import java.io.IOException;
import java.io.InputStream;

public class A06_CompileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴파일 예외 처리 : 반드시 처리해야 컴파일됨(기계어로된 파일 생성)
		try { // javaexp.a10_exception.A06_CompileException
			System.out.println("컴파일시 예외 발생!!");
			//Class.forName("javaexp.a10_exception.A06_CompileException");
			Class.forName("aa.bb");
		} catch (ClassNotFoundException e) {
			System.out.println("예외 내용:"+e.getMessage());
			System.out.println("예외가 처리되는 경로 trace");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		// ex) 아래 코드를 이용해서, 컴파일 예외를 처리하세요..(io발생)
		InputStream is = System.in;
		try {
			System.out.println("데이터 입력");
			System.out.println(is.read());
		} catch (IOException e) {
			System.out.println("예외 발생:"+e.getMessage());
			// TODO Auto-generated catch block
			
		}
		System.out.println("프로그램 종료!!");
		
	}

}
