package View;

import java.util.Scanner;

import Controller.Controller;
import Model.AjiDTO;

public class Main {

	public static void main(String[] args) {

		// 입력도구
		Scanner sc = new Scanner(System.in);
		Controller ct = new Controller();
		
		// 챕터 카운트
		int chapter = 1;

		// 실행횟수 카운트
		int cnt = 0;

		// 선택 카운트
		int select = 0;

		// 활동 변수 초기화
		int meal = 0;
		int play = 0;
		int sleep = 0;
		int bath = 0;
		int hunt = 0;

		// 회원가입, 로그인 진행 후 게임 진행
		while(true) {
			
			System.out.print("1. 회원가입 2. 로그인 >> ");
			select = sc.nextInt();
			
			
			if(select == 1) {
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				
				AjiDTO dto = new AjiDTO(id, pw);
				
				ct.ajiJoin(dto);
				
			}else if(select == 2) {
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				
				AjiDTO dto = new AjiDTO(id, pw);
				
				ct.ajiLogin(dto);
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
			
		}
		// 출력문 1초 딜레이 메서드 메인 하단에 메서드 있음 확인 요망
		sleep(1);
		
		System.out.println("----------- " + "챕터 " + chapter + " -----------");

		while (true) {

			// 메뉴 선택 입력한 값 받기

			// 사용자가 선택한 값 5번이 되면 챕터 종료

			// 챕터 1
			if (chapter == 1) {
				System.out.print("메뉴를 입력하세요 >> ");
				select = sc.nextInt();

				// 밥먹기 선택
				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.println("1. 일반우유 2. 영양만점 짱짱 이유식");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {

					} else if (meal == 2) {

					}
				}
				// 놀기 선택

				else if (select == 2) {
					System.out.println("[놀기]");
					System.out.println("1. 자동장난감 2. 방울 3. 인형");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {

					} else if (play == 2) {

					} else if (play == 3) {

					}
					// 재우기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					cnt++;
				}

				// 5번 선택 실행횟수 카운트 넘으면 챕터 +1
				// 다음 챕터 출력
				// 실행횟수 초기화
				if (cnt >= 5) {
					++chapter;
					System.out.println("----------- " + "챕터 " + chapter + " -----------");
					cnt = 0;

				}
			}

			// 챕터 2
			if (chapter == 2) {
				System.out.print("메뉴를 입력하세요 >> ");
				select = sc.nextInt();

				// 밥먹기 선택

				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.println("1. 츄르 2. 키즈 사료 3. 캔 사료");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {

					} else if (meal == 2) {

					} else if (meal == 3) {

					}

					// 놀기 선택

				} else if (select == 2) {
					System.out.println("[놀기]");
					System.out.println("1. 낚싯대 2. 2단 캣타워 3. 택배 박스");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {

					} else if (play == 2) {

					} else if (play == 3) {

					}

					// 재우기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					System.out.println("1. 고양이 침대 2. 온돌 바닥");
					sleep = sc.nextInt();
					cnt++;
					if (sleep == 1) {

					} else if (sleep == 2) {

					}

					// 목욕하기 선택

				} else if (select == 4) {
					System.out.println("[목욕하기]");
					cnt++;

					// 사냥하기 선택

				} else if (select == 5) {
					System.out.println("[사냥하기]");
					System.out.println("1. 파리 2. 나방");
					hunt = sc.nextInt();
					cnt++;
					if (hunt == 1) {

					} else if (hunt == 2) {

					}
				}

				// 챕터 2 끝

				if (cnt >= 5) {
					++chapter;
					System.out.println("----------- " + "챕터 " + chapter + " -----------");
					cnt = 0;
				}
			}

			// 챕터 3

			// 메뉴 선택

			if (chapter == 3) {
				System.out.print("메뉴를 입력하세요 >> ");
				select = sc.nextInt();

				// 밥먹기 선택

				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.println("1. 몸에 좋은 닭가슴살 2. 날 꼬시는 츄르 3. 키즈 사료 4. 캣잎 ");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {

					} else if (meal == 2) {

					} else if (meal == 3) {

					} else if (meal == 4) {

					}

					// 놀기 선택

				} else if (select == 2) {
					System.out.println("[놀기]");
					System.out.println("1. 고급 낚싯대 2. 3단 캣타워 3. 숨숨 집 4. 스크래처 ");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {

					} else if (play == 2) {

					} else if (play == 3) {

					} else if (play == 4) {

					}

					// 놀기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					System.out.println("1. 부드러운 고양이 침대 2. 따뜻한 온돌바닥 ");
					sleep = sc.nextInt();
					cnt++;
					if (sleep == 1) {

					} else if (sleep == 2) {

					}

					// 목욕하기 선택

				} else if (select == 4) {
					System.out.println("[목욕하기]");

					cnt++;

					// 사냥하기 선택

				} else if (select == 5) {
					System.out.println("[사냥하기]");
					System.out.println("1. 잠자리 2. 노랑나비 3. 아기 쥐 4. 참새 ");
					hunt = sc.nextInt();
					cnt++;
					if (hunt == 1) {

					} else if (hunt == 2) {

					} else if (hunt == 3) {

					} else if (hunt == 4) {

					}

				}
				if (cnt >= 5) {
					++chapter;
					System.out.println("----------- " + "챕터 " + chapter + " -----------");
					cnt = 0;

				}
			}

			// 챕터 4

			// 메뉴 선택

			if (chapter == 4) {
				System.out.print("메뉴를 입력하세요 >> ");
				select = sc.nextInt();

				// 밥먹기 선택

				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.println("1. 수비드 닭가슴살 2. 수제 츄르 3. 보통 사료 4. 노르웨이 연어 5. 마따따비 캣잎 ");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {

					} else if (meal == 2) {

					} else if (meal == 3) {

					} else if (meal == 4) {

					} else if (meal == 5) {

					}

					// 놀기 선택

				} else if (select == 2) {
					System.out.println("[놀기]");
					System.out.println("1. 골드 낚싯대 2. 4단 캣타워 3. 우체국 박스 4. 실타래 5. 나무타기 ");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {

					} else if (play == 2) {

					} else if (play == 3) {

					} else if (play == 4) {

					} else if (play == 5) {

					}

					// 재우기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					System.out.println("1. 폭신폭신 고양이 침대 2. 대리석 온돌 바닥");
					sleep = sc.nextInt();
					cnt++;
					if (sleep == 1) {

					} else if (sleep == 2) {

					}

					// 목욕하기 선택

				} else if (select == 4) {
					System.out.println("[목욕하기]");
					cnt++;

					// 사냥하기 선택

				} else if (select == 5) {
					System.out.println("[사냥하기]");
					System.out.println("1. 메뚜기 2. 호랑나비 3. 어른 쥐 4. 비둘기 5. 옆집 강아지");
					hunt = sc.nextInt();
					cnt++;
					if (hunt == 1) {

					} else if (hunt == 2) {

					} else if (hunt == 3) {

					} else if (hunt == 4) {

					} else if (hunt == 5) {

					}

				}
			}
			if (cnt >= 5) {
				++chapter;
				System.out.println("----------- " + "챕터 " + chapter + " -----------");
				cnt = 0;
			}

			// 챕터 5

			// 메뉴 선택

			if (chapter == 5) {
				System.out.print("메뉴를 입력하세요 >> ");
				select = sc.nextInt();

				// 밥먹기 선택

				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.println("1. 자연에서 키운 무항생제 닭가슴살 2. 일본 장인이 만든 츄르 3. 고급 사료" + " 4. 알래스카 연어 5. 캣글라스 캣잎  ");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {

					} else if (meal == 2) {

					} else if (meal == 3) {

					} else if (meal == 4) {

					} else if (meal == 5) {

					}

					// 놀기 선택

				} else if (select == 2) {
					System.out.println("[놀기]");
					System.out.println("1. 다이아몬드 낚싯대 2. 10단 캣타워 3. 이사 박스(특대) 4. 양모볼 5. 나무타기 ");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {

					} else if (play == 2) {

					} else if (play == 3) {

					} else if (play == 4) {

					} else if (play == 5) {

					}

					// 재우기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					System.out.println("1. 침대 뺏기 2. 온돌바닥 아랫목");
					sleep = sc.nextInt();
					cnt++;
					if (sleep == 1) {

					} else if (sleep == 2) {

					}

					// 목욕하기 선택

				} else if (select == 4) {
					System.out.println("[목욕하기]");
					cnt++;

					// 사냥하기 선택

				} else if (select == 5) {
					System.out.println("[사냥하기]");
					System.out.println("1.사마귀 2. 대왕 쥐 3. 까치 4. 옆집 강아지 형 5. 이구역 대장 고양이");
					hunt = sc.nextInt();
					cnt++;
					if (hunt == 1) {

					} else if (hunt == 2) {

					} else if (hunt == 3) {

					} else if (hunt == 4) {

					} else if (hunt == 5) {

					}

				}
				if (cnt >= 5) {
					++chapter;
					cnt = 0;
				}

			}
			if (chapter > 5) {
				System.out.println();
				System.out.println("아지 키우기 끝");
				break;
			}
		}
	}

	// 출력문 원하는 초 딜레이 메서드
	public static void sleep(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
