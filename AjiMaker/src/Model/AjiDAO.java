package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AjiDAO {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	public void getCon() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@gjaischool-b.ddns.net:1525:xe";
			String user = "campus_d_0120_2";
			String password = "smhrd2";
			
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}

		// 준비물 권한 확인
		// DriverManager가 내가 정말 권한을 가지고 있는지 확인
		// 권한을 받으면 아래쪽에서 계속 권한 받을거를 사용

		}
	
	public void getClose() {
		
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int ajiJoin(AjiDTO dto) {
		
		int row = 0;
		
		getCon();
		try {
		String sql = "insert into join values(?,?)";
		
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, dto.getID());
		psmt.setString(2, dto.getPW());

		row = psmt.executeUpdate(); 

	} catch (SQLException e) {
		System.out.println("회원가입 실패");
		e.printStackTrace();
	} finally {
		getClose();
	}
	return row;
		
	}
	
	
	
}
