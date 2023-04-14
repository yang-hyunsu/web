package javaexp.a08_relation;

import javaexp.a08_relation.vo.HPUser;
import javaexp.a08_relation.vo.HandPhone;

public class A03_ObjVsObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhone hp = new HandPhone("삼성", 1200000);
		
		HPUser hs = new HPUser("홍길동");
		String name = "홍길동";
		hs.setName(name);
		hs.setName("마길동");
		name="마길동";
		hs.buyPhone(hp);
		hs.buyPhone(new HandPhone("아이",1500000));
		hs.callByPhone();
		
		// Car, CarRacer객체 생성..
		
		
	}
}
