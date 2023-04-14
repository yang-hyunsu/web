package javaexp.a08_relation;
import javaexp.a08_relation.vo.Music;
import javaexp.a08_relation.vo.Person;
public class A02_CallVO {
	// ex)javaexp.a08_relation.vo 안에 Music VO클래스 선언 
	//    Music 제목, 가수, 발매연도
	///   main()호출
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person("홍길동",25,"부산");
		System.out.println(p01.getName());
		System.out.println(p01.getAge());
		System.out.println(p01.getLoc());
		Music m01 = new Music("I AM","IVE", 2023);
		System.out.println(m01.getTitle());
		System.out.println(m01.getSinger());
		System.out.println(m01.getPubYear());
		
	}

}
