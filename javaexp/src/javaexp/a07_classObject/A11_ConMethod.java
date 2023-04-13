package javaexp.a07_classObject;

public class A11_ConMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 생성자와 메서드를 활용한 객체 구현
		1. 생성자는 주로 객체를 생성할 때, 초기 데이터를
			설정할 때, 사용되며,
		2. 메서드는 계속 기능적인 처리를 하여, 외부에 변경되는
			데이터를 입력받거나 해당 데이터를 로직에 의해
			리턴할 때, 주로 활용된다.
			
		 * */
		Car c1 = new Car("그랜저");
		c1.driving();
		c1.addFuel(20);
		System.out.println("현재 속도:"+c1.stepPadal()+"km/h");
		System.out.println("현재 속도:"+c1.stepPadal()+"km/h");
		System.out.println("현재 속도:"+c1.stepPadal()+"km/h");
		c1.driving();
		c1.driving();
		c1.driving();
		c1.driving();
		c1.driving();
		Calculator02 cal1 = new Calculator02(25,5);
		int rs=0;
		rs = cal1.plus(); System.out.println("결과:"+rs);
		rs = cal1.minus(); System.out.println("결과:"+rs);
		rs = cal1.multi(); System.out.println("결과:"+rs);
		rs = cal1.divide(); System.out.println("결과:"+rs);
		// 15:05~
		
	}

}
// ex)Calculator02 생성자를 통해서 변수를 2개 받아서
//    기능메서드 plus(), minus(), multi(), divide()
//    출력 @@ + @@ 
//    리턴값을 연산결과를 리턴하게 처리하세요 외부에서 리턴받아
//    연산 결과를 출력
class Calculator02{
	
	// 필드
	int num01;
	int num02;
	public Calculator02() {
	}
	// 생성자(두개 데이터)
	Calculator02(int num01, int num02){
		this.num01 = num01;
		this.num02 = num02;
	}
	// 메서드1()
	int plus() {
		int tot = num01+num02;
		System.out.println(num01+" + "+num02);
		return tot;
	}
	// 메서드2()
	int minus() {
		System.out.println(num01+" - "+num02);
		return num01-num02;		
	}
	// 메서드3()
	int multi() {
		System.out.println(num01+" x "+num02);
		return num01*num02;		
	}	
	// 메서드4()
	int divide() {
		// 나눗셈의 경우 0으로 나누면 예외가 나오기에
		// 3항 연산자로 처리..
		int sum = num02==0?0:num01/num02;
		System.out.println(num01+" ÷ "+num02);
		return sum;
	}
}




class Car{
	int speed;
	int fuel;
	String kind;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String kind) {
		this.kind = kind;
	}
	void addFuel(int cc) {
		// 기름을 주입한다.
		fuel+=cc;
		System.out.println("기름을 주입한다:"+cc);
	}
	int getFuel() {
		// 현재 기름량 확인
		return fuel;
	}
	int stepPadal() {
		System.out.println("엑셀을 밟다!!");
		speed+=10;
		return speed;
	}
	void driving() {

		if(fuel>0 && speed>0) {
			System.out.println(kind+"자동차가 운행을 한다.");
			fuel-=10;
			System.out.println("운행하여 휘발유를 10감소해서 지금:"
			+fuel+"cc 남았습니다.");
		}else {
			if(fuel<=0) {
				System.out.println("휘발유가 없습니다.");
			}
			if(speed<=0) {
				System.out.println("엑셀을 통해 속도를 올려야 합니다.");
			}
		}
	}
	
}
