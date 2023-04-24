package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A04_Zerg_Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZergUser z01 = new ZergUser("파랑");
		z01.makeUnit(new Zerggling());
		z01.makeUnit(new Zerggling());
		z01.allAttack();
		ZergUser z02 = new ZergUser("빨강");
		z02.makeUnit(new Dron());
		z02.makeUnit(new Dron());
		z02.makeUnit(new Hydralisk());
		z02.makeUnit(new Hydralisk());
		z02.allAttack();
	}

}
// 1:다관계 추상클래스 포함 객체 처리
class ZergUser{
	private String color;// 사용자를 색상으로 식별
	private ArrayList<Larba> units;
	public ZergUser(String color) {
		this.color = color+"색 저그";
		units = new ArrayList<Larba>();
	}
	// ArrayList<Larba>에 하나씩 추가해 가능 과정 처리..
	public void makeUnit(Larba larba) {
		units.add(larba);
		System.out.println(color+" 유닉 "+larba.getUnit()+" 생산하다");
	}
	public void allAttack() {
		System.out.println(color+" 모든 유닉이 공격을 합니다.");
		if(units.size()>0) {
			System.out.println(color+"전체 유닉 "+units.size()+" 공격을 합니다.");
			for(Larba lb:units) {
				System.out.print("\t");
				lb.move(); // 공통메서드
				System.out.print("\t");
				lb.attack(); // 재정의 메서드..
			}
		}else {
			System.out.println("공격할 유닉이 없네요.~~");
		}
	}
	
	
	
	
}


