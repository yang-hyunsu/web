package javaexp.a08_relation.access.story1;

import javaexp.a08_relation.access.story1.friendship.WoodCutter;

public class Hunter {
	void callWoodCutterInfo() {
		// public class WoodCutter 
		// ==> WoodCutter wc 가능
		// default 생성자 : public WoodCutter(){}
		// ===>  new WoodCutter(); 가능
		WoodCutter wc = new WoodCutter();
		// 패키지가 다르므로 default 접근제어자의 구성요소는
		// 접근이 불가능 하다.(에러발생)
//		System.out.println("default접근 제어:"+wc.hiddenDeer);
	}
}
/*
javaexp.a08_relation.access
ourhome 패키지 생성
	Father, Mother,Brother 
	Mine
		X 우리가족여행계획 : 변수로 설정할당
unclehome 패키지 생성
	Uncle Cousin

	다른 클래스에서 Mine 클래스에 대한 우리가족여행계획 호출 처리 메서드 선언하여
		가능한 범위 확인..
 * 
 * */


