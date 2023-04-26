package javaexp.a11_api;

public class A01_API_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 자바 API 도큐먼트
		1. 자바에서 기본적으로 제공하는 라이브러리
			프로그래 개발에 자주 사용되는 클래스 및 인터페이스 모음
		2. API 도큐먼트
			1) 쉽게 api찾아 활용할 수 있도록 문서화한 것
			2) html 페이지로 작성되어 있어 웹브라우저로 바로 볼 수 있다.
		# java.lang 패키지
		1. 자바 프로그램의 기본적인 클래스를 담는 패키지
		2. 포함된 클래스와 인터페이스는 import없이 사용 가능
		3. 주요 클래스
			1) Object
				자바의 모든 클래스의 최상위 클래스로 사용
				모든 클래스(api내장/사용자정의)는 Object를 상속하고 있다.
				그러므로, Object가 가지고 있는 기본적인 메서드는 재정의하거나 사용할 수 있다.
				ex)
				ArrayList list == ArrayList<Object> list
				Object ob = new Person();
				ob.getName()(X) : 하위 클래스에서 추가 정의된 내용을 사용할 수 없다.
							      하위 클래스에서 상위 클래스의 기능메서드 중에
							      재정의된 경우에는 하위 클래스의 정의된 내용으로 
							      사용할 수 있다.
				Person p01 = (Person)ob;
				p01.getName();
			
				16:05~ 피드백 진행..
				
				
				
				
				
				
		 * */
	}

}
