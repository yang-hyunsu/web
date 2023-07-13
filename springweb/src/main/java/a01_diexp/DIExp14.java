package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Sensor;

public class DIExp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨테이너 경로
		String path="a01_diexp\\di14.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		// DL(Dependency Lookup) 객체를 찾는 처리
		Object obj = ctx.getBean("obj", Object.class);
		System.out.println("컨테이너의 객체호출:"+obj);
		Sensor sensor01 = ctx.getBean("sensor01", Sensor.class);
		System.out.println(sensor01.getAgent());
		for(String str:sensor01.getAgent()) {
			System.out.println(str);
		}
		// 
		
		ctx.close();
		System.out.println("종료");
	}

}