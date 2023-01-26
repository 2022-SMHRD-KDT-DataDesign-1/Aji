package Controller;

import java.util.ArrayList;

import Model.AjiDAO;
import Model.AjiDTO;

public class Controller {
	AjiDAO dao = new AjiDAO();
	
	public void status(AjiDTO dto) {

		dao.status(dto);
		ArrayList<AjiDTO> list = dao.status(dto); // list 받아옴

		for (int i = 0; i < list.size(); i++) {
			System.out.print("체력 " + list.get(i).getHp()+"\t\t\t");
			System.out.print("포만감 " + list.get(i).getFill()+"\t\t\t");
			System.out.println("친밀도 " + list.get(i).getRel());
			System.out.print("스트레스 " + list.get(i).getStress()+"\t\t");
			System.out.print("사냥실력 " + list.get(i).getHunt()+"\t\t\t");
			System.out.println("독립심 " + list.get(i).getInde());
		}
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
	public void hungBF3(AjiDTO dto) {
		dao.hungBF3(dto);
	}
	public void hungMouse3(AjiDTO dto) {
		dao.hungMouse3(dto);
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

}
