package javaexp.a08_relation.access.ourhome;

public class Mine {
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
