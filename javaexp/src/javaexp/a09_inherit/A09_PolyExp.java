package javaexp.a09_inherit;

public class A09_PolyExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d1 = new NormalDuck();
		d1.flying();
		Duck d2 = new Mallard();
		d2.flying();
	}

}
class Duck{
	private String kind;
	public Duck(String kind) {
		this.kind = kind;
	}
	public void flying() {
		System.out.println(kind +" 날려고 날개을 움직이다!");
	}
}
class NormalDuck extends Duck{
	public NormalDuck() {
		super("집오리");
	}
	@Override
	public void flying() {
		super.flying();
		System.out.println("날지 못 합니다.~~");
	}
}
class Mallard extends Duck{
	public Mallard() {
		super("청둥오리");
	}
	@Override
	public void flying() {
		super.flying();
		System.out.println("날아다닙니다. 훨훨!!~");
	}
}
/*
		ex) Duck 상위
				종류
				flying() 재정의
			NormalDuck
				집오리
				flying() 날지 못한다.
			Mallard	
				청둥오리
				flying() 날아 다니다.
			상/하위 구조로 상속하고 다형성을 처리하여 메서드로 호출.

*/

