package springweb.a05_mvcexp.a02_service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a05_mvcexp.a03_dao.A01_MemberDao;
import springweb.a05_mvcexp.z01_vo.Dept;
import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.EmpDept;
import springweb.a05_mvcexp.z01_vo.EmpJob;
import springweb.a05_mvcexp.z01_vo.Employee;
import springweb.a05_mvcexp.z01_vo.Job;
import springweb.a05_mvcexp.z01_vo.Member;
import springweb.a05_mvcexp.z01_vo.Student;

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
		System.out.println("연습12 emp 조회");
		Map<String,String> sch = new HashMap<String,String>();
		sch.put("ename_sch","A");
		sch.put("job_sch","ER");
		for(Emp e:dao.exp12EmpList(sch)){
			System.out.print(e.getEname()+"\t");
			System.out.print(e.getJob()+"\n");
		}	
		System.out.println("연습13 emp 조회");
		Map<String,String> sch2 = new HashMap<String, String>();
		sch2.put("job01","CLERK");
		sch2.put("job02","MANAGER");
		for(Emp e:dao.exp13EmpList(sch2)){
			System.out.print(e.getEname()+"\t");
			System.out.println(e.getJob()+"\n");
		}
		System.out.println("연습14 dept01입력");
		dao.exp14DeptInsert(22,"교육","부산");
		System.out.println("연습15 사원입사일로 검색");
		for(Emp emp:dao.exp15EmpList("1981-01-01","1981-12-31")){
			System.out.print(emp.getEname()+"\t");
			System.out.print(emp.getHiredate()+"\n");
		}	
		System.out.println("연습16 학생 평균 점수 검색");
		for(Student std:dao.exp16studList("길동",50,100)){
			System.out.print(std.getName()+"\t");
			System.out.print((std.getKor()+std.getEng()+
					std.getMath())/3+"\n");
		}
		System.out.println("연습17 사원정보");
		Employee emp =dao.exp17getEmpLoyee(100);
		System.out.print(emp.getEmployee_id()+"\t");
		System.out.print(emp.getFirst_name()+"\t");
		System.out.print(emp.getEmail()+"\n");
		System.out.println("연습18 직책정보");		
		Job job = dao.exp18getJob("AD_PRES");
		System.out.println(job.getJob_id());
		System.out.println(job.getJob_title());
		System.out.println(job.getMin_salary());
		System.out.println(job.getMax_salary());
		System.out.println("연습19 사원명 리스트");		
		for(String name:dao.exp19getEnames(1000,3000)){
			System.out.println(name);
		}
		System.out.println("연습20 도시 검색");
		for(String city:dao.getCities("US")){
			System.out.println(city);
		}
		System.out.println("연습21 resultMap 연습");
		for(Emp e:dao.getEmpResultExp()) {
			System.out.print(e.getEmpno()+"\t");
			System.out.print(e.getEname()+"\t");
			System.out.print(e.getSal()+"\n");
		}
		System.out.println("연습22 resultMap association 연습");
		
		
		for(EmpDept ed:dao.getEmpDeptList("A", "SAL")) {
			Emp e = ed.getEmp();
			Dept d = ed.getDept();
			System.out.print(e.getEmpno()+"\t");
			System.out.print(e.getEname()+"\t");
			System.out.print(e.getJob()+"\t");
			System.out.print(e.getSal()+"\t");
			System.out.print(d.getDeptno()+"\t");
			System.out.print(d.getDname()+"\n");
		}
		System.out.println("연습23 resultMap association 연습");
		
		
		for(EmpJob ej:dao.getEmpJobList("o", "Acc")) {
			Employee e = ej.getEmployee();
			Job j = ej.getJob();
			System.out.print(e.getEmployee_id()+"\t");
			System.out.print(e.getFirst_name()+"\t");
			System.out.print(e.getLast_name()+"\t");
			System.out.print(e.getEmail()+"\t");
			System.out.print(e.getSalary()+"\t");
			System.out.print(j.getJob_id()+"\t");
			System.out.print(j.getJob_title()+"\n");
		}	
		System.out.println("연습24 부서의 사원수 :");
		System.out.println(dao.getDeptnoCnt(30)+"명");
		
		
	}
	
	
}
