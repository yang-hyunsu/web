package javaexp.a13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A02_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A02_Stream.java 만들고,
		// 정답 번호를 입력하세요. 
		// 입력된 정답 번호 @@
		// 정답 여부 : @@
		InputStream is = System.in;
		System.out.print("정답번호를 입력:");
		try {
			int numS = is.read();
			OutputStream os = System.out;
			System.out.println("입력된 정답번호:");
			os.write(numS);
			char corChar = '3';
			char inputChar = (char)numS;
			System.out.println("정답:"+corChar+"번");
			System.out.println("정답여부:"+(corChar==inputChar));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
