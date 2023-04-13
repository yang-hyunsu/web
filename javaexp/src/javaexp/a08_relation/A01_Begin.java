package javaexp.a08_relation;
// 외부패키에 사용할 객체 package밑에
import javaexp.a02_begin.Person;

// 1. 모든 클래스는 패키지를 가지고 있다.
// 2. 순수한 객체는 패키지명.클래스가 실제 객체의 이름이다.
// 
public class A01_Begin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01_Begin b1 = new A01_Begin();
		// javaexp.a08_relation.A01_Begin@58ceff1
		// 패키지명.클래스명@16진수주소값..
		
		System.out.println(b1);
		Person p01 = new Person();
	// javaexp.a08_relation.Person
		Man m01 = new Man();
		// 같은 곳에 동일이름의 class를 호출할 때는
		// 패키지.클래스명
		javaexp.a08_relation.Person 
			p02 = new javaexp.a08_relation.Person();
		
	}

}
// javaexp.a08_relation.Person
//class Person{}
