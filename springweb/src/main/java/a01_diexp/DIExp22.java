package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z06_callMvc.A01_Controller;
import a01_diexp.z06_callMvc.A02_Service;
import a01_diexp.z06_callMvc.A03_Dao;

public class DIExp22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨테이너 경로
		String path="a01_diexp\\di22.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		// DL(Dependency Lookup) 객체를 찾는 처리
		A01_Controller obj1 = ctx.getBean("a01_Controller", A01_Controller.class);
		A02_Service obj2 = ctx.getBean("a02_Service", A02_Service.class);
		A03_Dao obj3 = ctx.getBean("a03_Dao", A03_Dao.class);
		obj1.controllerMsg();
		obj2.serviceMsg();
		obj3.daoMsg();
	
		ctx.close();
		System.out.println("종료");
		// z06_callMvc 패키지에
		// @Controller
		// @Service
		// @Repository 
		// 해당 클래스 3개를 만들어
		// di22.xml에서 객체화하여 특정 메서드가
		// 호출되게 하세요..
		
	}

}
