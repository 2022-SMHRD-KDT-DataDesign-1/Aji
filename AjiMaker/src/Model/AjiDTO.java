package Model;

public class AjiDTO {
	
	// 유저의 정보
	private String ID;
	private String PW;
	
	// 아지의 스택
	private int hp; 	// 체력
	private int fill; 	// 포만감
	private int rel; 	// 친밀도
	private int stress; // 스트레스
	private int hunt; 	// 사냥실력
	private int inde; 	// 독립심
	
	// 유저의 정보를 받는 생성자
	public AjiDTO(String iD, String pW) {
		
		this.ID = iD;
		this.PW = pW;
		
	}
	
	//Main - Controller - DAO 전송 위한 생성자
	public AjiDTO() {
		
	}

	
	// 아지의 스택을 받는 생성자
	public AjiDTO(int hp, int fill, int rel, int stress, int hunt, int inde) {
		
		this.hp = hp;
		this.fill = fill;
		this.rel = rel;
		this.stress = stress;
		this.hunt = hunt;
		this.inde = inde;
		
	}

	

	// 유저AND아지의 스택 getter//setter
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getFill() {
		return fill;
	}

	public void setFill(int fill) {
		this.fill = fill;
	}

	public int getRel() {
		return rel;
	}

	public void setRel(int rel) {
		this.rel = rel;
	}

	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}

	public int getHunt() {
		return hunt;
	}

	public void setHunt(int hunt) {
		this.hunt = hunt;
	}

	public int getInde() {
		return inde;
	}

	public void setInde(int inde) {
		this.inde = inde;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

}
