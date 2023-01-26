package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Controller.Controller;
import Model.AjiDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Controller ct = new Controller();
		AjiDTO dto = new AjiDTO();

		System.out.print("1. 밥먹기 2.목욕 >>");
		int menu = sc.nextInt();
		while (true) {
			if (menu == 1) {
				System.out.print("0. 상태보기 1. 우유 2.이유식 3.캔 4. 치킨>>");
				int meal = sc.nextInt();
				if (meal == 1) {
					ct.eatMilk1(dto);
					ct.status(dto);
				} else if (meal == 2) {
					ct.eatBabysoup1(dto);
					ct.status(dto);
				} else if (meal == 0) {
					ct.status(dto);
				} else if (meal == 3) {
					dto.setHp(+100);
					ct.eatCan2(dto);
					ct.status(dto);
				} else if (meal == 4) {
					ct.eatChicken4(dto);
					ct.status(dto);
				}
			} else if (menu == 2) {
				ct.Bath4(dto);
				ct.status(dto);
			}

		}

	}

}
