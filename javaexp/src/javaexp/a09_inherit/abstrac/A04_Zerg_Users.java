package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A04_Zerg_Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			System.out.println("전체 유닉 "+units.size()+"공격을 합니다.");
			for(Larba lb:units) {
				lb.move(); // 공통메서드
				lb.attack(); // 재정의 메서드..
			}
		}else {
			System.out.println("공격할 유닉이 없네요.~~");
		}
	}
	
	
	
	
}


