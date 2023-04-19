package javaexp.a08_relation.access.ourhome;

public class Mine {
	String travelPlan = "우리 가족은 5월에 여행을 제주도로 가기로 함";
	void callMineInfo() {
		Mine m = new Mine();
		System.out.println("default 접근:"+m.travelPlan);
	}
}
