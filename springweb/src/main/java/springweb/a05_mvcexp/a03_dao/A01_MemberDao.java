package springweb.a05_mvcexp.a03_dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import springweb.a05_mvcexp.z01_vo.Dept;
import springweb.a05_mvcexp.z01_vo.Emp;
import springweb.a05_mvcexp.z01_vo.EmpDept;
import springweb.a05_mvcexp.z01_vo.EmpJob;
import springweb.a05_mvcexp.z01_vo.Employee;
import springweb.a05_mvcexp.z01_vo.Job;
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
	public List<Emp> exp12EmpList(Map sch);
	public List<Emp> exp13EmpList(Map sch);	
	public void exp14DeptInsert(@Param("no") int deptno,
			@Param("dpartnm") String dname,
			@Param("location") String loc);	
	public List<Emp> exp15EmpList(
			@Param("startDte") String startDte,
			@Param("endDte") String endDte);	
	public List<Student> exp16studList(@Param("name") String name,
			  @Param("stPt") int stPt,
            @Param("edPt") int edPt);
	public Employee exp17getEmpLoyee(
			@Param("id") int employee_id); 	
	public Job exp18getJob(@Param("id") String id);
	public List<String> exp19getEnames(
			@Param("minSal") int minSal,			
			@Param("mxSal") int mxSal);	
	public List<String> getCities(@Param("id") String id);
	public List<Emp> getEmpResultExp();
	public List<Dept> getDeptResultExp();
	public List<EmpDept> getEmpDeptList(
			  @Param("ename") String ename,
			  @Param("dname") String dname);  
	public List<EmpJob> getEmpJobList(
			  @Param("first_name") String first_name,
			  @Param("job_title") String job_title);
	@Select("SELECT count(*) FROM emp WHERE deptno = #{deptno}")
	public int getDeptnoCnt(@Param("deptno") int deptno);
	
	@Select("SELECT count(*) FROM emp "
			+ "WHERE sal BETWEEN #{minSal} AND #{maxSal}")
	public int getSalCnt2(@Param("minSal") int minSal, 
						  @Param("maxSal") int maxSal);
	@Insert("INSERT INTO dept01 "
			+ "values(#{deptno},#{dname},#{loc})")
	public void insertDept(@Param("deptno") int deptno,
			@Param("dname") String dname, 
			@Param("loc") String loc);
//	@Update("UPDATE student02 SET name=#{name} WHERE sno=#{sno}")
//	public void updateStudent(@Param("name") String name,
//			@Param("kor") int kor, 
//			@Param("eng") int eng,
//			@Param("math") int math,
//			@Param("sno") int sno);
	@Update("UPDATE student09 SET name=#{name}, kor=#{kor}, eng=#{eng}, math=#{math} WHERE sno=#{sno}")
	public void updateStudent(@Param("name") String name,
				@Param("kor") int kor, 
				@Param("eng") int eng,
				@Param("math") int math,
				@Param("sno") int sno);
	
	
	
	@Delete("DELETE FROM emp02 WHERE empno = #{empno}")
	public void delEmp(@Param("empno") int empno);	
	
	
	public List<Emp> getDynamicSQL(@Param("ename") String ename);
	public List<Emp> getEmpByEmpnos(
		    @Param("empnos") List<Integer> empnos);
	
}
/*
getSalCnt2
insertDept
updateStudent
delEmp 

SELECT count(*) FROM emp WHERE sal BETWEEN #{minSal} AND #{maxSal}
INSERT INTO dept01 values(#{deptno},#{dname},#{loc})
UPDATE student02 SET name=#{name}, kor=#{kor}, eng=#{eng}, math=#{math} WHERE sno=#{sno}
DELETE FROM emp02 WHERE empno = #{empno}

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