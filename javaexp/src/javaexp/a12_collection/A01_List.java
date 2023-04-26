package javaexp.a12_collection;

import java.util.ArrayList;

public class A01_List {

	public static void main(String[] args) {
		// ctrl+shift+o : 자동 import
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person("홍길동",25,"서울"));
		plist.add(new Person("김길동",27,"부산"));
		plist.add(new Person("신길동",31,"대구"));
		plist.add(new Person("오길동",20,"광주"));
		plist.add(new Person("마길동",35,"제주"));
		Person p01 = plist.get(1);
		System.out.println("두번째 객체의 이름:"+p01.getName());
		System.out.println("5번째 객체의 이름:"+plist.get(4).getName());
		// ex) plist  forEach, for(int idx) 구문을 처리해보세요.
		for(Person p : plist) {
			System.out.print(p.getName()+"\t");
			System.out.print(p.getAge()+"\t");
			System.out.print(p.getLoc()+"\n");
		}
		for(int idx=0;idx<plist.size();idx++) {
			Person p = plist.get(idx);
			System.out.print(p.getName()+"\t");
			System.out.print(p.getAge()+"\t");
			System.out.print(p.getLoc()+"\n");			
		}
		
		
		
		// ex) Student 반, 번호, 이름, 점수 속성 VO ArrayList에 할당
		//     3개 할당 후, 마지막객체의 이름 호출, 첫번째 객체의 점수호출.
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(1,1,"홍길동",80));
		slist.add(new Student(2,3,"김길동",70));
		slist.add(new Student(4,2,"마길동",90));
		System.out.println("마지막 학생의 이름:"+slist.get(2).getName());
		System.out.println("첫번째 학생의 점수:"+slist.get(0).getPoint());
		System.out.println("반\t번호\t이름\t점수");
		for(Student st:slist) {
			System.out.print(st.getCls()+"\t");
			System.out.print(st.getNo()+"\t");
			System.out.print(st.getName()+"\t");
			System.out.print(st.getPoint()+"\n");
		}
		
	}

}
class Student{
	private int cls;
	private int no;
	private String name;
	private int point;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int cls, int no, String name, int point) {
		this.cls = cls;
		this.no = no;
		this.name = name;
		this.point = point;
	}
	public int getCls() {
		return cls;
	}
	public void setCls(int cls) {
		this.cls = cls;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}

class Person{
	private String name;
	private int age;
	private String loc;
	public Person() {
	}
	public Person(String name, int age, String loc) {
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}


