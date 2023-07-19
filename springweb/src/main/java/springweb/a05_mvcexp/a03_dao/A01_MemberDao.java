package springweb.a05_mvcexp.a03_dao;

import java.util.Date;
import java.util.List;

import springweb.a05_mvcexp.z01_vo.Dept;
import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.Location;
import springweb.a05_mvcexp.z01_vo.Member;
import springweb.a05_mvcexp.z01_vo.Student;
// springweb.a05_mvcexp.a03_dao.A01_MemberDao
public interface A01_MemberDao {
	public List<Member> memberList(Member sch);
	public String exp01();
	public String daoexp2();
	public int daoexp3();
	public String exp04(String ename);
	public double exp05(int empno);
	public int exp06(String ename);
	public Date exp07(int empno);
	// INSERT INTO dept01 values(11,'인사','서울')
	public void exp08Ins(Dept ins);
	public void exp09insStu(Student ins);
	public void exp10InsLoc(Location ins);
	public List<Emp> exp11EmpList(Emp sch);
}
/*

	private int sno;
	private String name;
	private int kor;
	private int eng;
	private int math;

==> Dao 를 만들려면?
  sql
  매개변수
  리턴데이터
  ==> Mapper.xml ==> A01_MemberDao상속받은 실제객체가 만들어진다.
  연동 규칙을 설정
    mapper.xml     interface
  1. namespce      springweb.a05_mvcexp.a03_dao.A01_MemberDao
  2. id            메서드명 memberList
  3. parameterType Member:공통mybatis에서 지정이름
  4. resutType     List<Member>
  5. sql
  	  getXXX호출.   ==> 실제 객체 메서드가 만들어져서 사용가능하다.
  	  
  
  
 */