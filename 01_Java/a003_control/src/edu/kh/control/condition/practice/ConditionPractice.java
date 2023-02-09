package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	 public void practice1(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자를 한 개 입력하세요 : ");
		 int num = sc.nextInt();
		 String res;
		 if(num < 0) {
			 res = "양수만 입력해주세요.";
		 }else if(num % 2 == 1) {
			 res = "홀수입니다.";
		 }else {
			 res = "짝수입니다.";
		 }
		 System.out.println(res);
	 }
	 
	 //2번
	 public void practice2() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("국어 점수 : ");
		 int kor = sc.nextInt();
		 System.out.print("수학 점수 : ");
		 int math = sc.nextInt();
		 System.out.print("영어 점수 : ");
		 int eng = sc.nextInt();
		 String res;
		 
		 int sum = kor + eng + math;
		 
		 double ave = (double)sum / 3;
		 
		 if(kor < 40 && eng < 40 && math < 40 ) {
			res = "불합격 입니다.";
			 }else if (ave < 60.0) {
				 res = "불합격 입니다.";
			 }else {
				 System.out.println(sum);
				 System.out.println(ave);
				 res = "축하합니다, 합격입니다 ";
			 }
		 System.out.println(res);
	 }
	 
	 //3번
	 public void practice3() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("1~12 사이의 정수 입력 : ");
		 int num = sc.nextInt();
		
		 switch(num) {
		 case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : System.out.printf("%d월은31일까지 있습니다.", num);
		 case 2 : System.out.printf("%d월은28일까지 있습니다.", num);
		 case 4 :case 6 : case 9 :case 11 : System.out.printf("%d월은30일까지 있습니다.", num);
		 default : System.out.printf("%d잘못 입력된 달입니다.", num);
		 }
	 }
	 
}
