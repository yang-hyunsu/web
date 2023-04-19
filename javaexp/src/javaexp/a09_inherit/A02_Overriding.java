package javaexp.a09_inherit;

public class A02_Overriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 메소드 재정의(overriding)
		1. 부모 클래스의 상속 메서드를 동일한 이름(매개변수)으로 
			다시 자식 클래스에서 정의하는 것을 말한다.
		2. 목적
			1) 최종 목적은 상속관계에서 상위 클래스를 기반으로
				상속받은 여러 클래스가 다양한 형태로 변경하는
				다형성이라고 할 수 있다.
		3. 기본 형식
			class 상위{
				void 기능메서드(){
				
				}
			}
			class 하위1 extends 상위{
				void 기능메서드(){ // 상위와 동일한 메서드 정의
				}
			}
		4. 주의 : 접근제어자는 하위 객체에서 재정의하는 메서드는
			상위와 같거나 더 넓어져야 한다.
			상위 default 하위 default/protected/public(O)
			상위 public 하위 default(X)
		*/
		HyunDae com1 = new HyunDae();
		com1.earnMoney();
		Samsung com2 = new Samsung();
		com2.earnMoney();
		// Company를 상속받은 회사클래스를 만들고, 
		// earnMoney()를 재정의하고, main()에서 호출하세요.
		DaumKakao com3 =new DaumKakao();
		com3.earnMoney();
		Police wk1 = new Police();
		wk1.working();
		Programmer wk2 = new Programmer();
		wk2.working();
/*
상위 Worker
		kind : 직업종류
		Worker(String kind)
		working() : 일하는 내용
하위 Police   상위 생성자 호출 및 메서드 재정의
    Programmer
 * */		
	}
}
class Worker{
	private String kind;
	public Worker(String kind) {
		this.kind = kind;
	}
	public void working() {
		System.out.println(kind+" 일을 합니다.");
	}
}
class Police extends Worker{
	public Police() {
		super("경찰관");
	}
	public void working() {
		System.out.print("치안을 유지하기 위해 ");
		super.working();
	}	
}
class Programmer extends Worker{
	public Programmer() {
		super("프로그래머");
	}
	public void working() {
		System.out.print("소프트웨어 개발로 ");
		super.working();
	}	
}


class DaumKakao extends Company{
	public DaumKakao() {
		super("다움카카오");
	}
	// 접근제어자는 같거나 더 넓어져야 한다.
	public void earnMoney() {
		System.out.print("메신저 기반 온라인 서비스로 ");
		super.earnMoney();
	}
}

class Company{
	private String name;
	public Company(String name) {
		this.name = name;
	}
	public void earnMoney() {
		System.out.println(name+"회사가 돈을 벌다.");
	}
}
class HyunDae extends Company{
	public HyunDae() {
		super("현대중공업");
	}
	public void earnMoney() {
		System.out.print("배를 만들어서 ");
		super.earnMoney();
	}
}
class Samsung extends Company{
	public Samsung() {
		super("삼성전자");
	}
	public void earnMoney() {
		System.out.print("전자제품을 만들어서 ");
		super.earnMoney();
	}
}
