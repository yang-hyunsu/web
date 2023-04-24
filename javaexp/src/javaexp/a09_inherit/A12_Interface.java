package javaexp.a09_inherit;

public class A12_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 인터페이스..
		1. 인터페이스이해를 위한 이야기..
			Robot
			
			MZ : 지구, 초창 하늘을 날지 못 함.
			
			Flyway (인터페이스) : 날게됨..
				껍데기(어깨에 정보를 입/출하게하는 처리 장치를 붙여) 
					중앙 처리장치에는 이 입/출력을 받아서 기기를 제어하게 처리.
			Fly1호를 만들기 : 날개가 부착해서  붙여 놓은 인터페이스에 의해
			 		정보를 처리하게 함..(실제객체)
			Fly2호..Fly3호. 		
		2. 인터페이스란?	
			1) 개발 코드와 객체가 서로 통신하는 접점.
				- 개발 코드는 인터페이스의 메서드만 알고 있으면 OK
			2) 역할 
				- 개발 코드가 객체에 종속되지 않고 실제 객체가 교체할 수 있도록
					하는 역할..
				- 개발 코드 변경 없이 리턴값 또는 실행 내용이 다양해 질 수 있음.
			ex) Mz의 어깨위에 날개를 인식할 수 있는 장치가 인터페이스고
				이 인터페이스를 상속받아서 실제 날개1호, 날개2호등이 부착되어
				계속 업그레이드가 가능하게 만듦...
		 3. 인터페이스의 활용
		 	1) 인터페이스의 이름 - 자바 식별자 작성 규칙에 의해 대문자 시작으로 작성
		 	2) 소스 파일 또는 클래스 하위에서 생성
		 	3) 선언 
		 		접근제어자 interface 인터페이스명{}
		 	4) 구성요소
		 	 	상수 : 인터페이스에 선언된 모든 변수는 기본적으로 상수이다.
		 	 		int FLYNO=1;  앞에 public static final이
		 	 			자동을 붙는다.
		 	 	메서드 : 인터페이스의 재정의 메서드는 기본적으로 추상메서드이다.
		 	 		void fly(); 앞에 public abstract 생략..
		 	 	기타 : 디폴드 메서드, 정적 메소드 지원

		# 처리순서
		1. 상위 인터페이스 선언
		2. 재정의할 메서드 선언
		3. 하위 실제 객체 선언	
		4. 다형성 처리 1:1관계
		 * */
		// 다형성 처리
		Wing w01 = new Wing01();
		w01.fly();
		Wing w02= new Wing02();
		w02.fly();
		// ex) SwimmingWay 인터페이스를 선언하고 상수로 "수영" 추상메서드 swimming()
		//     Swimming01 우리동네 풀장을 수영하다. Swimming02 호수를 수영하다..
		//     로 선언하여 다형성으로 호출 처리하세요..
		
	}
}
interface Wing{
	String NAME ="날개"; // public static final 생략..
	void fly(); // public abstract 생략됨..
}
// 인터페이스를 상속 받을 때는 implements 인터페이스로 선언한다.
class Wing01 implements Wing{
//	NAME="날개 1호"; public static final이기에 변경 불가..
	// 반드시 재정의 하여야 한다.
	@Override
	public void fly() {
		System.out.println(NAME+" 1호로 우리 동네를 날아다니다.");
	}
}
class Wing02 implements Wing{
	@Override
	public void fly() {
		System.out.println(NAME+" 2호로 아시아를 날아다니다.");
	}
}







