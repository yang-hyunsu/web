package frontWeb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class A02_EmpDao {
	// 1. 필드선언(핵심 내장 객체)
	// 1) 연결 - 서버연결
	private Connection con;
	// 2) 대화 - 명령/입력
	private Statement stmt;
	// 3) 결과 - 데이터를 가져오는 것
	private ResultSet rs;

	// 2. 기능 메서드 선언..
	// 1) 사원 전체 정보 출력..
	public void empListAll() {
		// # 전체적으로 예외 처리.
		// 연결
		try {
			con = DB.con();
			// 대화할 내용
			String sql = "SELECT * FROM emp02";
			// 대화할 수 있는 객체는 연결(con)에 의해 생성
			stmt = con.createStatement();
			// 결과(ResultSet)
			// Statement객체가 가지고 있는 executeQuery()
			// 메서드를 통해서 ResultSet객체를 생성..
			rs = stmt.executeQuery(sql);
			int row = 1;
			while (rs.next()) { // 행단위로 이동 다음 행이 없을 떄까지
				System.out.print("행번호:" + row++);
				System.out.print("\t" + rs.getInt("empno"));
				System.out.print("\t" + rs.getString("ename"));
				System.out.print("\t" + rs.getString("job"));
				System.out.print("\t" + rs.getInt("mgr"));
				System.out.print("\t" + rs.getDate("hiredate"));
				System.out.print("\t" + rs.getDouble("sal"));
				System.out.print("\t" + rs.getDouble("comm"));
				System.out.println("\t" + rs.getInt("deptno"));
				// ex) 사원명과 관리자번호, 급여 출력해보세요
			}
			/*
			 * rs.next() : 반복을 통해서 행단위로 커서를 위치시키는 다음 행이 데이터가 없으면 false 있으면 true
			 * while(rs.next()){ // 다음 행이 없을 때까지 반복 System.out.println(cnt++) }
			 * rs.get데이터유형("컬럼명")
			 * 
			 */
			// 자원해제 :역순위
			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("DB 처리 예외:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("공통 예외:" + e.getMessage());
		} finally {
			// 해제되지 않은 자원해제 처리..
			DB.close(rs, stmt, con);
		}
	}
	// 12:05~
	public void paramEmp(String ename) {
		System.out.println("메서드 호출!");
		String sql = "	SELECT * \r\n"
				+ "	FROM EMP02\r\n"
				+ "	WHERE ename LIKE '%'||'"+ename+"'||'%'";
		System.out.println("매개변수:"+ename);
		System.out.println("sql:"+sql);
		try {
			// 1. 연결(예외처리)
			con = DB.con();
			
			System.out.println("처리1");
			// 2. 대화
			stmt = con.createStatement();
			System.out.println("처리2");
			// 3. 결과
			rs = stmt.executeQuery(sql);
			System.out.println("처리3");
			while(rs.next()) { // 행단위 이동 커서
				// 열단위 호출 rs.get유형("컬럼명")
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getDouble("sal")+"\n");
				System.out.println("처리4");
			}
			// 4. 자원해제			
			rs.close();
			stmt.close();
			con.close();
			System.out.println("처리5");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("일반예외:"+e.getMessage());
		} finally {
			DB.close(rs, stmt, con);
		}
		

	}
	// A03_DeptDao.java
	// 부서명을 키워드 검색 처리.(메서드 추가)
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A02_EmpDao dao = new A02_EmpDao();
		dao.empListAll();
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 사원명을 입력하세요:");
		String schEname = sc.nextLine();
		dao.paramEmp(schEname); // 변수가 아닌 문자열..

	}

}
