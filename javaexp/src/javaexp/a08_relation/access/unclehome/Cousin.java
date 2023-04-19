package javaexp.a08_relation.access.unclehome;

import javaexp.a08_relation.access.ourhome.Mine;

public class Cousin {
	void callMineInfo() {
		//System.out.println("private 접근:"+priSec);
		Mine m = new Mine();
//		System.out.println("private 접근:"+m.priSec);
//		System.out.println("default 접근:"+m.travelPlan);
	}
}
