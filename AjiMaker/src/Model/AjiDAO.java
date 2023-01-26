package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.ArrayList;

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
			System.out.println("Aji : 데이터베이스 연결 실패");
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
//	public int ajiJoin(AjiDTO dto) {
//		
//		Random rd = new Random();
//		
//		int row = 0;
//
//	}

	public ArrayList<AjiDTO> status() {
		
		ArrayList<AjiDTO> list = new ArrayList<>();
		getCon();

		try {
			
			String sql = "select * from ajistatus where id='aji'";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				int hp = rs.getInt("hp");
				int fill = rs.getInt("fill");
				int rel = rs.getInt("rel");
				int stress = rs.getInt("stress");
				int hunt = rs.getInt("hunt");
				int inde = rs.getInt("inde");
				AjiDTO dto = new AjiDTO(hp, fill, rel, stress, hunt, inde);
				list.add(dto);
			}

		} catch (SQLException e) {
			System.out.println("status : 데이터베이스 연결 실패");
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;

	}

	// 로그인
//	public boolean ajiLogin(AjiDTO dto) {
//
//		boolean res = false;
//		getCon();
//
//		try {
//
//			String sql = "select * from ajiuser where id = ? and pw = ?";
//
//			psmt = conn.prepareStatement(sql);
//
//			psmt.setString(1, dto.getID());
//			psmt.setString(2, dto.getPW());
//
//			rs = psmt.executeQuery();
//
//			res = rs.next();
//
//		} catch (SQLException e) {
//			System.out.println("로그인 실패");
//			e.printStackTrace();
//		} finally {
//			getClose();
//		}
//		return res;
//
//=======
	private void psmtUpdate(AjiDTO dto, int hp, int fill, int rel, int stress, int hunt, int inde) {
		int row;
		try {
			String sql = "update ajistatus set hp=?, fill = ?, rel=?, stress=?, hunt=?, inde=? where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, hp);
			psmt.setInt(2, fill);
			psmt.setInt(3, rel);
			psmt.setInt(4, stress);
			psmt.setInt(5, hunt);
			psmt.setInt(6, inde);
			psmt.setString(7, dto.getID());

			row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("데이터 업데이트 성공");
			} else {
				System.out.println("데이터 업데이트 실패");
			}
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
			e.printStackTrace();
		} finally {
			getClose();
		}

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

	// chapter 1
	public void eatMilk1(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 3;
		int fill = status().get(0).getFill() + 5;
		int rel = status().get(0).getRel() + 3;
		int stress = status().get(0).getStress() - 3;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void eatBabysoup1(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 5;
		int fill = status().get(0).getFill() + 3;
		int rel = status().get(0).getRel() + 3;
		int stress = status().get(0).getStress() - 5;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playRobot1(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 2;
		int fill = status().get(0).getFill() - 2;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 2;
		int hunt = status().get(0).getHunt() + 3;
		int inde = status().get(0).getInde() + 3;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playBell1(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 2;
		int fill = status().get(0).getFill() - 2;
		int rel = status().get(0).getRel() + 1;
		int stress = status().get(0).getStress() - 2;
		int hunt = status().get(0).getHunt() + 2;
		int inde = status().get(0).getInde() - 1;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playDoll1(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 2;
		int fill = status().get(0).getFill() - 1;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 2;
		int hunt = status().get(0).getHunt() + 1;
		int inde = status().get(0).getInde() + 1;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void sleep1(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 4;
		int fill = status().get(0).getFill() - 5;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 5;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	// chapter 2

	public void eatChur2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 2;
		int fill = status().get(0).getFill() - 1;
		int rel = status().get(0).getRel() + 3;
		int stress = status().get(0).getStress() - 4;
		int hunt = status().get(0).getHunt() - 2;
		int inde = status().get(0).getInde() - 2;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void eatFeed2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 3;
		int fill = status().get(0).getFill() + 3;
		int rel = status().get(0).getRel() + 3;
		int stress = status().get(0).getStress() - 3;
		int hunt = status().get(0).getHunt() - 2;
		int inde = status().get(0).getInde() - 2;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void eatCan2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 5;
		int fill = status().get(0).getFill() + 5;
		int rel = status().get(0).getRel() + 5;
		int stress = status().get(0).getStress() - 5;
		int hunt = status().get(0).getHunt() - 3;
		int inde = status().get(0).getInde() - 3;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playFish2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 3;
		int fill = status().get(0).getFill() - 5;
		int rel = status().get(0).getRel() + 3;
		int stress = status().get(0).getStress() - 5;
		int hunt = status().get(0).getHunt() + 5;
		int inde = status().get(0).getInde() + 5;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playTower2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 3;
		int fill = status().get(0).getFill() - 4;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 2;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playBox2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 2;
		int fill = status().get(0).getFill() - 2;
		int rel = status().get(0).getRel() - 1;
		int stress = status().get(0).getStress() - 4;
		int hunt = status().get(0).getHunt() - 2;
		int inde = status().get(0).getInde() - 2;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void sleepBed2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 4;
		int fill = status().get(0).getFill() - 8;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 8;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void sleepOndol2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 6;
		int fill = status().get(0).getFill() - 9;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 9;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void bath2(AjiDTO dto) {

		int row = 0;
		status();
		int hp = status().get(0).getHp() - 10;
		int fill = status().get(0).getFill() - 10;
		int rel = status().get(0).getRel() - 20;
		int stress = status().get(0).getStress() + 20;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde() + 20;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void huntBug2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 5;
		int fill = status().get(0).getFill() - 5;
		int rel = status().get(0).getRel() - 5;
		int stress = status().get(0).getStress() - 5;
		int hunt = status().get(0).getHunt() + 7;
		int inde = status().get(0).getInde() + 7;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntBF2(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 7;
		int fill = status().get(0).getFill() - 7;
		int rel = status().get(0).getRel() - 5;
		int stress = status().get(0).getStress() - 5;
		int hunt = status().get(0).getHunt() + 8;
		int inde = status().get(0).getInde() + 8;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	// chapter 3
	public void eatChicken3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 8;
		int fill = status().get(0).getFill() + 8;
		int rel = status().get(0).getRel() + 5;
		int stress = status().get(0).getStress() - 5;
		int hunt = status().get(0).getHunt() + 1;
		int inde = status().get(0).getInde() - 3;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void eatChur3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 3;
		int fill = status().get(0).getFill() - 3;
		int rel = status().get(0).getRel() + 6;
		int stress = status().get(0).getStress() - 8;
		int hunt = status().get(0).getHunt() - 3;
		int inde = status().get(0).getInde() - 4;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void eatFeed3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 6;
		int fill = status().get(0).getFill() + 6;
		int rel = status().get(0).getRel() + 6;
		int stress = status().get(0).getStress() - 6;
		int hunt = status().get(0).getHunt() - 4;
		int inde = status().get(0).getInde() - 4;

		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void eatCatnip3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 6;
		int fill = status().get(0).getFill() - 6;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 10;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playFish3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 6;
		int fill = status().get(0).getFill() - 10;
		int rel = status().get(0).getRel() + 6;
		int stress = status().get(0).getStress() - 10;
		int hunt = status().get(0).getHunt() + 10;
		int inde = status().get(0).getInde() + 10;

		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playTower3(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 6;
		int fill = status().get(0).getFill() - 8;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 4;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playBox3(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 4;
		int fill = status().get(0).getFill() - 4;
		int rel = status().get(0).getRel() - 2;
		int stress = status().get(0).getStress() - 9;
		int hunt = status().get(0).getHunt() - 4;
		int inde = status().get(0).getInde() - 4;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playScratchr3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 6;
		int fill = status().get(0).getFill() - 6;
		int rel = status().get(0).getRel() - 3;
		int stress = status().get(0).getStress() - 11;
		int hunt = status().get(0).getHunt() + 6;
		int inde = status().get(0).getInde() + 6;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void sleepBed3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 8;
		int fill = status().get(0).getFill() - 16;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 16;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();

		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void sleepOndol3(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 10;
		int fill = status().get(0).getFill() - 15;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 15;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void Bath3(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 15;
		int fill = status().get(0).getFill() - 15;
		int rel = status().get(0).getRel() - 20;
		int stress = status().get(0).getStress() + 30;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde() + 25;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntBug3(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 10;
		int fill = status().get(0).getFill() - 10;
		int rel = status().get(0).getRel() - 10;
		int stress = status().get(0).getStress() - 10;
		int hunt = status().get(0).getHunt() + 11;
		int inde = status().get(0).getInde() + 11;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void hungBF3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 11;
		int fill = status().get(0).getFill() - 11;
		int rel = status().get(0).getRel() - 10;
		int stress = status().get(0).getStress() - 10;
		int hunt = status().get(0).getHunt() + 14;
		int inde = status().get(0).getInde() + 14;

		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void hungMouse3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 15;
		int fill = status().get(0).getFill() - 15;
		int rel = status().get(0).getRel() - 10;
		int stress = status().get(0).getStress() - 13;
		int hunt = status().get(0).getHunt() + 16;
		int inde = status().get(0).getInde() + 16;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntBird3(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 17;
		int fill = status().get(0).getFill() - 18;
		int rel = status().get(0).getRel() - 10;
		int stress = status().get(0).getStress() - 15;
		int hunt = status().get(0).getHunt() + 20;
		int inde = status().get(0).getInde() + 20;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	// chapter 4

	public void eatChicken4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 16;
		int fill = status().get(0).getFill() + 16;
		int rel = status().get(0).getRel() + 10;
		int stress = status().get(0).getStress() - 10;
		int hunt = status().get(0).getHunt() + 2;
		int inde = status().get(0).getInde() + 6;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void eatChur4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 6;
		int fill = status().get(0).getFill() - 6;
		int rel = status().get(0).getRel() + 12;
		int stress = status().get(0).getStress() - 16;
		int hunt = status().get(0).getHunt() - 6;
		int inde = status().get(0).getInde() - 8;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void eatFeed4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 12;
		int fill = status().get(0).getFill() + 12;
		int rel = status().get(0).getRel() + 12;
		int stress = status().get(0).getStress() - 12;
		int hunt = status().get(0).getHunt() - 5;
		int inde = status().get(0).getInde() - 5;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void eatSalmon4(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() + 17;
		int fill = status().get(0).getFill() + 17;
		int rel = status().get(0).getRel() + 12;
		int stress = status().get(0).getStress() - 15;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde() - 7;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void eatCatnip4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 10;
		int fill = status().get(0).getFill() - 10;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 16;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playFish4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 10;
		int fill = status().get(0).getFill() - 15;
		int rel = status().get(0).getRel() + 10;
		int stress = status().get(0).getStress() - 15;
		int hunt = status().get(0).getHunt() + 13;
		int inde = status().get(0).getInde() + 13;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playTower4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 10;
		int fill = status().get(0).getFill() - 12;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 8;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playBox4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 8;
		int fill = status().get(0).getFill() - 8;
		int rel = status().get(0).getRel() - 4;
		int stress = status().get(0).getStress() - 15;
		int hunt = status().get(0).getHunt() - 8;
		int inde = status().get(0).getInde() - 8;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playBall4(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 10;
		int fill = status().get(0).getFill() - 10;
		int rel = status().get(0).getRel() - 6;
		int stress = status().get(0).getStress() - 15;
		int hunt = status().get(0).getHunt() + 4;
		int inde = status().get(0).getInde() + 4;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playTree4(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 20;
		int fill = status().get(0).getFill() - 20;
		int rel = status().get(0).getRel() - 10;
		int stress = status().get(0).getStress() - 20;
		int hunt = status().get(0).getHunt() + 20;
		int inde = status().get(0).getInde() + 20;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void sleepBed4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 15;
		int fill = status().get(0).getFill() - 20;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 19;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void sleepOndol4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 15;
		int fill = status().get(0).getFill() - 18;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 18;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void Bath4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 18;
		int fill = status().get(0).getFill() - 18;
		int rel = status().get(0).getRel() - 22;
		int stress = status().get(0).getStress() + 35;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde() + 30;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntBug4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 15;
		int fill = status().get(0).getFill() - 15;
		int rel = status().get(0).getRel() - 15;
		int stress = status().get(0).getStress() - 16;
		int hunt = status().get(0).getHunt() + 15;
		int inde = status().get(0).getInde() + 15;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntBF4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 15;
		int fill = status().get(0).getFill() - 15;
		int rel = status().get(0).getRel() - 14;
		int stress = status().get(0).getStress() - 20;
		int hunt = status().get(0).getHunt() + 21;
		int inde = status().get(0).getInde() + 21;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void huntMouse4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 20;
		int fill = status().get(0).getFill() - 20;
		int rel = status().get(0).getRel() - 20;
		int stress = status().get(0).getStress() - 18;
		int hunt = status().get(0).getHunt() + 20;
		int inde = status().get(0).getInde() + 20;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntBird4(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 23;
		int fill = status().get(0).getFill() - 24;
		int rel = status().get(0).getRel() - 15;
		int stress = status().get(0).getStress() - 20;
		int hunt = status().get(0).getHunt() + 23;
		int inde = status().get(0).getInde() + 23;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void huntDog4(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 26;
		int fill = status().get(0).getFill() - 28;
		int rel = status().get(0).getRel() - 20;
		int stress = status().get(0).getStress() - 25;
		int hunt = status().get(0).getHunt() + 30;
		int inde = status().get(0).getInde() + 30;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	// chapter 5

	public void eatChicker5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 20;
		int fill = status().get(0).getFill() + 20;
		int rel = status().get(0).getRel() + 15;
		int stress = status().get(0).getStress() - 20;
		int hunt = status().get(0).getHunt() + 5;
		int inde = status().get(0).getInde() + 15;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void eatChur5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 12;
		int fill = status().get(0).getFill() - 12;
		int rel = status().get(0).getRel() + 24;
		int stress = status().get(0).getStress() - 36;
		int hunt = status().get(0).getHunt() - 12;
		int inde = status().get(0).getInde() - 8;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void eatFeed5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 24;
		int fill = status().get(0).getFill() + 24;
		int rel = status().get(0).getRel() + 24;
		int stress = status().get(0).getStress() - 12;
		int hunt = status().get(0).getHunt() - 10;
		int inde = status().get(0).getInde() - 10;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void eatSalmon5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 30;
		int fill = status().get(0).getFill() + 30;
		int rel = status().get(0).getRel() + 24;
		int stress = status().get(0).getStress() - 30;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde() - 14;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void eatCatnip5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 20;
		int fill = status().get(0).getFill() - 20;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 32;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playFish5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 20;
		int fill = status().get(0).getFill() - 30;
		int rel = status().get(0).getRel() + 20;
		int stress = status().get(0).getStress() - 30;
		int hunt = status().get(0).getHunt() + 26;
		int inde = status().get(0).getInde() + 26;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playTower5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 20;
		int fill = status().get(0).getFill() - 24;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 16;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playBox5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 16;
		int fill = status().get(0).getFill() - 16;
		int rel = status().get(0).getRel() - 8;
		int stress = status().get(0).getStress() - 30;
		int hunt = status().get(0).getHunt() - 16;
		int inde = status().get(0).getInde() - 16;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void playBall5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 20;
		int fill = status().get(0).getFill() - 20;
		int rel = status().get(0).getRel() - 12;
		int stress = status().get(0).getStress() - 30;
		int hunt = status().get(0).getHunt() + 8;
		int inde = status().get(0).getInde() + 8;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void playTree5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 30;
		int fill = status().get(0).getFill() - 30;
		int rel = status().get(0).getRel() - 20;
		int stress = status().get(0).getStress() - 35;
		int hunt = status().get(0).getHunt() + 30;
		int inde = status().get(0).getInde() + 30;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void sleepBed5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 30;
		int fill = status().get(0).getFill() - 30;
		int rel = status().get(0).getRel() + 15;
		int stress = status().get(0).getStress() - 30;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void sleepOndol5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() + 30;
		int fill = status().get(0).getFill() - 30;
		int rel = status().get(0).getRel();
		int stress = status().get(0).getStress() - 30;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde();
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void Bath5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 30;
		int fill = status().get(0).getFill() - 30;
		int rel = status().get(0).getRel() - 35;
		int stress = status().get(0).getStress() + 40;
		int hunt = status().get(0).getHunt();
		int inde = status().get(0).getInde() + 35;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntBug5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 20;
		int fill = status().get(0).getFill() - 20;
		int rel = status().get(0).getRel() - 20;
		int stress = status().get(0).getStress() - 25;
		int hunt = status().get(0).getHunt() + 20;
		int inde = status().get(0).getInde() + 20;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntMouse5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 25;
		int fill = status().get(0).getFill() - 25;
		int rel = status().get(0).getRel() - 25;
		int stress = status().get(0).getStress() - 25;
		int hunt = status().get(0).getHunt() + 25;
		int inde = status().get(0).getInde() + 25;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntBird5(AjiDTO dto) {
		int row = 0;
		status();

		int hp = status().get(0).getHp() - 30;
		int fill = status().get(0).getFill() - 30;
		int rel = status().get(0).getRel() - 20;
		int stress = status().get(0).getStress() - 30;
		int hunt = status().get(0).getHunt() + 30;
		int inde = status().get(0).getInde() + 30;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);
	}

	public void huntDog5(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 35;
		int fill = status().get(0).getFill() - 35;
		int rel = status().get(0).getRel() - 25;
		int stress = status().get(0).getStress() - 35;
		int hunt = status().get(0).getHunt() + 35;
		int inde = status().get(0).getInde() + 35;

		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

	public void huntCat5(AjiDTO dto) {
		int row = 0;
		status();
		int hp = status().get(0).getHp() - 50;
		int fill = status().get(0).getFill() - 50;
		int rel = status().get(0).getRel() - 50;
		int stress = status().get(0).getStress() - 55;
		int hunt = status().get(0).getHunt() + 50;
		int inde = status().get(0).getInde() + 50;
		if (stress <= 0) {
			stress = 0;
		}
		getCon();
		psmtUpdate(dto, hp, fill, rel, stress, hunt, inde);

	}

}
