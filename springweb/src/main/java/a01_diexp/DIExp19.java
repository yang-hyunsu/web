package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z03_vo.Dept;
import a01_diexp.z03_vo.Member;
import a01_diexp.z03_vo.Music;

public class DIExp19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨테이너 경로
		String path="a01_diexp\\di19.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		// DL(Dependency Lookup) 객체를 찾는 처리
		Music music = ctx.getBean("music", Music.class);
		Dept dept = ctx.getBean("dept", Dept.class);
		Member member = ctx.getBean("member", Member.class);
		music.setSinger("이효리");
		dept.setDname("홍길동");
		member.setId("himan");
		System.out.println(music.getSinger());
		System.out.println(dept.getDname());
		System.out.println(member.getId());
		ctx.close();
		System.out.println("종료");
		/*
		z03_vo
			Music, Dept, Member 복사해서 위치시키고
		해당 패키지에 있는 객체를 사용할 수 있게 처리한 후
		호출하세요
		 * */
	}

}
