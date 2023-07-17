package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.HPUser;

public class DIExp17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨테이너 경로
		String path="a01_diexp\\di17.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		// DL(Dependency Lookup) 객체를 찾는 처리
		HPUser us01 = ctx.getBean("us01", HPUser.class);
		System.out.println("컨테이너의 객체호출:"+us01);
		us01.usingMyPhone();
		ctx.close();
		System.out.println("종료");
	}

}
