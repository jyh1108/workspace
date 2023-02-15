package edu.kh.array.practice;

import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class ArrayPractice {

	// 1번
	public void practice1() {
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if (i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}

	// 2번
	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if (i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}

	// 3번
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	// 4번
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d: ", i);
			int input = sc.nextInt();
			arr[i] = input;
		}
		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();
		boolean bo = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input2) {
				System.out.print("인덱스 : " + i);
				bo = true;
				break;
			}
		}
		if (!bo) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	// 5번문제
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int j = 0;
		char[] arr = new char[str.length()];

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.print(i + " ");
				j++;
			}
		}
		System.out.printf("\n%c 개수 : %d", ch, j);
	}

	// 6번
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d 번째 인덱스에 넣을 값 :", i);
			int input = sc.nextInt();
			arr[i] = input;
			sum += input;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("\n총합 : " + sum);
	}

	// 7번
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 (-포함) : ");
		String input = sc.next();
		char[] arr = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			if (i > 7) {
				System.out.print("*");
				continue;
			}
			System.out.print(arr[i]);
		}
	}

	// 8번
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int div = arr.length/2;
		if (input < 3 || input % 2 == 0) {
			System.out.println("다시 입력하세요.");
		} else { 
			for(int i =0; i<arr.length; i++) {
				if(i<= div ) {
				arr[i] = i+1;
				}else {
					arr[i] = arr[div] - (i - div);
				}
				System.out.print(arr[i]);
			}
		}
	}
}
