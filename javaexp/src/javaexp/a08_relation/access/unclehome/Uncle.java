package javaexp.a08_relation.access.unclehome;

import javaexp.a08_relation.access.ourhome.Mine;

public class Uncle {
	void callMineInfo() {
		Mine m = new Mine();
//		외부 패키지에서는 접근이 불가
//		System.out.println("default 접근:"+m.travelPlan);
	}
}
