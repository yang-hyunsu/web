package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A01_StarcraftWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	    # 추상클래스의 목적
	    	1) 기능적인 통일성을 가진 상위클래스를 상속 받게하기 위한 것이다.
	    	 	- 기능적 통일성 
	    	 		공통 필드/메서드 : 그대로 재활용
	    	 		이름은 같지만 다양한 기능을 처리하는 메서드를 강제화 한다***
		# 추상클래스를 통한 실제클래스 만들기
			abstract class Larba{
				공통필드 : 유닉종류, 색상
				공통 생성자 : 매개변수1개 : 하위에 반드시 호출 
				공통메서드 : 유닉이 이동 한다..
				abstract 재정의 메서드(); : 유닉의 공격방법..
			}
			class Dron extends Larba{
				Dron(String color){
					super("드론",color);
				}
				// 위에 있는 abstract을 재정의하지 않으면 컴파일 에러.
			}
			
			
		
		# 추상클래스를 통한 다형성 처리하기
		 * */
		ArrayList<Larba> myUnits = new ArrayList<Larba>();
		myUnits.add(new Dron("빨강"));
		myUnits.add(new Zerggling("파강"));
		myUnits.add(new Zerggling("노랑"));
		myUnits.add(new Hydralisk("흰"));
		System.out.println("사용할 유닉들");
		for(Larba lb:myUnits) {
			lb.move(); // 공통메서드
			lb.attack(); // 재정의 메서드
		}
		
	}

}
// 추상메서드가 하나라도 있으면 추상클래스가 되고, 
// 드디어 혼자 객체생성을 하지 못한다. Larba l1 = new Larba(); (X)
// 다형성에 의해서 상속받은 하위객체가 할당할 때만 생성 
// Larba l1 = new Dron();
// Larba l2 = new Zerggling();
// Larba l3 = new Hydralist();
abstract class Larba{ 
	private String kind;
	private String color;
	public Larba(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	public String getUnit() {
		return color+"색 "+ kind;
	}
	// 공통 메서드.
	public void move() {
		System.out.println(color+"색 "+kind+" 이동합니다.");
	}
	// 상속받는 하위에서 반드시 재정의 메서드
	public abstract void attack();
}
class Dron extends Larba{
	public Dron(String color) {
		super("드론", color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack() {
		System.out.println(getUnit()+" 채집유닉이라 공격을 못합니다.");
		System.out.println(getUnit()+" 공격력 5로 미약하게 공격합니다.");
	}
}
class Zerggling extends Larba{
	public Zerggling(String color) {
		super("저글링", color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack() {
		System.out.println(getUnit()+" 초기 공격 유닉으로 공격력 5로 빠르게 공격합니다.");
	}
}
class Hydralisk extends Larba{
	public Hydralisk( String color) {
		super("히드라리스크", color);
	}
	@Override
	public void attack() {
		System.out.println(getUnit()+"중대형 공격 유닉으로 공격력 15로 원거리 공격합니다.");
		
	}
	@Override
	public void move() {
		super.move();
		System.out.println("속도 업그레이드시 빠르게 이동합니다.");
	}
}





