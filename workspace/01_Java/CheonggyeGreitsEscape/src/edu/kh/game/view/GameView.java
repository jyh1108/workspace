
//	Building bb = new Building();
//	int room = 1;
//				if (room > -1)
//				System.out.printf("┃      %4s에 들어왔습니다.      ┃\n", bb.getList().get(Floor - 1).get(room - 1));

package edu.kh.game.view;

import java.util.Scanner;

import edu.kh.game.service.Service;

public class GameView {

	private Scanner sc = new Scanner(System.in);
	private Service gameService = new Service();

	public void displayMenu() {
		int input = 0;
		String straight = "┃";
//		addItem(1, "컵라면");
//		System.out.println(gameService.getItem(0)); // 컵라면
//		gameService.useItem(0);
//		System.out.println(gameService.getItem(0));// null
//		gameService.moveFloor(true);
//		System.out.println("viewFloor1 : " + viewFloor());
//		gameService.moveFloor(true);
//		System.out.println("viewFloor2 : " + viewFloor());
		while (true) {
			if (viewFloor() == 7) {
				System.out.print("\n\n\n\n\n");
				System.out.printf("가%38s\n", straight);
				System.out.printf("ss%38s\n", straight);
				System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
				System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
				System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
				System.out.println("                                     ");
				System.out.println("             옥상정원                ");
				System.out.println("                                     ");
				System.out.println("                                     ");
				System.out.printf("    0. 아래 층(%dF)                      \n", viewFloor() - 1);
				System.out.println("                                     ");
				System.out.println("    9. 아이템 사용                       ");
				System.out.println("                                     ");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

				boolean flag = true;
				while (flag) {
					flag = false;
					System.out.print("메뉴 선택 >> ");
					input = sc.nextInt();
					sc.nextLine(); // 입력 버퍼 개행문자 제거

					switch (input) {
					case 0:
						gameService.moveFloor(true);
						displayMenu();
						break;
					case 9:
//				itemUse();
						break;
					default:
						System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
						flag = true;
					}
				}
			} else if (viewFloor() == 6 || viewFloor() == 5) {
				System.out.print("\n\n\n\n\n");
				System.out.printf("가%38s\n", straight);
				System.out.printf("ss%38s\n", straight);
				System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
				System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
				System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
				System.out.println("                                     ");
				System.out.printf("         %dF에 입장했습니다.              \n", viewFloor());
				System.out.println("                                     ");
				System.out.println("     1. 회의실1                                ");
				System.out.println("     2. 회의실2                               ");
				System.out.println("     3. 강당                                ");
				System.out.println("     4. 화장실                                ");
				System.out.println("     5. 탕비실                                ");
				System.out.println("                                   ");
				System.out.printf("     0. 아래 층(%dF)                      \n", viewFloor() - 1);
				System.out.println("                                     ");
				System.out.println("     9. 아이템 사용                       ");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

				boolean flag = true;
				while (flag) {
					flag = false;

					System.out.print("메뉴 선택 >> ");

					input = sc.nextInt();
					sc.nextLine(); // 입력 버퍼 개행문자 제거

					switch (input) {
					case 0:
						gameService.moveFloor(true);
						displayMenu();
						break;
					case 1:
						meetingRoom1();
						break;
					case 2:
						meetingRoom1();
						break;
					case 3:
						meetingRoom1();
						break;
					case 4:
						meetingRoom1();
						break;
					case 5:
						teaRoom();
						break;
					case 9:
						// itemUse();
						break;
					default:
						System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
						flag = true;
					}
				}
			} else if (viewFloor() == 4) {
				System.out.print("\n\n\n\n\n");
				System.out.printf("가%38s\n", straight);
				System.out.printf("ss%38s\n", straight);
				System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
				System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
				System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
				System.out.println("                                     ");
				System.out.printf("         %dF에 입장했습니다.              \n", viewFloor());
				System.out.println("                                     ");
				System.out.println("     1. 신한라이프 회장실                                ");
				System.out.println("     2. 대회의실                               ");
				System.out.println("     3. 강당                                ");
				System.out.println("     4. 탕비실                                ");
				System.out.println("                                    ");
				System.out.printf("     0. 아래 층(%dF)                      \n", viewFloor() - 1);
				System.out.println("                                     ");
				System.out.println("     9. 아이템 사용                       ");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

				boolean flag = true;
				while (flag) {
					flag = false;

					System.out.print("메뉴 선택 >> ");
					input = sc.nextInt();
					sc.nextLine(); // 입력 버퍼 개행문자 제거

					switch (input) {
					case 0:
						gameService.moveFloor(true);
						displayMenu();
						break;
					case 1:
						meetingRoom1();
						break;
					case 2:
						meetingRoom1();
						break;
					case 3:
						meetingRoom1();
						break;
					case 4:
						teaRoom();
						break;
					case 9:
//				itemUse();
						break;
					default:
						System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
						flag = true;
					}
				}
			} else if (viewFloor() == 3 || viewFloor() == 2) {
				System.out.print("\n\n\n\n\n");
				System.out.printf("가%38s\n", straight);
				System.out.printf("ss%38s\n", straight);
				System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
				System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
				System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
				System.out.println("                                     ");
				System.out.printf("         %dF에 입장했습니다.              \n", viewFloor());
				System.out.println("                                     ");
				System.out.println("     1. 회의실                                ");
				System.out.println("     2. 강의실                               ");
				System.out.println("     3. 화장실                                ");
				System.out.println("     4. 탕비실                                ");
				System.out.println("                                    ");
				System.out.printf("     0. 아래 층(%dF)                      \n", viewFloor() - 1);
				System.out.println("                                     ");
				System.out.println("     9. 아이템 사용                       ");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

				boolean flag = true;
				while (flag) {
					flag = false;
					System.out.print("메뉴 선택 >> ");
					input = sc.nextInt();
					sc.nextLine(); // 입력 버퍼 개행문자 제거

					switch (input) {
					case 0:
						gameService.moveFloor(true);
						displayMenu();
						break;
					case 1:
						meetingRoom1();
						break;
					case 2:
						meetingRoom1();
						break;
					case 3:
						meetingRoom1();
						break;
					case 4:
						teaRoom();
						break;
					case 9:
//				itemUse();
						break;
					default:
						System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
						flag = true;
					}
				}
			} else if (viewFloor() == 1) {
				System.out.print("\n\n\n\n\n");
				System.out.printf("가%38s\n", straight);
				System.out.printf("ss%38s\n", straight);
				System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
				System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
				System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
				System.out.println("                                     ");
				System.out.printf("         %dF에 입장했습니다.              \n", viewFloor());
				System.out.println("                                     ");
				System.out.println("     1. 로비                                ");
				System.out.println("                                    ");
				System.out.println("                                    ");
				System.out.println("                                    ");
				System.out.println("                                    ");
				System.out.println("                                     ");
				System.out.println("     9. 아이템 사용                       ");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

				boolean flag = true;
				while (flag) {
					flag = false;
					System.out.print("메뉴 선택 >> ");
					input = sc.nextInt();
					sc.nextLine(); // 입력 버퍼 개행문자 제거

					switch (input) {
					case 1:
						bossRoom();
						break;
					case 9:
//				itemUse();
						break;
					default:
						System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
						flag = true;
					}
				}
			} else {
				System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거
				System.out.println();
			}
		}
	}

	public void meetingRoom1() {
		int input = 0;
		String straight = "┃";
		if ((int) (Math.random() * 100) <= 50) {
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.println("             좀비가 나타났습니다.                ");
			System.out.println("                                     ");
			System.out.println("                                     ");
			System.out.println("    1.공격하기                       ");
			System.out.println("    2.도망가기                                  ");
			System.out.println("                                     ");
			System.out.println("    9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거
				switch (input) {
				case 1:
					Attackview();
					break;
				case 2:
					awayView();
					break;
				case 9:
//		itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		} else {
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.println("            아무것도 없었다                ");
			System.out.println("                                     ");
			System.out.println("                                     ");
			System.out.println("                           ");
			System.out.println("    1.돌아가기                                  ");
			System.out.println("                                     ");
			System.out.println("    9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;

				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거
				switch (input) {
				case 1:
					displayMenu();
					break;
				case 9:
//		itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		}
	}

	public void Attackview() {
		int input = 0;
		String straight = "┃";
		if ((int) (Math.random() * 100) <= 50) {
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.println("            공격에 성공하였습니다.                ");
			System.out.println("             좀비가 쓰러집니다.                        ");
			System.out.println("                                     ");
			System.out.println("                           ");
			System.out.println("    1.돌아가기                                  ");
			System.out.println("                                     ");
			System.out.println("    9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;

				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거

				switch (input) {
				case 1:
					displayMenu();
					break;
				case 9:
//		itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		} else {
			avoid();
//			System.out.printf("가%38s\n", straight);
//			System.out.printf("ss%38s\n", straight);
//			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
//			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
//			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
//			System.out.println("                                     ");
//			System.out.println("         좀비에게 피해를 입습니다.                    ");
//			System.out.println("          좀비를 해치웠습니다.                ");
//			System.out.println("                                     ");
//			System.out.println("                           ");
//			System.out.println("    1.돌아가기                                  ");
//			System.out.println("                                     ");
//			System.out.println("    9. 아이템 사용                       ");
//			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
//			System.out.print("메뉴 선택 >> ");
//			input = sc.nextInt();
//			sc.nextLine(); // 입력 버퍼 개행문자 제거
//			System.out.println();
//
//			switch (input) {
//			case 1:
//				displayMenu();
//				break;
//			case 9:
////		itemUse();
//				break;
//			default:
//				System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
//			}
		}
	}

	public void awayView() {
		int input = 0;
		String straight = "┃";
		if (viewFloor() == 6 || viewFloor() == 5) {
			if ((int) (Math.random() * 100) <= 50) {
				System.out.print("\n\n\n\n\n");
				System.out.printf("가%38s\n", straight);
				System.out.printf("ss%38s\n", straight);
				System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
				System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
				System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
				System.out.println("                                     ");
				System.out.println("        도망에 성공하였습니다.                ");
				System.out.println("                                     ");
				System.out.println("                                     ");
				System.out.println("     1. 회의실1                                ");
				System.out.println("     2. 회의실2                               ");
				System.out.println("     3. 강당                                ");
				System.out.println("     4. 화장실                                ");
				System.out.println("     5. 탕비실                                ");
				System.out.printf("     0. 아래 층(%dF)                      \n", viewFloor() - 1);
				System.out.println("                                     ");
				System.out.println("     9. 아이템 사용                       ");
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				boolean flag = true;
				while (flag) {
					flag = false;

					System.out.print("메뉴 선택 >> ");
					input = sc.nextInt();
					sc.nextLine(); // 입력 버퍼 개행문자 제거
					switch (input) {
					case 0:
						gameService.moveFloor(true);
						displayMenu();
						break;
					case 1:
						meetingRoom1();
						break;
					case 2:
						meetingRoom1();
						break;
					case 3:
						meetingRoom1();
						break;
					case 4:
						meetingRoom1();
						break;
					case 5:
						teaRoom();
						break;
					case 9:
//		itemUse();
						break;
					default:
						System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
						flag = true;
					}
				}
			} else {
				failedAway();
			}
		} else if (viewFloor() == 4) {
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.printf("         도망에 성공하였습니다.              \n", viewFloor());
			System.out.println("                                     ");
			System.out.println("     1. 신한라이프 회장실                                ");
			System.out.println("     2. 대회의실                               ");
			System.out.println("     3. 강당                                ");
			System.out.println("     4. 탕비실                                ");
			System.out.println("                                    ");
			System.out.printf("     0. 아래 층(%dF)                      \n", viewFloor() - 1);
			System.out.println("                                     ");
			System.out.println("     9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;

				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거

				switch (input) {
				case 0:
					gameService.moveFloor(true);
					displayMenu();
					break;
				case 1:
					meetingRoom1();
					break;
				case 2:
					meetingRoom1();
					break;
				case 3:
					meetingRoom1();
					break;
				case 4:
					teaRoom();
					break;
				case 9:
//			itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		} else if (viewFloor() == 3 || viewFloor() == 2) {
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.printf("        도망에 성공하였습니다.              \n", viewFloor());
			System.out.println("                                     ");
			System.out.println("     1. 회의실                                ");
			System.out.println("     2. 강의실                               ");
			System.out.println("     3. 화장실                                ");
			System.out.println("     4. 탕비실                                ");
			System.out.println("                                    ");
			System.out.printf("     0. 아래 층(%dF)                      \n", viewFloor() - 1);
			System.out.println("                                     ");
			System.out.println("     9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;

				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거

				switch (input) {
				case 0:
					gameService.moveFloor(true);
					displayMenu();
					break;
				case 1:
					meetingRoom1();
					break;
				case 2:
					meetingRoom1();
					break;
				case 3:
					meetingRoom1();
					break;
				case 4:
					teaRoom();
					break;
				case 9:
//			itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		} else if (viewFloor() == 1) {
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.printf("        도망에 성공하였습니다.              \n", viewFloor());
			System.out.println("                                     ");
			System.out.println("     1. 로비                                ");
			System.out.println("                                    ");
			System.out.println("                                    ");
			System.out.println("                                    ");
			System.out.println("                                    ");
			System.out.println("                                     ");
			System.out.println("     9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거

				switch (input) {
				case 1:
					bossRoom();
					break;
				case 9:
//			itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		}
	}

	public void failedAway() {
		int input = 0;
		String straight = "┃";
		System.out.print("\n\n\n\n\n");
		System.out.printf("가%38s\n", straight);
		System.out.printf("ss%38s\n", straight);
		System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
		System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
		System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
		System.out.println("                                     ");
		System.out.println("          도망에 실패했습니다.                ");
		System.out.println("          좀비에게 피해를 입습니다.                        ");
		System.out.println("                                     ");
		System.out.println("    1.공격하기                                  ");
		System.out.println("    2.도망가기                                  ");
		System.out.println("                                     ");
		System.out.println("    9. 아이템 사용                       ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		boolean flag = true;
		while (flag) {
			flag = false;
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거

			switch (input) {
			case 1:
				Attackview();
				break;
			case 2:
				awayView();
				break;
			case 9:
//		itemUse();
				break;
			default:
				System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
				flag = true;
			}
		}
	}

	public void avoid() {
		int input = 0;
		String straight = "┃";
		if ((int) (Math.random() * 100) <= 50) {
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.println("            회피에 성공했습니다.                ");
			System.out.println("        좀비의 공격을 피하고                        ");
			System.out.println("        좀비를 쓰러트립니다.                             ");
			System.out.println("                           ");
			System.out.println("    1.돌아가기                                  ");
			System.out.println("                                     ");
			System.out.println("    9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거

				switch (input) {
				case 1:
					displayMenu();
					break;
				case 9:
//		itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		} else {
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.println("        회피에 실패했습니다.                ");
			System.out.println("        피해를 입고 좀비를 쓰러트립니다.                       ");
			System.out.println("                                     ");
			System.out.println("                           ");
			System.out.println("    1.돌아가기                                  ");
			System.out.println("                                     ");
			System.out.println("    9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거
				switch (input) {
				case 1:
					displayMenu();
					break;
				case 9:
//			itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		}
	}

	public void teaRoom() {
		if (viewHp() == 5 || viewStamina() == 5) {
			int input = 0;
			String straight = "┃";
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.println("      이미 채력과 스태미나가 최대입니다.        ");
			System.out.println("                                          ");
			System.out.println("                                           ");
			System.out.println("                                          ");
			System.out.println("    1.돌아가기                                  ");
			System.out.println("                                     ");
			System.out.println("    9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거

				switch (input) {
				case 1:
					displayMenu();
					break;
				case 9:
//			itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		} else {
			int input = 0;
			String straight = "┃";
			System.out.print("\n\n\n\n\n");
			System.out.printf("가%38s\n", straight);
			System.out.printf("ss%38s\n", straight);
			System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
			System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
			System.out.println("                                     ");
			System.out.println("     채력과 스태미나를 회복합니다.         ");
			System.out.println("                                          ");
			System.out.println("                                          ");
			System.out.println("                                       ");
			System.out.println("    1.돌아가기                                   ");
			System.out.println("                                     ");
			System.out.println("    9. 아이템 사용                       ");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			boolean flag = true;
			while (flag) {
				flag = false;
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행문자 제거

				switch (input) {
				case 1:
					displayMenu();
					break;
				case 9:
//				itemUse();
					break;
				default:
					System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
					flag = true;
				}
			}
		}
	}

	public void bossRoom() {
		int input = 0;
		String straight = "┃";
		System.out.print("\n\n\n\n\n");
		System.out.printf("가%38s\n", straight);
		System.out.printf("ss%38s\n", straight);
		System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
		System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
		System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
		System.out.println("                                     ");
		System.out.println("        경비좀비가 나타났습니다.                ");
		System.out.println("                                     ");
		System.out.println("                                     ");
		System.out.println("    1.공격하기                       ");
		System.out.println("    2.도망가기                                  ");
		System.out.println("                                     ");
		System.out.println("    9. 아이템 사용                       ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		boolean flag = true;
		while (flag) {
			flag = false;
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거
			switch (input) {
			case 1:
				Attackview();
				break;
			case 2:
				awayView();
				break;
			case 9:
//		itemUse();
				break;
			default:
				System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
				flag = true;
			}
		}
	}
	public void itemUse() {
		int input = 0;
		String straight = "┃";
		System.out.print("\n\n\n\n\n");
		System.out.printf("가%38s\n", straight);
		System.out.printf("ss%38s\n", straight);
		System.out.println("┏━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━┓");
		System.out.printf("┃HP : %d/5┃STN : %d/5   ┃현재 위치 : %d F ┃\n", viewHp(), viewStamina(), viewFloor());
		System.out.println("┃━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━┫");
		System.out.println("                                     ");
		System.out.println("  사용하실 아이템을 선택해 주세요     ");
		System.out.println("                                    ");
		System.out.println("                                     ");
		System.out.println("     아이템 목록                     ");
		System.out.println("                                     ");
		System.out.println("                                     ");
		System.out.println("    1. 1번 아이템 사용               ");
		System.out.println("    2. 2번 아이템 사용               ");
		System.out.println("    3. 3번 아이템 사용               ");
		System.out.println("    4. 4반 아이템 사용               ");
		System.out.println("    5. 5번 아이템 사용               ");
		System.out.println("                                     ");
		System.out.println("                                     ");
		System.out.println("    9. 돌아가기                        ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		boolean flag = true;
		while (flag) {
			flag = false;
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거

			switch (input) {
			case 1:
				displayMenu();
				break;
			case 2:
				displayMenu();
				break;
			case 3:
				displayMenu();
				break;
			case 4:
				displayMenu();
				break;
			case 5:
				displayMenu();
				break;
			case 9:
				displayMenu();
				break;
			default:
				System.out.println("[메뉴에 존재하는 번호만 입력 해주세요]");
				flag = true;
			}
		}
	}

	private int viewHp() {
		return gameService.viewHp();
	}

	private int viewStamina() {
		return gameService.viewStamina();
	}

	private int viewFloor() {
		return gameService.viewFloor();
	}

	public void moveFloor(boolean move) { // 층 이동
		gameService.moveFloor(move);
	}

	private int hitPlayer(int damage) {
		return gameService.hitPlayer(damage);
	}

	private void addItem(int index, String itemName) { // 원하는 빈칸에 입력 가능
		gameService.addItem(index - 1, itemName);// 사용자 편의 array[index-1]
	}

	public void useItem(int index) { // 사용하면 삭제"null"로 변경
		gameService.useItem(index - 1);
	}

}