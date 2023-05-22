package frontWeb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class A03_DeptDao {
	// 부서정보 처리 dao
	// 1. 공통 필드 선언
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void showDeptList() {
		// 2. 연결(예외처리)
		try {
			con = DB2.con();
			// 3. 대화처리
			
			String sql = "select * from dept01";
			stmt = con.createStatement();
			// 4. 실행결과
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getString("loc")+"\n");
			}
			// 5. 자원해제
			rs.close();
			stmt.close();
			con.close();
						
		} catch (SQLException e) {
			System.out.println("DB처리 관련 예외:"+e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외:"+e.getMessage());
		} finally {
			// 자원이 남았을 때, 예외 처리..
			DB2.close(rs, stmt, con);
		}

	}
	public void deptDnameSch(String dname) {
		String sql = "SELECT *\r\n"
				+ "FROM DEPT01 d \r\n"
				+ "WHERE dname LIKE '%'||'"+dname+"'||'%'";
		// 1. 연결(예외)
		try {
			con = DB.con();
			// 2. 대화
			stmt = con.createStatement();
			// 3. 결과
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("deptno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.println(rs.getString("loc")+"\t");
			}
			// 4. 자원해제			
			rs.close();
			stmt.close();
			con.close();			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			DB.close(rs, stmt, con);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A03_DeptDao dao = new A03_DeptDao();
		dao.showDeptList();
		//dao.deptDnameSch("A");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 사원명:");
		dao.deptDnameSch(sc.nextLine());
	}

}
