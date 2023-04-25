package javaexp.a10_exception;

public class A02_BasicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실행1");		
		try {
			System.out.println("#try블럭#");
			System.out.println("실행2");
			for(int cnt=1;cnt<=100;cnt++) {
				System.out.print(cnt+",");
				if(cnt==50) { // 조건 50일 때, 바로 예외 던짐..
					System.out.println();
					System.out.println(1/0);
				}
			}
			System.out.println("실행3");
		}catch(Exception e) {
			System.out.println("#예외처리");
			System.out.println("실행4");
			System.out.println("에러내용:"+e.getMessage());
			System.out.println("실행5");		
		}
		System.out.println("#수행 완료 후#");
		System.out.println("실행6");
		System.out.println("실행7");			
	}

}
