package javaexp.a08_relation;

import javaexp.a08_relation.vo.Car;
import javaexp.a08_relation.vo.CarRacer;
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
		
		CarRacer cr = new CarRacer("김형식");
		cr.buyCar( new Car("그랜저",3500) );
		cr.drivingCar();
		// 16:10~
		// 	1) 주중 진행된 내용 전체 개념 내용 확인
		//  2) 조별로 어려운 내용 review 필요한 내용 확인
		//  3) 조별 개념 확인
		//  4) 개인별 개념 확인 test
		
		Car c1 = new Car("SM5",3000); // // (SM5, 3000)  
		c1.setCc(2000);  // (SM5, 2000) 입력
		int cc = c1.getCc(); // 2000
		String kind = c1.getKind();
		
		
		
	}
}
