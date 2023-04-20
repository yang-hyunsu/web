package javaexp.a09_inherit;

public class A02_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		# 객체에 있어서 super와 this의 사용
		1. this 클래스 안에서 객체를 지칭할 때, 이 객체가 가지고 있는 구성요소를
			호출할 때, 주로 사용된다.
			1) this.필드 : 지역변수와 구분하여 class의 전체 전역변수에 사용되는
				변수를 호출해서 할당/사용할 때 사용된다.
			2) this(), this(25), this("홍길동",25) :
			 	생성자가 overloading으로 여러개 선언되어 있을 때,
			 	다른 생성자를 호출해서 데이터를 할당할 때, 사용된다.
			 	- 호출시, 반드시 생성자 선언 첫라인에서 호출하여야 한다.
			ex) Product 클래스 선언하고, 기본생성자~매개변수3개 생성자를
			 	선언하고 필드값 물건명, 가격, 갯수를 호출하게 하세요.
			 	 
		2. 상속관계에 있어서 this, super의 활용
			 1) 필드, 생성자, 메서드 다 활용된다.
			 2) 현재클래스와 상위클래스에 정의된 구성요소를 구분하여 호출할 때,
			 	사용된다.
			 	this 현재 클래스가 가지고 있는 멤버를 지칭
			 	super 는 상위 클래스가 가지고 있는 멤버를 지칭
			 3) 상위 선언된 메서드와 동일한 이름/매개변수가 동일하게 선언하고,
			 	사용이 가능한데 이것을 메서드 overriding일 때,
			 	상위 클래스의 메서드 : super.메서드(), 하위 클래스의 메서드
			 	this.메서드()		
			 4) 상속관계 하위에 생성자는 받드시 상위에 생성자 중 하나를 호출하여야
			  		한다.(주의)
			  	- 일반적으로는 default 생성자를 호출
			  	- 상위에 default를 사용하지 않을 때, 반드시 추가 선언 필요
			  		
		*/
	
		Daughter d1 = new Daughter();
//		System.out.println(d1.charac);
//		System.out.println(d1.name);
		d1.call();
/* ex) Father, Son 선언하고,
 * 	   1. 변수 동일 선언 : 하위 메서드에서 구분 호출
 *     2. 생성자 상위에 매개변수 1개 선언 후, 하위에서 호출
 *     3. 메서드 동일 메서드 선언하여, 상위에 구분 처리..
 * */		
		
	}
}
class Father{
	int age=55;
	Father(String name){
		
	}
	void speak() {
		System.out.println("아버지의 나이:"+age);
	}
}
class Son extends Father{
	int age=27;
	// public Son(){ super(); } : default생성자의 선언
	Son() {
		super("아버지"); // 상위에 있는 생성자를 반드시 호출.
	}
	void speak() {
		super.speak(); // 상위에 있는 메서드 호출
		System.out.println("아들의 나이:"+this.age);
	}

}
class Mother{
	String charac="온화함";
	String name="어머니";
	Mother(String name){
		System.out.println("어머니 생성자");
	}
	void call() {
		System.out.println("# 상위 call()메서드 #");
		System.out.println("성격:"+charac);
	}
}
//현재클래스와 상위클래스에 정의된 구성요소를 구분하여 호출할 때,사용된다.
class Daughter extends Mother{
	String name="딸";
	Daughter(){
		// super(); default로 컴파일시 호출 된다.
		super("상위"); // 반드시 상위 선언된 생성자를 호출하여야 한다.
		System.out.println("딸 생성자");
	}
	Daughter(String name){
		this(); // 현재 가지고 있는 생성자를 호출한다.
	}
	// 메서드 오버라이딩(overriding) : 상위에 있는 메서드에 편승해서
	// 올라타서 정의(똑같은 내용 정의)
	void call() {
		// 상위에 있는 메서드를 현재 메서드와 구분해서 호출할 때 super.
		super.call();
		System.out.println("#메서드 호출#");
		System.out.println(charac);
		System.out.println("super.name:"+super.name);
		System.out.println("this.name:"+this.name);
		System.out.println("name:"+name);// this.생략하더라도 하위 필드
	}
	
}
