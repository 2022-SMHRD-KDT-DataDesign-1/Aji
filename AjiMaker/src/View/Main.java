package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Model.AjiDTO;
import Music.music;

public class Main {

	public static void main(String[] args) {

		// 입력도구

		Scanner sc = new Scanner(System.in);
		Controller ct = new Controller();
		AjiDTO dto = new AjiDTO();
		music ms = new music();
		
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
		while (true) {
			
			System.out.print("1. 회원가입 2. 로그인 >> ");
			select = sc.nextInt();
			ms.play1();
			
			if (select == 1) {
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				dto = new AjiDTO(id, pw);

				ct.ajiJoin(dto);

			} else if (select == 2) {
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				dto = new AjiDTO(id, pw);

				if(ct.ajiLogin(dto) == true) {
					break;
				} else {
					System.out.println("로그인 실패!");
					System.out.println("아이디와 비밀번호를 확인해주세요");
				}
				}
				
		}

		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━아지의 상태━━━━━━━━━━━━━━━━━━━━━━━━━");
		ct.status(dto);

		// 출력문 1초 딜레이 메서드 메인 하단에 메서드 있음 확인 요망
		sleep(1);
	
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━챕터" +chapter+"━━━━━━━━━━━━━━━━━━━━━━━━━━━");

		while (true) {

			// 사용자가 선택한 값 5번이 되면 챕터 종료

			// 챕터 1
			if (chapter == 1) {
				System.out.println("\r아지와 할 일을 선택하세요 ");
				System.out.print("1. 밥먹기 2. 놀기 3. 재우기 >> ");
				select = sc.nextInt();
				ms.play2();

				// 밥먹기 선택
				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.print("1. 일반우유 2. 영양만점 짱짱 이유식 >> ");
					meal = sc.nextInt();
					
					cnt++;
					if (meal == 1) {
						ct.eatMilk1(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 2개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 2) {
						ct.eatBabysoup1(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 2개월");
						ct.feeling(dto);
						ct.status(dto);
					}
				}
				// 놀기 선택

				else if (select == 2) {
					System.out.println("[놀기]");
					System.out.print("1. 자동장난감 2. 방울 3. 인형 >> ");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {
						ct.playRobot1(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 2개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 2) {
						ct.playBell1(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 2개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 3) {
						ct.playDoll1(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 2개월");
						ct.feeling(dto);
						ct.status(dto);
					}
					// 재우기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					cnt++;
					ct.sleep1(dto);
					ms.catSleep();
					sleep(1);
					ms.stop();
					//아지 그림
					System.out.println("이름 : 아지");
					System.out.println("나이 : 2개월");
					ct.feeling(dto);
					ct.status(dto);

				}

				// 5번 선택 실행횟수 카운트 넘으면 챕터 +1
				// 다음 챕터 출력
				// 실행횟수 초기화
				if (cnt >= 5) {
					++chapter;
					System.out.println("\r━━━━━━━━━━━━━━━━━━━━━━━━━━━챕터" +chapter+"━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					cnt = 0;

				}
			}

			// 챕터 2
			if (chapter == 2) {
				System.out.println("\r아지와 할 일을 선택하세요 ");
				System.out.print("1. 밥먹기 2. 놀기 3. 재우기 4. 목욕하기 5. 사냥하기 >> ");
				select = sc.nextInt();
				ms.play3();

				// 밥먹기 선택

				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.print("1. 츄르 2. 키즈 사료 3. 캔 사료 >> ");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {
						ct.eatChur2(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 2) {
						ct.eatFeed2(dto);
						ms.feedEat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 3) {
						ct.eatCan2(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 놀기 선택

				} else if (select == 2) {
					System.out.println("[놀기]");
					System.out.print("1. 낚싯대 2. 2단 캣타워 3. 택배 박스 >> ");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {
						ct.playFish2(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 2) {
						ct.playTower2(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 3) {
						ct.playBox2(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 재우기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					System.out.print("1. 고양이 침대 2. 온돌 바닥 >> ");
					sleep = sc.nextInt();
					cnt++;
					if (sleep == 1) {
						ct.sleepBed2(dto);
						ms.catSleep();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (sleep == 2) {
						ct.sleepOndol2(dto);
						ms.catSleep();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 목욕하기 선택

				} else if (select == 4) {
					System.out.println("[목욕하기]");
					cnt++;
					ct.bath2(dto);
					//아지 그림
					System.out.println("이름 : 아지");
					System.out.println("나이 : 4개월");
					ct.feeling(dto);
					ct.status(dto);
					// 사냥하기 선택

				} else if (select == 5) {
					System.out.println("[사냥하기]");
					System.out.print("1. 파리 2. 나방 >> ");
					hunt = sc.nextInt();
					cnt++;
					if (hunt == 1) {
						ct.huntBug2(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 2) {
						ct.huntBF2(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 4개월");
						ct.feeling(dto);
						ct.status(dto);
					}
				}

				// 챕터 2 끝

				if (cnt >= 5) {
					++chapter;
					System.out.println("\r━━━━━━━━━━━━━━━━━━━━━━━━━━━챕터" +chapter+"━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					cnt = 0;
				}
			}

			// 챕터 3

			// 메뉴 선택

			if (chapter == 3) {
				System.out.println("\r아지와 할 일을 선택하세요 ");
				System.out.print("1. 밥먹기 2. 놀기 3. 재우기 4. 목욕하기 5. 사냥하기 >> ");
				select = sc.nextInt();
				ms.play2();

				// 밥먹기 선택

				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.print("1. 몸에 좋은 닭가슴살 2. 날 꼬시는 츄르 3. 키즈 사료 4. 캣잎 >> ");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {
						ct.eatChicken3(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 2) {
						ct.eatChicken3(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 3) {
						ct.eatFeed3(dto);
						ms.feedEat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 4) {
						ct.eatCatnip3(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 놀기 선택

				} else if (select == 2) {
					System.out.println("[놀기]");
					System.out.print("1. 고급 낚싯대 2. 3단 캣타워 3. 숨숨 집 4. 스크래처 >> ");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {
						ct.playFish3(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 2) {
						ct.playTower3(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 3) {
						ct.playBox3(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 4) {
						ct.playScratchr3(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 놀기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					System.out.print("1. 부드러운 고양이 침대 2. 따뜻한 온돌바닥 >> ");
					sleep = sc.nextInt();
					cnt++;
					if (sleep == 1) {
						ct.sleepBed3(dto);
						ms.catSleep();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (sleep == 2) {
						ct.sleepOndol3(dto);
						ms.catSleep();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 목욕하기 선택

				} else if (select == 4) {
					System.out.println("[목욕하기]");
					cnt++;
					ct.Bath3(dto);
					//아지 그림
					System.out.println("이름 : 아지");
					System.out.println("나이 : 6개월");
					ct.feeling(dto);
					ct.status(dto);

					// 사냥하기 선택

				} else if (select == 5) {
					System.out.println("[사냥하기]");
					System.out.print("1. 잠자리 2. 노랑나비 3. 아기 쥐 4. 참새 >> ");
					hunt = sc.nextInt();
					cnt++;
					if (hunt == 1) {
						ct.huntBug3(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 2) {
						ct.huntBF3(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 3) {
						ct.huntMouse3(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 4) {
						ct.huntBird3(dto);
						ms.chapbird();
						sleep(2);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 6개월");
						ct.feeling(dto);
						ct.status(dto);
					}

				}
				if (cnt >= 5) {
					++chapter;
					System.out.println("\r━━━━━━━━━━━━━━━━━━━━━━━━━━━챕터" +chapter+"━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					cnt = 0;

				}
			}

			// 챕터 4

			// 메뉴 선택

			if (chapter == 4) {
				System.out.println("\r아지와 할 일을 선택하세요 ");
				System.out.print("1. 밥먹기 2. 놀기 3. 재우기 4. 목욕하기 5. 사냥하기 >> ");
				select = sc.nextInt();
				ms.play1();

				// 밥먹기 선택

				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.print("1. 수비드 닭가슴살 2. 수제 츄르 3. 보통 사료 4. 노르웨이 연어 5. 마따따비 캣잎 >> ");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {
						ct.eatChicken4(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 2) {
						ct.eatChur4(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 3) {
						ct.eatFeed4(dto);
						ms.feedEat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 4) {
						ct.eatSalmon4(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 5) {
						ct.eatCatnip4(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 놀기 선택

				} else if (select == 2) {
					System.out.println("[놀기]");
					System.out.print("1. 골드 낚싯대 2. 4단 캣타워 3. 우체국 박스 4. 실타래 5. 나무타기 >> ");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {
						ct.playFish4(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 2) {
						ct.playTower4(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 3) {
						ct.playBox4(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 4) {
						ct.playBall4(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 5) {
						ct.playTree4(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 재우기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					System.out.print("1. 폭신폭신 고양이 침대 2. 대리석 온돌 바닥 >> ");
					sleep = sc.nextInt();
					cnt++;
					if (sleep == 1) {
						ct.sleepBed4(dto);
						ms.catSleep();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (sleep == 2) {
						ct.sleepOndol4(dto);
						ms.catSleep();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 목욕하기 선택

				} else if (select == 4) {
					System.out.println("[목욕하기]");
					cnt++;
					ct.Bath4(dto);
					//아지 그림
					System.out.println("이름 : 아지");
					System.out.println("나이 : 10개월");
					ct.feeling(dto);
					ct.status(dto);
					// 사냥하기 선택

				} else if (select == 5) {
					System.out.println("[사냥하기]");
					System.out.print("1. 메뚜기 2. 호랑나비 3. 어른 쥐 4. 비둘기 5. 옆집 강아지 >> ");
					hunt = sc.nextInt();
					cnt++;
					if (hunt == 1) {
						ct.huntBug4(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 2) {
						ct.huntBF4(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 3) {
						ct.huntMouse4(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 4) {
						ct.huntBird4(dto);
						ms.gugugu();
						sleep(3);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 5) {
						ct.huntDog4(dto);
						ms.dog();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 10개월");
						ct.feeling(dto);
						ct.status(dto);
					}

				}
			}
			if (cnt >= 5) {
				++chapter;
				System.out.println("\r━━━━━━━━━━━━━━━━━━━━━━━━━━━챕터" +chapter+"━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				cnt = 0;
			}

			// 챕터 5

			// 메뉴 선택

			if (chapter == 5) {
				System.out.println("\r아지와 할 일을 선택하세요 ");
				System.out.print("1. 밥먹기 2. 놀기 3. 재우기 4. 목욕하기 5. 사냥하기 >> ");
				select = sc.nextInt();
				ms.play3();

				// 밥먹기 선택

				if (select == 1) {
					System.out.println("[밥먹기]");
					System.out.println("1. 자연에서 키운 무항생제 닭가슴살 2. 일본 장인이 만든 츄르");
					System.out.print("3. 고급 사료  4. 알래스카 연어 5. 캣글라스 캣잎  >>");
					meal = sc.nextInt();
					cnt++;
					if (meal == 1) {
						ct.eatChicker5(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 2) {
						ct.eatChur5(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 3) {
						ct.eatFeed5(dto);
						ms.feedEat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 4) {
						ct.eatSalmon5(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (meal == 5) {
						ct.eatCatnip5(dto);
						ms.eat();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 놀기 선택

				} else if (select == 2) {
					System.out.println("[놀기]");
					System.out.print("1. 다이아몬드 낚싯대 2. 10단 캣타워 3. 이사 박스(특대) 4. 양모볼 5. 나무타기 >> ");
					play = sc.nextInt();
					cnt++;
					if (play == 1) {
						ct.playFish5(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 2) {
						ct.playTower5(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 3) {
						ct.playBox5(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 4) {
						ct.playBall5(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (play == 5) {
						ct.playTree5(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 재우기 선택

				} else if (select == 3) {
					System.out.println("[재우기]");
					System.out.print("1. 집사 침대 뺏기 2. 온돌바닥 아랫목 >> ");
					sleep = sc.nextInt();
					cnt++;
					if (sleep == 1) {
						ct.sleepBed5(dto);
						ms.catSleep();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (sleep == 2) {
						ct.sleepOndol5(dto);
						ms.catSleep();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					}

					// 목욕하기 선택

				} else if (select == 4) {
					System.out.println("[목욕하기]");
					cnt++;
					ct.Bath5(dto);
					//아지 그림
					System.out.println("이름 : 아지");
					System.out.println("나이 : 1살");
					ct.feeling(dto);
					ct.status(dto);
					// 사냥하기 선택

				} else if (select == 5) {
					System.out.println("[사냥하기]");
					System.out.print("1.사마귀 2. 대왕 쥐 3. 까치 4. 옆집 강아지 형 5. 이구역 대장 고양이 >> ");
					hunt = sc.nextInt();
					cnt++;
					if (hunt == 1) {
						ct.huntBug5(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 2) {
						ct.huntMouse5(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 3) {
						ct.huntBird5(dto);
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 4) {
						ct.huntDog5(dto);
						ms.dog();
						sleep(1);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					} else if (hunt == 5) {
						ct.huntCat5(dto);
						ms.boss();
						sleep(3);
						ms.stop();
						//아지 그림
						System.out.println("이름 : 아지");
						System.out.println("나이 : 1살");
						ct.feeling(dto);
						ct.status(dto);
					}

				}
				if (cnt >= 5) {
					++chapter;
					cnt = 0;
					ms.endingSong();
					ct.ending(dto);
					ms.stop();
					break;
				}
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
