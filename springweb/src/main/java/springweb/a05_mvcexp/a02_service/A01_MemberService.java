package springweb.a05_mvcexp.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a05_mvcexp.a03_dao.A01_MemberDao;
import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.Member;

@Service
public class A01_MemberService {
	@Autowired
	private A01_MemberDao dao; // 인터페이스 = new 실제객체()
	
	public List<Member> memberList(Member sch){
		if(sch.getId()==null) sch.setId("");
		if(sch.getName()==null) sch.setName("");
		return dao.memberList(sch);
	}
	public void daoexp() {
		System.out.println("#Dao연습#");
		System.out.println("첫번째연습:"+dao.exp01());
		System.out.println("두번째연습:"+dao.daoexp2());
		System.out.println("세번째연습:"+dao.daoexp3());
		System.out.println("연습04:"+dao.exp04("KING"));
		System.out.println("연습05:"+dao.exp05(7844));
		System.out.println("연습06:"+dao.exp06("CLARK"));
		System.out.println("연습07:"+dao.exp07(7844));
		System.out.println("연습08 입력:");
		
		// 11,'인사','서울'
		//dao.exp08Ins(new Dept(12,"재무","대전"));
		System.out.println("연습09");
		// (int location_id, String street_address, String postal_code, String city, String state_province,String country_id)
		//dao.exp10InsLoc(new Location(1001,"인천 계양" , "55555", "인천", "대한민국", "KR"));
		System.out.println("연습11 emp 조회");
		for(Emp emp:dao.exp11EmpList(new Emp("",1000,3000))){
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getJob()+"\t");
			System.out.print(emp.getSal()+"\n");
		}		
	
	}
}
