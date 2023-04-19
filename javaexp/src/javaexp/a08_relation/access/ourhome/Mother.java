package javaexp.a08_relation.access.ourhome;

public class Mother {
	void callFatherInfo1(){
		Father f = new Father();
//		System.out.println("private:"+f.youngerPriv);
		System.out.println("default:"+f.heath);
		System.out.println("protected:"+f.inherit);
		System.out.println("public:"+f.announce);		
	}
//	// 상속자
//	void callFatherInfo2(){
//		System.out.println("private:"+youngerPriv);
//		System.out.println("default:"+heath);
//		System.out.println("protected:"+inherit);
//		System.out.println("public:"+announce);
//	}		
	
	
	void callMineInfo() {
		Mine m = new Mine();
		System.out.println("default 접근:"+m.travelPlan);
	}
}
