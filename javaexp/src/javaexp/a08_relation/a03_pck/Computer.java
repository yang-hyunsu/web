package javaexp.a08_relation.a03_pck;

import javaexp.a08_relation.a04_pck.Mouse;

public class Computer {
	Mouse m1; // 
//	KeyBoard k1; 외부패지라 접근 불가능
	void call() {
		m1 = new Mouse(); // public
//		m1 = new Mouse("Q마우스"); // X 접근불가능하다.
	}
}
// ex) Mouse에 생성자를 2개(생성자 오버로딩규칙) public/X
//     선언하고.. call()에서 객체 생성 여부를 확인

