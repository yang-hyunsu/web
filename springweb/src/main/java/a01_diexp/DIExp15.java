package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import backendWeb.z01_vo.Person;
import backendWeb.z01_vo.Product;

public class DIExp15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨테이너 경로
		String path="a01_diexp\\di15.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		// DL(Dependency Lookup) 객체를 찾는 처리
		Object obj = ctx.getBean("obj", Object.class);
		System.out.println("컨테이너의 객체호출:"+obj);
		Person p01 = ctx.getBean("p01", Person.class);
		Product prod1 = ctx.getBean("prod1", Product.class);
		Product prod2 = ctx.getBean("prod2", Product.class);
		System.out.println(p01.getName());
		System.out.println(prod1.getName());
		System.out.println(prod2.getName());
		
		
		ctx.close();
		System.out.println("종료");
	}

}
