package edu.kh.operator.practice;
import java.util.Scanner;
public class OperatorPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(정수)");
		int num1 = sc.nextInt();
		System.out.print("반(정수)");
		int num2 = sc.nextInt();
		System.out.print("번호(정수)");
		int num3 = sc.nextInt();
		System.out.print("성별(남학생/여학생)");
		String name2 = sc.next();
		System.out.print("성적(소수점 아래 둘째 자리까지)");
		float num4 = sc.nextFloat();

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다." , num1, num2, num3, name, name2, num4);;
	}
}
