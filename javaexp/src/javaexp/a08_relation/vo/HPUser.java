package javaexp.a08_relation.vo;

public class HPUser {
	private String name;
	private HandPhone hp;
	public HPUser() {
		// TODO Auto-generated constructor stub
	}
	public HPUser(String name) {
		this.name = name;
	}
	// 필드에 선언된어 있는 HandPhone메모리에 실제 객체가 할당되는
	// 처리하는 하는 메서드..
	public void setName(String name) {
		this.name = name;
	}	
	// main()
	// HPUser us01 = new HPUser();
	// us01.setName( "홍길동" );
	
	
	// us01.buyPhone( new HandPhone() );
	public void buyPhone(HandPhone hp) {
		this.hp = hp;
		System.out.println(hp.getProCompany()+"사 핸드폰을");
		System.out.println(hp.getPrice()+"원으로 구매하다.");
	} //: 핸드폰객체 구매
	public void callByPhone() {
		
	} //: 핸드폰으로 전화
	public void checkMyPhoneInfo() {
		
	} //:핸드폰 정보 확인
	
	
	
	
	public String getName() {
		return name;
	}

	public HandPhone getHp() {
		return hp;
	}
	public void setHp(HandPhone hp) {
		this.hp = hp;
	}
	
	
	
}
