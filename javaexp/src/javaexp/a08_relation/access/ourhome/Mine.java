package javaexp.a08_relation.access.ourhome;

public class Mine extends Father{
	
	void callFatherInfo1(){
		Father f = new Father();
//		System.out.println("private:"+f.youngerPriv);
		System.out.println("default:"+f.heath);
		System.out.println("protected:"+f.inherit);
		System.out.println("public:"+f.announce);		
	}
	// 상속자
	void callFatherInfo2(){
//		System.out.println("private:"+youngerPriv);
		System.out.println("default:"+heath);
		System.out.println("protected:"+inherit);
		System.out.println("public:"+announce);
	}	
	
	
	// private로 Mine의 개인 비밀을 할당하고,
	// 같은 패키지/다른 패키지 접근 여부를 확인
	private String priSec = "나의 비밀 일기장 내용";
	String travelPlan = "우리 가족은 5월에 여행을 제주도로 가기로 함";
	void callMineInfo() {
		//System.out.println("private 접근:"+priSec);
		Mine m = new Mine();
		System.out.println("private 접근:"+m.priSec);
		System.out.println("default 접근:"+m.travelPlan);
	}
}
