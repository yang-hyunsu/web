package javaexp.a10_exception;

public class A04_RunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("로그인 프로그램 ");
		try {
			String id = args[0];
			String pwd = args[1];
			System.out.println("입력한 아이디:"+id);
			System.out.println("입력한 패스워드:"+pwd);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("# 예외 발생 #");
			System.out.println("아이디와 이름을 입력하세요");
		}
		System.out.println("프로그램 종료");
	}

}
