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
			 for(int i = 0; i<=input1-1 ; i++) {
				 for(int x = 1; x<input1-i; x++) {
					 System.out.print(" ");
				 }
				 for(int j=0; j<i+1; j++) {
					 System.out.print("*");
				 }
				System.out.println();
			 }
		 }
		 
		 
		 //10번
		 public void practice10(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("정수 입력 : ");
			 int input1 = sc.nextInt();
			 for(int i =1; i<=input1; i++) {
				 for(int x= 1; x<=i; x++) {
					 System.out.print("*");
				 	}
				 System.out.println();
			 }
			 for(int o = input1-1; o>=1; o--){
				 for(int j=o; j>=1; j--) {
					 System.out.print("*");
				 	}
				 System.out.println();
			 	}
			 }
		 
		 //11번
		 public void practice11(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("정수 입력 : ");
			 int input1 = sc.nextInt();
			 for(int i = 1; i<=input1; i++) {
				 for(int x= 1; x<=input1-i; x++) {
					 System.out.print(" ");
				 }
				 for(int j = 0; j<i; j++) {
					 if(j != 0) {
					 System.out.print("**");
					 }else {
						 System.out.print("*");
					 }
				 }
				 System.out.println();
			 }
		 }
		 
		 //12번
		 public void practice12(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("정수 입력 : ");
			 int input1 = sc.nextInt();
			 for(int i = 1; i<=input1; i++) {
				 for(int x =1; x<=input1; x++) {
					 if(i != 1 && x != 1 && i != input1&& x != input1) {
							 System.out.print(" ");
					 }else {
					 System.out.print("*");
					 }
				 }
				 System.out.println();
			 }
		 }
		 
		 //13번
		 public void practice13(){
			 Scanner sc = new Scanner(System.in);
			 System.out.print("자연수 하나를 입력하세요. : ");
			 int input = sc.nextInt();
			 int x = 0;
			 System.out.print("2와 3의 배수는 : ");
			 for(int i = 1; i<=input; i++){
				if(i % 2 ==0 || i % 3 ==0) {
					System.out.print(i + " ");
				}
				 if(i % 2 ==0 && i % 3 == 0) {
					 x++;
				 }
			 }
			 System.out.println();
			 System.out.println("count : " + x);
		 }
}
