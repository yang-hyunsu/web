package javaexp.a09_inherit;

public class A01_Basic {

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
			 	
			
		*/
		Person p01 = new Person("홍길동",25,"서울");
	}
}
// this()로 정의된 생성자 호출
class Person{
	String name;
	int age;
	String loc;
	public Person() {
		System.out.println("객체 생성:"+this);
	}
	public Person(String name) {
		this(); // 생성자를 호출하면서 매개변수가 없는 생성자도 호출
		this.name = name;
		System.out.println("매개변수 1개");
	}
	public Person(String name, int age) {
		this(name);
		this.age = age;
		System.out.println("매개변수 2개");
	}
	public Person(String name, int age, String loc) {
		this(name, age);
		this.loc = loc;
		System.out.println("매개변수 3개");
	}
	
	
}



