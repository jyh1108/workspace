package edu.kh.operator.practice;
import java.util.Scanner;
public class OperatorPractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		String name2 = sc.next();
		float num4 = sc.nextFloat();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다." , num1, num2, num3, name, name2, num4);;
	}
}
