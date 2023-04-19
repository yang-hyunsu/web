package javaexp.a08_relation.access.unclehome;

import javaexp.a08_relation.access.ourhome.Father;
import javaexp.a08_relation.access.ourhome.Mine;

public class Uncle {
	void callFatherInfo1(){
		Father f = new Father();
//		System.out.println("private:"+f.youngerPriv);
//		System.out.println("default:"+f.heath);
//		System.out.println("protected:"+f.inherit);
		System.out.println("public:"+f.announce);		
	}
	// 상속자
//	void callFatherInfo2(){
//		System.out.println("private:"+youngerPriv);
//		System.out.println("default:"+heath);
//		System.out.println("protected:"+inherit);
//		System.out.println("public:"+announce);
//	}		
	
	void callMineInfo() {
		Mine m = new Mine();
//		외부 패키지에서는 접근이 불가
//		System.out.println("default 접근:"+m.travelPlan);
	}
}
