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
		 case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :  System.out.printf("%d월은 31일까지 있습니다.", num); break;
		 case 2 : System.out.printf("%d월은 28일까지 있습니다.", num);break;
		 case 4 :case 6 : case 9 :case 11 : System.out.printf("%d월은 30일까지 있습니다.", num);break;
		 default : System.out.printf("%d잘못 입력된 달입니다.", num);
		 }
	 }
	 
	 //4번
	 public void practice4() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("키(m)를 입력해 주세요 : " );
		 double input1 = sc.nextDouble();
		 System.out.print("몸무게(kg)를 입력해 주세요 : " );
		 double input2 = sc.nextDouble();
		 
		 double bmi = input2 / (input1 * input1);
		 System.out.println("BMI 치수 : " + bmi);
		 String res;
		 if(bmi < 18.5) {
			 res = "저체중";
		 }else if(bmi < 23) {
			 res = "정상체중";
		 }else if(bmi < 25) {
			 res = "과체중";
		 }else if(bmi < 30) {
			 res = "비만";
		 }else {
			 res = "고도비만";
		 }
		 System.out.println(res);
	 }
	 
	 //5번
	 public void practice5() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("중간 고사 점수 : ");
		 double input1 = sc.nextDouble();
		 System.out.print("기말 고사 점수 : ");
		 double input2 = sc.nextDouble();
		 System.out.print("과제 점수 : ");
		 double input3 = sc.nextDouble();
		 System.out.print("출석 횟수 : ");
		 double input4 = sc.nextDouble();
		 System.out.println("=====================결과====================");
		 double inp1 = input1 * 0.2;
		 double inp2 = input2 * 0.3;
		 double inp3 = input3 * 0.3;
		 String res;
		 double sum = inp1 + inp2 + inp3 + input4;
		 if(input4 < 14) {
			 res = "Fail [출석 횟수 부족 (" + input4 + "/20)]"; 
		 }else if (sum < 70 ) {
			 System.out.println("중간 고사 점수(20) : " + inp1);
			 System.out.println("기말 고사 점수(30) : " + inp2);
			 System.out.println("과제 점수(30) : " + inp3);
			 System.out.println("출석 점수(20) : " + input4);
			 System.out.println("총점 : " + sum);
			 res = "Fail [점수 미달]";
		 }else {
			 System.out.println("중간 고사 점수(20) : " + inp1);
			 System.out.println("기말 고사 점수(30) : " + inp2);
			 System.out.println("과제 점수(30) : " + inp3);
			 System.out.println("출석 점수(20) : " + input4);
			 System.out.println("총점 : " + sum);
			 res = "PASS";
		 }
		 System.out.println(res);
	 }

	 
}
