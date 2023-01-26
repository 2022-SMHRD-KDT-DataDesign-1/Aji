package Controller;

import Model.AjiDAO;
import Model.AjiDTO;

public class AjiController {

	AjiDAO dao = new AjiDAO();
	
	public void ajiJoin(AjiDTO dto) {
		
		int row = dao.ajiJoin(dto);
		
		if(row > 0) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
	}
	
	public void ajiLogin(AjiDTO dto) {
		
		boolean res = dao.ajiLogin(dto); // res ---> boolean
		
		if(res) {
			System.out.println("환영합니다.");
		}else {			
			System.out.println("로그인 실패");
		}
		
	}
	
	public void ajiSelect(AjiDTO dto) {
		
		dto = dao.selectAji(dto);
		
		if(dto.getID() == null) {
			System.out.println("검색 결과 회원이 없습니다");
		}else {			
			System.out.println(dto.getHp() + " " + dto.getFill() + " " + dto.getHunt() + " " 
						     + dto.getInde() + " " + dto.getRel() + " " + dto.getStress());
			
		}
		
	}
	
	
}
