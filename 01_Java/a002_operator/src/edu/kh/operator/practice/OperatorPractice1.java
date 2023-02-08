package edu.kh.operator.practice;
import java.util.Scanner;
public class OperatorPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : " );
		int pNum = sc.nextInt();
		System.out.print("사탕 개수 : " );
		int cNum = sc.nextInt();
		
		int result1 = cNum / pNum ; 
		int result2 = cNum % pNum; 
		System.out.println("1인당 사탕 개수 :" +  result1);
		System.out.println("남은 사탕 개수 :" +  result2);
	}
}
