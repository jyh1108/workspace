package edu.kh.operator.practice;
import java.util.Scanner;
public class OperatorPractice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : " );
		int Kor = sc.nextInt();
		System.out.print("영어 : " );
		int Eng = sc.nextInt();
		System.out.print("수학 : " );
		int Math = sc.nextInt();
		
		int sum = Kor + Eng + Math;
		System.out.println(" 합계 : " + sum);
		double ave = (double)sum / 3;
		System.out.println("평균 : " + ave);
		String score = Kor >= 40 && Eng >= 40 && Math >=40 && ave >=60 ? "합격" : "불합격";
		System.out.println(score);
	}
}