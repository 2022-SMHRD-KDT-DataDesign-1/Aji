package Controller;

import java.util.ArrayList;

import Model.AjiDAO;
import Model.AjiDTO;

public class Controller {
	AjiDAO dao = new AjiDAO();

	// 특정 유저의 아지 정보를 불러옴
	public void status(AjiDTO dto) {

		dao.status(dto);
		ArrayList<AjiDTO> list = dao.status(dto); // list 받아옴

		for (int i = 0; i < list.size(); i++) {
			System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ");
			System.out.print("│체력 " + list.get(i).getHp() + "\t\t\t│");
			System.out.print("포만감 " + list.get(i).getFill() + "\t\t\t│");
			System.out.println("친밀도 " + list.get(i).getRel() + "\t│");
			System.out.print("│스트레스 " + list.get(i).getStress() + "\t\t│");
			System.out.print("사냥실력 " + list.get(i).getHunt() + "\t\t\t│");
			System.out.println("독립심 " + list.get(i).getInde() + "\t│");
			System.out.println(" ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ");
		}
	}

	// 아지 상태에 따른 엔딩 정보
	public void ending(AjiDTO dto) {
		dao.status(dto);
		ArrayList<AjiDTO> list = dao.status(dto);
		String statusNames[] = new String[6];
		statusNames[0] = "체력";
		statusNames[1] = "포만감";
		statusNames[2] = "친밀도";
		statusNames[3] = "스트레스";
		statusNames[4] = "사냥실력";
		statusNames[5] = "독립심";

		int status[] = new int[6];
		status[0] = list.get(0).getHp();
		status[1] = list.get(0).getFill();
		status[2] = list.get(0).getRel();
		status[3] = list.get(0).getStress();
		status[4] = list.get(0).getHunt();
		status[5] = list.get(0).getInde();
		int max = status[0];
		String name = null;
		for (int i = 0; i < status.length; i++) {
			if (max < status[i]) {
				max = status[i];
				name = statusNames[i];
			}

		}

		if (name.equals("독립심")) {
			
		} else if (name.equals("체력")) {
			sleep();
			System.out.println("☆ 아지 세계 최장수 고양이(100세) 로 기네스북에 등극 ");
			sleep();
			System.out.println("- 전설에 따르면 아지라는 고양이는 거북이보다 더 오래살았다고 한다...");
		} else if (name.equals("포만감")) {
			sleep();
			System.out.println("너무 많이 먹어버린 아지는 뚱냥이가 되어버렸다");
		} else if (name.equals("친밀도")) {
			sleep();
			System.out.println("집사와 너무 친해진 아지는 개냥이가 되어버렸다 ");
		} else if (name.equals("스트레스")) {
			sleep();
			System.out.println("스트레스를 심하게 받아서 견딜 수 없는 아지는 결국가출해버리고 말았다\r\n" + " 나는 ㅇrㅈl 를 찾을 수 없었ㄷr...");
		} else if (name.equals("사냥실력")) {
			sleep();
			System.out.println("사냥실력을 잘 갈고닦은 아지는 ' 라이언 킹 ' 이 되었다");
		}

	}

	// 아지 상태에 따른 현재 기분
	public void feeling(AjiDTO dto) {
		dao.status(dto);
		ArrayList<AjiDTO> list = dao.status(dto);
		String statusNames[] = new String[6];
		statusNames[0] = "체력";
		statusNames[1] = "포만감";
		statusNames[2] = "친밀도";
		statusNames[3] = "스트레스";
		statusNames[4] = "사냥실력";
		statusNames[5] = "독립심";

		int status[] = new int[6];
		status[0] = list.get(0).getHp();
		status[1] = list.get(0).getFill();
		status[2] = list.get(0).getRel();
		status[3] = list.get(0).getStress();
		status[4] = list.get(0).getHunt();
		status[5] = list.get(0).getInde();
		int low = status[0];
		String name = null;
		for (int i = 0; i < status.length; i++) {
			if (low > status[i]) {
				low = status[i];
				name = statusNames[i];
			}

		}

		if (name.equals("독립심")) {
			System.out.println("기분 : 집사가 좋아");
		} else if (name.equals("체력")) {
			System.out.println("기분 : 힘이 없음");
		} else if (name.equals("포만감")) {
			System.out.println("기분 : 배고픔");
		} else if (name.equals("친밀도")) {
			System.out.println("기분 : 혼자 놀고 싶음");
		} else if (name.equals("스트레스")) {
			System.out.println("기분 : 행복함");
		} else if (name.equals("사냥실력")) {
			System.out.println("기분 : 즐거움");
		}

	}
	
	
	public void feeling45(AjiDTO dto) {
		dao.status(dto);
		ArrayList<AjiDTO> list = dao.status(dto);
		String statusNames[] = new String[6];
		statusNames[0] = "체력";
		statusNames[1] = "포만감";
		statusNames[2] = "친밀도";
		statusNames[3] = "스트레스";
		statusNames[4] = "사냥실력";
		statusNames[5] = "독립심";

		int status[] = new int[6];
		status[0] = list.get(0).getHp();
		status[1] = list.get(0).getFill();
		status[2] = list.get(0).getRel();
		status[3] = list.get(0).getStress();
		status[4] = list.get(0).getHunt();
		status[5] = list.get(0).getInde();
		int max = status[0];
		String name = null;
		for (int i = 0; i < status.length; i++) {
			if (max > status[i]) {
				max = status[i];
				name = statusNames[i];
			}

		}

		if (name.equals("독립심")) {
			System.out.println("기분 : 떠나고 싶다");
		} else if (name.equals("체력")) {
			System.out.println("기분 : 튼튼함");
		} else if (name.equals("포만감")) {
			System.out.println("기분 : 배부름");
		} else if (name.equals("친밀도")) {
			System.out.println("기분 : 집사가 좋아");
		} else if (name.equals("스트레스")) {
			System.out.println("기분 : 열받음");
		} else if (name.equals("사냥실력")) {
			System.out.println("기분 : 으스대고 싶음");
		}

	}

	// 회원가입
	public void ajiJoin(AjiDTO dto) {

		int row = dao.ajiJoin(dto);

		if (row > 0) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}

	}

	// 로그인
	public boolean ajiLogin(AjiDTO dto) {

		boolean res = dao.ajiLogin(dto); // res ---> boolean

		return res;

	}

	// chapter 1
	public void eatMilk1(AjiDTO dto) {
		dao.eatMilk1(dto);
	}

	public void eatBabysoup1(AjiDTO dto) {
		dao.eatBabysoup1(dto);
	}

	public void playRobot1(AjiDTO dto) {
		dao.playRobot1(dto);
	}

	public void playBell1(AjiDTO dto) {
		dao.playBell1(dto);
	}

	public void playDoll1(AjiDTO dto) {
		dao.playDoll1(dto);
	}

	public void sleep1(AjiDTO dto) {
		dao.sleep1(dto);
	}

	// chapter 2
	public void eatChur2(AjiDTO dto) {
		dao.eatChur2(dto);
	}

	public void eatFeed2(AjiDTO dto) {
		dao.eatFeed2(dto);
	}

	public void eatCan2(AjiDTO dto) {
		dao.eatCan2(dto);
	}

	public void playFish2(AjiDTO dto) {
		dao.playFish2(dto);
	}

	public void playTower2(AjiDTO dto) {
		dao.playTower2(dto);
	}

	public void playBox2(AjiDTO dto) {
		dao.playBox2(dto);
	}

	public void sleepBed2(AjiDTO dto) {
		dao.sleepBed2(dto);
	}

	public void sleepOndol2(AjiDTO dto) {
		dao.sleepOndol2(dto);
	}

	public void bath2(AjiDTO dto) {
		dao.bath2(dto);
	}

	public void huntBug2(AjiDTO dto) {
		dao.huntBug2(dto);
	}

	public void huntBF2(AjiDTO dto) {
		dao.huntBF2(dto);
	}

	// chapter 3
	public void eatChicken3(AjiDTO dto) {
		dao.eatChicken3(dto);
	}

	public void eatChur3(AjiDTO dto) {
		dao.eatChur3(dto);
	}

	public void eatFeed3(AjiDTO dto) {
		dao.eatFeed3(dto);
	}

	public void eatCatnip3(AjiDTO dto) {
		dao.eatCatnip3(dto);
	}

	public void playFish3(AjiDTO dto) {
		dao.playFish3(dto);
	}

	public void playTower3(AjiDTO dto) {
		dao.playTower3(dto);
	}

	public void playBox3(AjiDTO dto) {
		dao.playBox3(dto);
	}

	public void playScratchr3(AjiDTO dto) {
		dao.playScratchr3(dto);
	}

	public void sleepBed3(AjiDTO dto) {
		dao.sleepBed3(dto);
	}

	public void sleepOndol3(AjiDTO dto) {
		dao.sleepOndol3(dto);
	}

	public void Bath3(AjiDTO dto) {
		dao.Bath3(dto);
	}

	public void huntBug3(AjiDTO dto) {
		dao.huntBug3(dto);
	}

	public void huntBF3(AjiDTO dto) {
		dao.huntBF3(dto);
	}

	public void huntMouse3(AjiDTO dto) {
		dao.huntMouse3(dto);
	}

	public void huntBird3(AjiDTO dto) {
		dao.huntBird3(dto);
	}

	// chapter 4
	public void eatChicken4(AjiDTO dto) {
		dao.eatChicken4(dto);
	}

	public void eatChur4(AjiDTO dto) {
		dao.eatChur4(dto);
	}

	public void eatFeed4(AjiDTO dto) {
		dao.eatFeed4(dto);
	}

	public void eatSalmon4(AjiDTO dto) {
		dao.eatSalmon4(dto);
	}

	public void eatCatnip4(AjiDTO dto) {
		dao.eatCatnip4(dto);
	}

	public void playFish4(AjiDTO dto) {
		dao.playFish4(dto);
	}

	public void playTower4(AjiDTO dto) {
		dao.playTower4(dto);
	}

	public void playBox4(AjiDTO dto) {
		dao.playBox4(dto);
	}

	public void playBall4(AjiDTO dto) {
		dao.playBall4(dto);
	}

	public void playTree4(AjiDTO dto) {
		dao.playTree4(dto);
	}

	public void sleepBed4(AjiDTO dto) {
		dao.sleepBed4(dto);
	}

	public void sleepOndol4(AjiDTO dto) {
		dao.sleepOndol4(dto);
	}

	public void Bath4(AjiDTO dto) {
		dao.Bath4(dto);
	}

	public void huntBug4(AjiDTO dto) {
		dao.huntBug4(dto);
	}

	public void huntBF4(AjiDTO dto) {
		dao.huntBF4(dto);
	}

	public void huntMouse4(AjiDTO dto) {
		dao.huntMouse4(dto);
	}

	public void huntBird4(AjiDTO dto) {
		dao.huntBird4(dto);
	}

	public void huntDog4(AjiDTO dto) {
		dao.huntDog4(dto);
	}

	// chapter 5
	public void eatChicker5(AjiDTO dto) {
		dao.eatChicker5(dto);
	}

	public void eatChur5(AjiDTO dto) {
		dao.eatChur5(dto);
	}

	public void eatFeed5(AjiDTO dto) {
		dao.eatFeed5(dto);
	}

	public void eatSalmon5(AjiDTO dto) {
		dao.eatSalmon5(dto);
	}

	public void eatCatnip5(AjiDTO dto) {
		dao.eatCatnip5(dto);
	}

	public void playFish5(AjiDTO dto) {
		dao.playFish5(dto);
	}

	public void playTower5(AjiDTO dto) {
		dao.playTower5(dto);
	}

	public void playBox5(AjiDTO dto) {
		dao.playBox5(dto);
	}

	public void playBall5(AjiDTO dto) {
		dao.playBall5(dto);
	}

	public void playTree5(AjiDTO dto) {
		dao.playTree5(dto);
	}

	public void sleepBed5(AjiDTO dto) {
		dao.sleepBed5(dto);
	}

	public void sleepOndol5(AjiDTO dto) {
		dao.sleepOndol5(dto);
	}

	public void Bath5(AjiDTO dto) {
		dao.Bath5(dto);
	}

	public void huntBug5(AjiDTO dto) {
		dao.huntBug5(dto);
	}

	public void huntMouse5(AjiDTO dto) {
		dao.huntMouse5(dto);
	}

	public void huntBird5(AjiDTO dto) {
		dao.huntBird5(dto);
	}

	public void huntDog5(AjiDTO dto) {
		dao.huntDog5(dto);
	}

	public void huntCat5(AjiDTO dto) {
		dao.huntCat5(dto);
	}

	public void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
