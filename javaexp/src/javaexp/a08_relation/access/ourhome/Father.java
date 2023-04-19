package javaexp.a08_relation.access.ourhome;

public class Father {
	private String youngerPriv="아버지의 비밀";
	String heath="아버지의 건강상태";
	protected String inherit = "유산할 땅";
	public String announce = "자식들의 자랑거리";
	void callFatherInfo1(){
		Father f = new Father();
		System.out.println("private:"+f.youngerPriv);
		System.out.println("default:"+f.heath);
		System.out.println("protected:"+f.inherit);
		System.out.println("public:"+f.announce);		
	}
	// 상속자
	void callFatherInfo2(){
		System.out.println("private:"+youngerPriv);
		System.out.println("default:"+heath);
		System.out.println("protected:"+inherit);
		System.out.println("public:"+announce);
	}	
	
	
	
	void callMineInfo() {
		Mine m = new Mine();
		System.out.println("default 접근:"+m.travelPlan);
	}
}
