package frontWeb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import frontWeb.vo.Employee;

/*
# Dao(Database Access Object)
1. 프로그램은 기능별 모듈 분리화 정책을 하여야
	추후, 확장성이 뛰어나고, 다른 코드에 영향력이
	적어 유지보수게 효과적으로
2. 기능적을 다른 내용을 분리시켜서 사용하세요
	1) console 처리 : 객체를 생성해 매개변수를 데이터를 받고
		리턴값으로 결과를 리턴처리
	2) 웹화면 처리 : 요청값을 데이터를 받아서 리턴할 VO 객체를
		받아서 화면에 출력한다.
		
 * 
 * */
public class A04_PreParedDao {
	// 필드
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	/*
SELECT * 
FROM EMPLOYEES
WHERE FIRST_NAME || last_name LIKE '%'||?||'%'
AND salary BETWEEN ? AND ?
	 * */
	public List<Employee> getEmpList(Map<String,String> sch){
		List<Employee> elist = new ArrayList<Employee>();
		String sql = "SELECT * \r\n"
				+ "FROM EMPLOYEES\r\n"
				+ "WHERE FIRST_NAME || last_name LIKE '%'||?||'%'\r\n"
				+ "AND salary BETWEEN ? AND ?";
		try {
			con = DB.con();
			// 초기에 sql을 넘기면서 pstmt 객체 생성..
			pstmt = con.prepareStatement(sql);
			// pstmt.set데이터유형(순서-1부터, 입력할 데이터)
			pstmt.setString(1, sch.get("name")); // 
			pstmt.setDouble(2, Double.parseDouble(sch.get("minSal")));
			pstmt.setDouble(3, Double.parseDouble(sch.get("maxSal")));
			rs = pstmt.executeQuery();
			/*
			Employee(int employee_id, String first_name, String last_name, String email, String phone_number,
			Date hire_date, String job_id, double salary, double commission_pct, int manager_id, int department_id)
			 * */
			while(rs.next()) {
				elist.add(new Employee(
						   rs.getInt("employee_id"),
						   rs.getString("first_name"),
						   rs.getString("last_name"),
						   rs.getString("email"),
						   rs.getString("phone_number"),
						   rs.getDate("hire_date"),
						   rs.getString("job_id"),
						   rs.getDouble("salary"),
						   rs.getDouble("commission_pct"),
						   rs.getInt("manager_id"),
						   rs.getInt("department_id")
						));
			}
			rs.close();
			pstmt.close();
			con.close();
			
			
		} catch (SQLException e) {
			System.out.println("DB관련:"+e.getMessage());
		} catch(Exception e) {
			System.out.println("기타예외:"+e.getMessage());
		}finally {
			DB.close(rs, pstmt, con);
		}
		return elist;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A04_PreParedDao dao = new A04_PreParedDao();
		Map<String, String> sch = new HashMap<String, String>();
		// name minSal maxSal
		sch.put("name", "A");
		sch.put("minSal", "0");
		sch.put("maxSal", "12000");	
		for(Employee e:dao.getEmpList(sch)) {
			System.out.print(e.getEmployee_id()+"\t");
			System.out.print(e.getLast_name()+"\t");
			System.out.print(e.getFirst_name()+"\t");
			System.out.print(e.getEmail()+"\t");
			System.out.print(e.getSalary()+"\t");
			System.out.print(e.getDepartment_id()+"\n");
		}
	}

}
