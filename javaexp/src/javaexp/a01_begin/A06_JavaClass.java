package javaexp.a01_begin;

public class A06_JavaClass {
	/*
	# 자바프로그램의 컴파일 과정과 실행
	A06_JavaClass.java : 소스코드 만든다.(사람이 아는 코드)
	javac A06_JavaClass.java   : 컴파일 파일을 만든다.
		A06_JavaClass.class 생성(기계-컴퓨터가 인식하는 코드)
	java A06_JavaClass : main()가 있는 파일에서
		메모리를 로딩시키고, 실행되는 처리를 한다.

	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자바실행");
		Product pro = new Product("사과",3000,2);
		pro.show();
		
	}

}
