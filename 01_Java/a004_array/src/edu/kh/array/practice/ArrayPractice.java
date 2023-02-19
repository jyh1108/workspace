package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

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

		while (input < 3 || input % 2 == 0) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			input = sc.nextInt();
		}
		int[] arr = new int[input];
		int div = arr.length / 2;
		for (int i = 0; i < arr.length; i++) {
			if (i <= div) {
				arr[i] = i + 1;
			} else {
				arr[i] = arr[div] - (i - div);
			}
			System.out.print(arr[i]);
		}
	}

	// 9번
	public void practice9() {
		System.out.print("발생한 난수 : ");
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}

	// 10번
	public void practice10() {
		System.out.print("발생한 난수 : ");
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	// 11번
	public void practice11() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				ran = (int) (Math.random() * 10 + 1);
				if (arr[j] == ran) {
					j = -1;
				}
			}
			arr[i] = ran;
			System.out.print(arr[i] + " ");
		}
	}

	// 12번
	public void practice12() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random() * 45 + 1);
			arr[i] = ran;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					j = -1;
				}
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	// 13번
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		int count = 0;
		char[] arr = new char[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			boolean ia = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					ia = true;
					break;
				}
			}
			if (!ia) {
				count++;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("\n문자 개수 : " + count);
	}

	// 14번[pass]
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		String[] arr = new String[input];
		String[] arr2 = new String[input];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			String str = sc.next();
			arr[i] = str;
			arr2[i] = arr[i];
			count++;
		}
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char yn = sc.next().charAt(0);
			if (yn == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int input2 = sc.nextInt();
				String[] arr3 = new String[input2];
				for (int i = 0; i < input2; i++) {
					System.out.printf("%d번째 문자열 : ", ++count);
					String str = sc.next();
					arr3[i] = str;
				}
				arr2 = Arrays.copyOf(arr2, arr2.length + input2);
				System.arraycopy(arr3, 0, arr2, input, input2);
				input += input2;
			} else if (yn == 'n') {
				System.out.println(Arrays.toString(arr2));
				break;
			}
		}
	}

	// 15번
	public void practice15() {
		String[][] arr = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = String.format("( %s, %s )", i, j);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 16번
	public void practice16() {
		int[][] arr = new int[4][4];
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = number + 1;
				number++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	// 17번
	public void practice17() {
		int[][] arr = new int[4][4];
		int number = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = number;
				number--;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	// 18번
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					arr[i][3] = arr[i][2] + arr[i][1] + arr[i][0];
				} else if (i == 3) {
					arr[3][j] = arr[2][j] + arr[1][j] + arr[0][j];
				} else {
					arr[i][j] = (int) (Math.random() * 10 + 1);
				}
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	// 19번
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기 : ");
		int yu = sc.nextInt();
		System.out.print("열 크기 : ");
		int xu = sc.nextInt();
		char[][] arr = new char[yu][xu];
		while (yu < 1 || yu > 10 || xu < 1 || xu > 10) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			System.out.print("행 크기 : ");
			yu = sc.nextInt();
			System.out.print("열 크기 : ");
			xu = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (Math.random() * 25 + 65);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	// 20번
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기 : ");
		int yu = sc.nextInt();
		char[][] arr = new char[yu][];
		int count = 97;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d열의 크기 : ", i);
			int input = sc.nextInt();
			arr[i] = new char[input];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) count;
				count++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 21번
	public void practice21() {
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] str = new String[3][2];
		String[][] str2 = new String[3][2];
		System.out.println("== 1분단 == ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j] = students[count];
				System.out.print(str[i][j] + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("== 2분단 == ");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = students[count];
				System.out.print(str2[i][j] + " ");
				count++;
			}
			System.out.println();
		}
	}

	// 22번
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] str = new String[3][2];
		String[][] str2 = new String[3][2];
		System.out.println("== 1분단 == ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j] = students[count];
				System.out.print(str[i][j] + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("== 2분단 == ");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = students[count];
				System.out.print(str2[i][j] + " ");
				count++;
			}
			System.out.println();
		}
		System.out.print("===============================");
		System.out.print("\n검색할 학생 이름을 입력하세요 : ");
		String st = sc.next();
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				if (str[i][j].equals(st)) {
					if (j != 1) {
						System.out.printf("검색하신 %s 학생은 1분단 %s번째 줄 왼쪽에 있습니다.", st, i + 1);
					} else {
						System.out.printf("검색하신 %s 학생은 1분단 %s번째 줄 오른쪽에 있습니다.", st, i + 1);
					}
				}
				if (str2[i][j].equals(st)) {
					if (j != 1) {
						System.out.printf("검색하신 %s 학생은 2분단 %s번째 줄 왼쪽에 있습니다.", st, i + 1);
					} else {
						System.out.printf("검색하신 %s 학생은 2분단 %s번째 줄 오른쪽에 있습니다.", st, i + 1);
					}
				}
			}
		}
	}

	// 23번
	public void practice23() {
		Scanner sc = new Scanner(System.in);

		String[][] arr = new String[6][6];

		System.out.print("행 인덱스 입력 : ");
		int input1 = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int input2 = sc.nextInt();
		arr[input1][input2] = "X";

		System.out.println("  0 1 2 3 4");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < arr[j].length - 1; j++) {
				if (arr[i][j] == arr[input1][input2]) {
					arr[i][j] = "X";
				}else {
					arr[i][j] = " ";
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 24번
	public void practice24() {
		Scanner sc = new Scanner(System.in);

		String[][] arr = new String[6][6];
		while (true) {
			System.out.print("행 인덱스 입력 : ");
			int input1 = sc.nextInt();
			if (input1 == 99) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.print("열 인덱스 입력 : ");
				int input2 = sc.nextInt();
				arr[input1][input2] = "X";
				System.out.println("  0 1 2 3 4");
				for (int i = 0; i < arr.length - 1; i++) {
					System.out.print(i + " ");
					arr[input1][input2] = "X";
					for (int j = 0; j < arr[j].length - 1; j++) {
						if (arr[i][j] == arr[input1][input2]) {
							arr[i][j] = "X";
						}else {
							arr[i][j] = " ";
						}
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
	}
}
