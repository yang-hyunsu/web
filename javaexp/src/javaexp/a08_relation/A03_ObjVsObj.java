package javaexp.a08_relation;

import javaexp.a08_relation.vo.Car;
import javaexp.a08_relation.vo.CarRacer;
import javaexp.a08_relation.vo.Computer;
import javaexp.a08_relation.vo.Cpu;
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
/*
ex1) 1:1관계 
package javaexp.a08_relation.vo에 추가하세요

	Cpu(제조사,사양, showInf() 제조사 사양 출력) 클래스를 선언
	Computer(종류(조립/완성품), Cpu,  addCpu(...), 
		showCom 컴퓨터가 cpu가 없다/ cpu의 정보는 ...)

1. javaexp.a08_relation.vo에
	1) Cpu 클래스 선언 및 필드/생성자/메서드 추가
			주의 메서드 : showInf()에서 제조사 사양 출력
	2) Computer 클래스 선언 Cpu클래스를 포함한 필드 선언 생성자 기능메서드 선언
			주의 메서드 : addCpu() Cpu객체 할당
				       showCom() 통해서 Cpu객체가 할당되어 있을 때와
				       	그렇지 않을 때를 구분하여 처리.
 * */
		Cpu cp1 = new Cpu("인텔","i7 3.4Ghz");	
		Computer com1 = new Computer("조립");
		com1.addCpu(cp1);
		com1.showCom();
		
	}
}
