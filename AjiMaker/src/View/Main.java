package View;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Controller.AjiController;
import Model.AjiDTO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 챕터
		int chapter = 1;

		// 선택횟수
		int cnt = 0;
		
		AjiController ct = new AjiController();

		Scanner sc = new Scanner(System.in);

		// 인트로 출력
		//intro();
		
		System.out.println("챕터1");
		
		System.out.print("ID입력 : ");
		String id = sc.next();
		System.out.print("PW입력 : ");
		String pw = sc.next();
		AjiDTO dto = new AjiDTO(id, pw);
		
		while (true) {

			System.out.println("[1] 회원가입 [2] 로그인 [3] 조회");
			// 유저가 선택
			int select = sc.nextInt();

			if (chapter == 1) {

				if (select == 1) {
					// 회원가입
					System.out.print("ID입력 : ");
					//String id = sc.next();
					System.out.print("PW입력 : ");
					//String pw = sc.next();
					//AjiDTO dto = new AjiDTO(id, pw);
					
					ct.ajiJoin(dto);
					
					//cnt++;
				} else if (select == 2) {
					// 로그인
					
					ct.ajiLogin(dto);
					
					ct.ajiSelect(dto);
					//cnt++;
				} else if (select == 3) {
					// 검색
					System.out.print("검색하고 싶은 이름을 입력하세요 >> ");
					//String id = sc.next();
					
					//AjiDTO dto = new AjiDTO(id);
					
					ct.ajiSelect(dto);
					//cnt++;
				} else if (select == 4) {
					
					//cnt++;
				} else if (select == 5) {
					
					//cnt++;
				}

				// cnt가 중복되면 다음챕터로 넘어감.
				if (cnt == 5) {
					chapter++;
					cnt = 0;
					System.out.println("챕터2");
				}
			} else if (chapter == 2) {

				if (select == 1) {
					cnt++;
				} else if (select == 2) {
					cnt++;
				} else if (select == 3) {
					cnt++;
				} else if (select == 4) {
					cnt++;
				} else if (select == 5) {
					cnt++;
				}

				// cnt가 중복되면 다음챕터로 넘어감.
				if (cnt == 5) {
					chapter++;
					cnt = 0;
					System.out.println("챕터3");
				}

			} else if (chapter == 3) {

				if (select == 1) {
					cnt++;
				} else if (select == 2) {
					cnt++;
				} else if (select == 3) {
					cnt++;
				} else if (select == 4) {
					cnt++;
				} else if (select == 5) {
					cnt++;
				}

				// cnt가 중복되면 다음챕터로 넘어감.
				if (cnt == 5) {
					chapter++;
					cnt = 0;
					System.out.println("챕터4");
				}

			} else if (chapter == 4) {

				if (select == 1) {
					cnt++;
				} else if (select == 2) {
					cnt++;
				} else if (select == 3) {
					cnt++;
				} else if (select == 4) {
					cnt++;
				} else if (select == 5) {
					cnt++;
				}

				// cnt가 중복되면 다음챕터로 넘어감.
				if (cnt == 5) {
					chapter++;
					cnt = 0;
					System.out.println("챕터5");
				}

				// 마지막 챕터 끝나면 종료
			} else if (chapter == 5) {

				if (select == 1) {
					cnt++;
				} else if (select == 2) {
					cnt++;
				} else if (select == 3) {
					cnt++;
				} else if (select == 4) {
					cnt++;
				} else if (select == 5) {
					cnt++;
				}

				if (cnt == 5) {
					break;
				}
			}

		}

	}

	public static void intro() {

		try {

			// 비오는 브금
			System.out.println("어느 비오는날 집에 가는 길..");
			TimeUnit.SECONDS.sleep(1);

			// 고양이 냥~ 소리 브금 짧게
			System.out.println("어디선가 들려오는 고양이 소리");
			TimeUnit.SECONDS.sleep(1);

			System.out.println("시선을 돌려 밑을 보니 박스 안에서");
			System.out.println("고양이가 나를 올려다 보고 있다.");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 이 후 선택지

	}

}
