package javaexp.a09_inherit;

public class A04_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 다형성(Polymorism)
		1. 공통 멤버를 가진 상위클래스를 상속받은 하위클래스에서
			기능적 분리를 하는 메서드를 상위 클래스의 이름(매개변수)과
			동일하게 정의하여 다양한 기능을 처리하는 것을 말한다.
		2. 상위 ==> 여러가지 하위 객체를 통해, 다양한 기능을 처리
			하는 것을 말한다.
			ex) 컴퓨터 부품(Cpu, Ram, Ssd....)
				class Computer{
					String kind;
					Cpu c;
					Ram r;  ==> Part[] (상위 객체)
					Ssd s;
					...
					GrapCar....
					
					void addPart(Part p )
					 	plist.add(p);
					void showParts()
					 	for(Part p:plist)
					 		p.showInf(); // 오버라이딩.
				}
				호출하는 곳에서...
				com.addPart(new Cpu());
				com.addPart(new Ram());
				com.addPart(new Ssd());
				Part p1 = new Cpu();
				Part p2 = new Ram();
				Part p3 = new Ssd();
		3. 기본형식
			1) 1단계
				상속하는부모클래스 변수 = new 자식클래스생성자();
				class Animal{}
				class Cat extends Animal{}
				class Bird extends Animal{}
				
				Animal an01 = new Cat();
				Animal an02 = new Bird();
			2) 2단계
				상위클래스 : 큰메모리
				하위클래스 : 작은메모리
				- 큰메모리 = 작은메모리; promote(자동형변환)
					상위객체 = 하위객체
				- 작은메모리 = (작은메모리)큰메모리; casting(강제형변환)
					하위객체 = (하위클래스)상위객체; (***) 
					ps) 예고 상위<generic> ==> 상위<하위객체> 
					
		*/
		Animal ani01 = new Cat();
		ani01.sound();
		Animal ani02 = new Dog();
		ani02.sound();
	}
}
// ex) 하위클래스 Dog하고 재정의하고, main()에서 위와같이
//     다형성 처리(상위=하위)하여 오버라이딩 메서드 호출하세요..
class Dog extends Animal{
	public Dog() {
		super("강아지");
	}
	@Override
	public void sound() {
		super.sound();
		System.out.println("멍 멍!!");
	}
	
}
class Animal{
	private String kind;
	public Animal(String kind) {
		this.kind = kind;
	}
	public void sound() {
		System.out.println(kind+"가 울다!!");
	}
}
class Cat extends Animal{
	public Cat() {
		super("고양이");
	}
	// 오버라이딩
	@Override
	public void sound() {
		super.sound();
		System.out.println("야옹! 야옹!");
	}	
}
/*
# 폴리모피즘이 일어나는 실제 구조..
	Part
	   부품명
	   사양
	   Part(부품명,사양)
	   showInfo() - 부품정보출력
					실제 부품객체들은 위 내용 
						+ 상세기능 필요(각 부품마다 다름) 필요!!!
Cpu
   Cpu(사양)
     super("CPU")
   showInfo()
     super.showInfo();
     System.out.("cpu는 컴퓨터의 핵심 중앙처리 부품입니다..");
Ram..
Ssd
Gra..
..
추가되어야 하는 상황.. ?? 새로운 부품이 추가되더라도 컴퓨터의 코드는
변경되지 않고도 처리할 수 있는 방법?? ==> 다형성 처리..			
	Computer    
		name
		Part p;
		생성자..
		void addPart(Part p){
			this.p = p;
			// 부품..
		}
		void showInfo(){
			컴퓨터 ...
			if(p!=null)
				p.showInfo();
			else
				부품이 장착되지 않았습니다.
		}
# 구현 순서
1. 부품 Part
2. 하위 Cpu
3. Computer	
	1단계 Part
	2단계 Part[]
		
	
	


 * */




