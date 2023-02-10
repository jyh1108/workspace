package edu.kh.control.loop.practice;

import java.util.Scanner;

public class ForPractice {
	
	//1번
	 public void practice1(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("1이상의 숫자를 입력하세요 : ");
		 int input = sc.nextInt();
		 
		 
		 for(int i = 1; i<=input; i++ ) {
			 if(input<0) {
				 System.out.println("1 이상의 숫자를 입력해주세요.");
			 }
			 System.out.print(i + " ");
		 }
	 }
	 
	 //2번
	 public void practice2(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("1이상의 숫자를 입력하세요 : ");
		 int input = sc.nextInt();
		 
		 for(int i = input; i>=1; i-- ) {
			 if(input<0) {
				 System.out.println("1 이상의 숫자를 입력해주세요.");
			 }
			 System.out.print(i + " ");
		 }
	 }
	 
	 //3번
	 public void practice3(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수를 하나 입력하세요 : ");
		 int input = sc.nextInt();
		 int sum = 0;
		 for(int i = 1; i<=input; i++) {
			 sum += i;
			 System.out.print(i);
			 if(i != input) {
			 System.out.printf("+");
			 }
		 }
		 System.out.print(" = " + sum);
	 }
	 
	 //4번[pass]
	 public void practice4(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("첫 번째 숫자 : ");
		 int input1 = sc.nextInt();
		 System.out.print("두 번째 숫자 : ");
		 int input2 = sc.nextInt();
		 
		 
		 
		 if(input1 < 0 || input2 < 0) {
			 System.out.println("1 이상의 숫자를 입력해주세요");
		 }else {
			 if(input1<input2) {
				 for(int i = input1; i<=input2; i++) {
					 System.out.print(i + " ");
				 }
			 }else {
				 for(int i = input2; i<=input1; i++) {
					 System.out.print(i + " ");
				 }
			 }
		 }
	 }
	 
	 //5번
	 public void practice5(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자 : ");
		 int input1 = sc.nextInt();
		 System.out.printf("========%d단========\n",input1);
		 for(int i = 1; i<=9; i++) {
			 System.out.printf("%d * %d = %d \n", input1,i,input1*i);
		 }
	 }
	 
	 //6번
	 public void practice6(){
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자 : ");
		 int input1 = sc.nextInt();
		 if(input1 < 2 || input1 > 9) {
			 System.out.println("2~9 사이 숫자만 입력해주세요");
		 }else
			 for(int x=input1; x<=9; x++) {
				 System.out.printf("========%d단========\n",x);
				 for(int i = 1; i<=9; i++) {
					 System.out.printf("%d * %d = %d \n", x,i,x*i);
				 }
			 }
	 }
	 
	 //7번
		 public void practice7(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("정수 입력 : ");
			 int input1 = sc.nextInt();
			 for(int x= 1; x<=input1; x++) {
				 for(int i = 1; i<=x; i++) {
					 System.out.print("*");
				 }
				 System.out.println();
			 }
		 }
		 
		 //8번
		 public void practice8(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("정수 입력 : ");
			 int input1 = sc.nextInt();
			 
			 for(int x = input1; x>=1; x--) {
				 for(int i = 1; i<=x; i++) {
					 System.out.print("*");
				 }
				 System.out.println();
			 }
		 }
		 
		 //9번
		 public void practice9(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("정수 입력 : ");
			 int input1 = sc.nextInt();
			 String a = " ";
			
			 for(int i = 1; i<=input1; i++) {
				 for(int x = 1; x<=i; x++) {
					 System.out.print(a);
					 System.out.print("*");
				 }
				 System.out.println();
			 }

		 }
}
