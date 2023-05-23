package frontWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB연동 공통 클래스..
public class DB {
// DB.con();
    public static Connection con() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 예외: " + e.getMessage());
        }
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "scott";
        String password = "tiger";
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("DB 접속 성공");
        return conn;
    }
    public static void rollback(Connection con) {
    	try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("롤백예외:"+e.getMessage());
		}
    }
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("ResultSet 닫기 실패: " + e.getMessage());
        }
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            System.out.println("Statement 닫기 실패: " + e.getMessage());
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Connection 닫기 실패: " + e.getMessage());
        }
        rs = null;
        stmt = null;
        conn = null;
        	
    }
	
}
