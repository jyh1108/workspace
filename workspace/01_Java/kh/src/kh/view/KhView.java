package kh.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import kh.service.KhService;

public class KhView {
	Scanner sc = new Scanner(System.in);
	KhService Service = new KhService();
	
	public void displayMenu() {
		int input = 0;
		int floor = 7;
		do {
			try {
				System.out.printf("■현재 위치 [%d층]\n", floor);
				System.out.println("[ 선택지를 골라주세요. ]");
				System.out.println("1. 탕비실(60%) ");
				System.out.println("2. 화장실(20%)");
				System.out.println("3. 사무실(80%)");
				System.out.println("4. 휴게실(40%)");
				System.out.println("5. 아래 층(50%)");
				System.out.println();
				System.out.println("9. 아이템 사용");	
				System.out.println("채력 : " + hp1 + "스태미나 : ");	
				System.out.println();
				System.out.print("행동 선택 -> ");
				
				
				input =sc.nextInt();
				sc.nextLine(); 
				System.out.println();
				switch(input) {
				case 1 :  break;
				case 2 :  break;
				case 3 :  break;
				case 4 :  break;
				case 5 :  break;
				case 6 :  break;
				case 7 :  break;
				case 8 :  break;
				case 9 :  break;
				case 0 :  break;
				default : System.out.println("[잘못 입력하셨습니다. 행동을 선택해 주세요]");
				}
			}catch (InputMismatchException e) {
				System.out.println("[잘못된 형식의 입력입니다.]");
				sc.nextLine(); 
				input = -1; 
			}
			System.out.println();
		}while(input != 99);
	}
	
	public void hp1() {
		if(hp==5) {
			System.out.println("♥ ♥ ♥ ♥ ♥");
		}else if(hp==4) {
			System.out.println("♥ ♥ ♥ ♥ ♡");
		}else if(hp==3) {
			System.out.println("♥ ♥ ♥ ♡ ♡");
		}else if(hp==2) {
			System.out.println("♥ ♥ ♡ ♡ ♡");
		}else if(hp==1) {
			System.out.println("♥ ♡ ♡ ♡ ♡");
		}else if(hp==0) {
			System.out.println("♡ ♡ ♡ ♡ ♡");
		}
	}
	
}
