package javaexp.a08_relation.access.story2.woodhome;

public class Daughter extends WoodCutter{
	public void callWoodInfo(){
		WoodCutter wc = new WoodCutter();
//		System.out.println("private:"+wc.privSec);
		System.out.println("default(x):"+wc.ourHomeSec);
		System.out.println("protected:"+wc.inheritSec);
		System.out.println("public:"+wc.announce);
	}
	
	// 상속 클래스
	public void callWoodInfo2(){
//		System.out.println("private:"+privSec);
		System.out.println("default(x):"+ourHomeSec);
		System.out.println("protected:"+inheritSec);
		System.out.println("public:"+announce);
	}
}
