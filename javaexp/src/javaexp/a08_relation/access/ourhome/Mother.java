package javaexp.a08_relation.access.ourhome;

public class Mother {
	void callMineInfo() {
		Mine m = new Mine();
		System.out.println("default 접근:"+m.travelPlan);
	}
}
