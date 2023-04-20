package javaexp.a08_relation.access.story2.woodhome;

public class WoodCutter {
	private String privSec = "개인적인 비밀 내용";
	String ourHomeSec = "우리 가족이 사용할 돈은 뒷마당에 장독 안에 있음";
	protected String inheritSec = "상속할 재산 배분 내용";
	public String announce = "우리 막내딸이 5월의 신부가 됩니다";
	
	
	
	public void callWoodInfo(){
		WoodCutter wc = new WoodCutter();
		System.out.println("private:"+wc.privSec);
		System.out.println("default(x):"+wc.ourHomeSec);
		System.out.println("protected:"+wc.inheritSec);
		System.out.println("public:"+wc.announce);
	}
	// 상속 클래스
	public void callWoodInfo2(){
		System.out.println("private:"+privSec);
		System.out.println("default(x):"+ourHomeSec);
		System.out.println("protected:"+inheritSec);
		System.out.println("public:"+announce);
	}
}
