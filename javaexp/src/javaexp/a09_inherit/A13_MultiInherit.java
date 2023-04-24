package javaexp.a09_inherit;

public class A13_MultiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 인터페이스의 다중 상속 지원
		1. 상위로 여러개의 인터페이스를 상속받아서
		2. 하위 실제 클래스는 선언할 수 있다.
		3. 기본 형식
			interface 인터페이스1
				추상메서드1
			interface 인터페이스2
				추상메서드2
			인터페이스만 여러개를 상속 받아 사용할 수 있다.	
			class 다중상속한실제객체 implements 인터페이스1, 인터페이스2{
				추상메서드1 재정의
				추상메서드2 재정의
			}	
			ex) Wing인터페이스, Swimming인터페이스
				class MultiSkillRobot implements Wing, Swimming
				
		 * */
		MultiSkill01 ms01 = new MultiSkill01();
		MultiSkill02 ms02 = new MultiSkill02();
		ms01.allSkill();
		ms02.allSkill();
		// ex) StudyWay study(),  PlayWay play()
		//     인터페이스를 선언하고,
		//     두개를 implements한 실제객체
		//     Student01, Student02를 선언하여 위 인터페이스를
		//     재정의 한 내용을 출력하는 메서드를 호출하세요..
		Student01 st1 = new Student01();
		Student02 st2 = new Student02();
		st1.study(); st1.play();
		st2.study(); st2.play();
	}
}
interface StudyWay{
	void study();
}
interface PlayWay{
	void play();
}
class Student01 implements StudyWay,PlayWay{
	@Override
	public void play() {
		System.out.println("놀기를 열심히 한다.");
	}
	@Override
	public void study() {
		System.out.println("공부를 열심히 한다.");
	}
}
class Student02 implements StudyWay,PlayWay{
	@Override
	public void play() {
		System.out.println("노는 것을 잘 못한다.");
	}
	@Override
	public void study() {
		System.out.println("공부하는 것을 잘 못한다.");
	}
}




class MultiSkill01 implements SwimmingWay, Wing{
	@Override
	public void fly() {
		System.out.println("우리 동네를 날으다.");
	}
	@Override
	public void swimming() {
		System.out.println("호수가를 수영하다.");
	}
	public void allSkill() {
		fly();swimming();
	}
}
class MultiSkill02 implements SwimmingWay, Wing{
	@Override
	public void fly() {
		System.out.println("우리 나라 전국를 날으다.");
	}
	@Override
	public void swimming() {
		System.out.println("바다를 수영하다.");
	}
	public void allSkill() {
		fly();swimming();
	}
}
