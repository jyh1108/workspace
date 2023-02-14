package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
		
	//1번
	public void practice1(){
		int [] arr = new int[9];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if(i %2 ==0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	//2번
	public void practice2(){
		int [] arr = new int[9];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if(i %2 !=0) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}

	//3번
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]+ " ");
		}
	}
	
	//4번
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("입력 %d: ", i);
			int input = sc.nextInt();
			arr[i]= input;
		}
		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();
		boolean bo = false;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==input2) {
				System.out.print("인덱스 : " + i);
				bo = true;
				break;
			} 
		}
		if(!bo) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	//5번문제
	public void practice5(){
		
		
	}
}
