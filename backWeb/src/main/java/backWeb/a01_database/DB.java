package backWeb.a01_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB연동 공통 클래스..
public class DB {
// DB.con();
	public static Connection con() throws SQLException {
		Connection con =null;
		// 1. jdbc메모리 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 예외:"+e.getMessage());
		}
		// 2. 연결정보 처리
		String info = "jdbc:oracle:thin:@localhost:1521:xe";
		//    DriverManager : jdbc드라이버의 클래스 중에서
		//    특정한 객체가 메모리에 로딩된 상황
		///   접속정보를 매개변수로 계정과 비번을 받아서
		//    특정 서버에 접속하고, 그 접속한 객체를 호출하는 곳에
		//    리턴 처리..
		con = DriverManager.getConnection(info,"scott","tiger");
		System.out.println("DB 접속 성공");
		return con;
	}
	
	
}
