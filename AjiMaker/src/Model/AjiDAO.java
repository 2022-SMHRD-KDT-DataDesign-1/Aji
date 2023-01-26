package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class AjiDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	PreparedStatement psmt2 = null;
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
			if (rs != null) {
				rs.close();
			}
			if(psmt2 != null) {
				psmt2.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 회원가입
	public int ajiJoin(AjiDTO dto) {
		
		Random rd = new Random();
		
		int row = 0;

		getCon();

		try {
			
			int hp = rd.nextInt(20)+1;
			int fill = rd.nextInt(20)+1;
			int rel = rd.nextInt(20)+1;
			int stress = rd.nextInt(20)+1;
			int hunt = rd.nextInt(20)+1;
			int inde = rd.nextInt(20)+1;
			
			String sql = "insert into ajiuser values(?,?)";
			String sql2 = "insert into ajistatus values(?,?,?,?,?,?,?)";
					
			psmt = conn.prepareStatement(sql);
			psmt2 = conn.prepareStatement(sql2);
			
			psmt.setString(1, dto.getID());
			psmt.setString(2, dto.getPW());
			
			psmt2.setInt(1, hp);
			psmt2.setInt(2, fill);
			psmt2.setInt(3, rel);
			psmt2.setInt(4, stress);
			psmt2.setInt(5, hunt);
			psmt2.setInt(6, inde);
			psmt2.setString(7, dto.getID());

			row = psmt.executeUpdate();
			row = psmt2.executeUpdate();

		} catch (SQLException e) {
			System.out.println("회원가입 실패");
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}

	// 로그인
	public boolean ajiLogin(AjiDTO dto) {

		boolean res = false;
		getCon();

		try {

			String sql = "select * from ajiuser where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getID());
			psmt.setString(2, dto.getPW());

			rs = psmt.executeQuery();

			res = rs.next();

		} catch (SQLException e) {
			System.out.println("로그인 실패");
			e.printStackTrace();
		} finally {
			getClose();
		}
		return res;

	}

	// 특정 유저의 아지의 정보 불러오기
	public AjiDTO selectAji(AjiDTO dto) {

		getCon();

		try {

			// sql문 : select
			String sql = "select * from ajistatus where id = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getID());

			// select : executeQuery()
			rs = psmt.executeQuery();

			// ResultSet의 결과값은 화살표(커서)
			if (rs.next()) {
				int hp = rs.getInt(1);
				int fill = rs.getInt(2);
				int rel = rs.getInt(3);
				int stress = rs.getInt(4);
				int hunt = rs.getInt(5);
				int inde = rs.getInt(6);
				String id = rs.getString(7);
				
				dto = new AjiDTO(id, hp, fill, rel, stress, hunt, inde);
			}

		} catch (SQLException e) {
			System.out.println("조회 실패");
			e.printStackTrace();
		} finally {
			getClose();
		}
		return dto;

	}

	// 특정 유저의 아지에 대한 정보 업데이트
	public int ajiUpdate(AjiDTO dto) {

		getCon();

		int row = 0;

		try {

			String sql = "update ajistatus set hp = ?, fill = ?, rel = ?, stress = ?, hunt = ?, inde = ? where id = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getID());

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("업데이트 실패");
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

}
