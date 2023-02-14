package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {

	/*
	 *  배열
	 *  =같은 자료형의 변수를 하나의 묶음으로 다루는 것/
	 *  - 묶어진 변수들은 하나의 이름(배열명)으로 불러지고
	 *   각각의 변수는 index를 사용해서 구분함
	 *   
	 *  -index는 0부터 시작
	 *  
	 */

	
	//배열 기본 사용법 1 
	public void ex1() {
		//배열 선언
		int[] arr;
		// - int[] 배열을 참조할 공간 할당하고 이를 arr 이라고 부르겠다.
		// * 기본자료형 8개를 제외한 나머지는 "참조형" 이라고 한다
		
		// 배열 할당
		arr= new int [4];
		arr= new int [30];
		arr= new int [20];
		arr= new int [10];
	
		// 2) 배열 각 요소의 값 얻어오기
		System.out.println("arr[0]  : " + arr[0]);
		System.out.println("arr[1]  : " + arr[1]);
		System.out.println("arr[2]  : " + arr[2]);
		System.out.println("arr[3]  : " + arr[3]);
		
	// 3) for문 + 배열
	System.out.println("-------------------");
	int sum =0;
		for(int i=0; i<4; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
			
			sum += arr[i];
		}
		System.out.println(sum);
	}
	// 배열 기본 사용법2 : 초기화
	public void ex2() {
		
		// 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것 
		
		// 1)       3)  2)
		int[]numbers = new int[4];
		// 1) stack 영역에 int 배열을 참조하기 위한 변수 
		// numbers를 선언 
		
		// 2) Heap 영역에 새롭게 int 4칸짜리 배열을 할당
		// -> index 번호 추가, 기본값(0)으로 초기화
		// 	  + 시작주소 부여 ex) 0x5123
		
		// 3) Heap 영역에 생성된 배열의 시작 주소(0x5123)를
		// Stack 영역 참조 변수 numbers에 대입한다.
		// ->numbers가 배열을 참조함
		
		// 1. 정말 numbers에 주소가 저장 되었을까??
		System.out.println(numbers);   //[I@6f2b958e (주소로 만든 숫자)

		
		// 2. 정말 기본값(0)으로 초기화 되었을까?
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		// -> 컴파일러가 0으로 초기화 하였음을 확인
		
		System.out.println("----------------");
		
		//배열 초기화
		
		//1) 인덱스를 이용한 초기화
		numbers[0] = 100;
		numbers[1] = 5;
		numbers[2] = 300;
		numbers[3] = 99;
		
		//breakpoint : debug모드로 실행 시 해당 줄의 코드가 수행되기 전 멈춤
		System.out.println("---------------");
		
		//for문을 이용한 초기화
		
		// ** 배열명.length : 배열의 길이(칸 수 ) 를 반환
		for(int i=0; i<numbers.length; i++) {
			
			numbers[i] = i *10 + 1;
		}
		System.out.println("------------");
		//선언과 동시에 초기화
		int[] number2 = {100,200,300, 400,500,600};
						//new 구문 생략
		System.out.println("------------------");
	}
	
	//배열 기본 사용법 3
	public void ex3() {
		// 3명의 키를 입력 받아 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 180.4
		
		// 입력 받은 키 : 170.5 165.7 180.4
		// 평균 키 : 172.20cm
		
		Scanner sc = new Scanner(System.in);
		double [] heightArray = new double[3]; // 0.0 0.0 0.0
		
		for(int i = 0; i <heightArray.length; i++) {
			System.out.printf("%d번 키 입력 : " , i+1); //1 2 3 
			heightArray[i] = sc.nextDouble();
					// 0 1 2
		}
		System.out.println(); //개행
		System.out.print("입력 받은 키 : ");
		
		double sum = 0.0; //키 합계 저장용 변수
		for(int i=0; i<heightArray.length ; i++) {
			// i = 0,1,2
			
			System.out.print(heightArray[i]+ " ");
			
			sum += heightArray[i]; // 키 누적
		}
		System.out.printf("\n평균 키 : %.2fcm", sum / 3);
	}
	
	// 배열 기본 사용법4
	public void ex4() { 
		//오늘의 점심 메뉴 뽑기
		
	//	String[] menuArr = new String[10];
		
		String[] menuArr = {"김밥 + 라면", "서브웨이", "KFC", "맘스터치",
							"순대국", "뼈해장국",
							"닭갈비", "마라탕", "우육면", "파스타", " 셀러드"};
		//0부터 배열 길이의 범위 내에서 난수 발생
		int index = (int)(Math.random() * menuArr.length);
		
		System.out.println("오늘의 점심 메뉴 !! : " + menuArr[index]);
	}
	
	//배열 사용 시 주의 사항 !!!
	public void ex5() {
		
		// 배열의 범위를 넘어선 index를 참조하는 경우
		
		int[] arr = {10,30,50,70,90};
		
		for(int i = 0; i<=arr.length; i++) {
			System.out.print(arr[i]+ " ");
			
			//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			//배열 인덱스 범위 초과 예외(에러) : 인덱스 5번은 길이5짜리 배열의 범위를 초과했다.
			
			//문제점 : for문의 조건식에서 i의 범위가
			//         arr 배열의 인덱스 범위를 초과하는 값까지 
			//		   증가하도록 작성되어
			//	       실행 시 for문 내 출력 구문에ArrayIndexOutOfBoundsException이 발생함.
			
			// 해결 방법 : 조건식을 i < arr.length로 수정하여
			//			   i가 배열의 인덱스 범위를 초과하지 않도록함
		}
	}
	//배열 사용법6
	public void ex6() {
		//인원 수를 입력받아 그 크기만큼의 정수 배열을 선언 및 할당하고 
		// 각 , 배열 요소에 점수를 입력 받아 저장.
		// 입력이 완료되면 합계, 평균, 최고점, 최저점 출력
		
		 // ex)
	      // 입력 받을 인원 수 : 4
	      // 1번 점수 입력 : 100
	      // 2번 점수 입력 : 80
	      // 3번 점수 입력 : 50
	      // 4번 점수 입력 : 60
	      
	      // 합계 : 290
	      // 평균 : 72.5
	      // 최고점 : 100
	      // 최저점 : 50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원수 : ");
		int size = sc.nextInt();
		
		int sum = 0; //합계 저장용 변수 
		
		//반복하면서 입력 
		int [] scoreArr = new int[size]; // 입력 받은 정수의 길이를 갖는 배열 생성
		for(int i = 0; i<scoreArr.length; i++) {
			
			System.out.print((i+1) + "번 점수 입력 : ");
			scoreArr[i] = sc.nextInt();
			
			sum += scoreArr[i];
			 
									
		}
		System.out.println(); //개행
		int max = scoreArr[0]; //1) 매우 작은 수 
								// 2) 배열의 0번 인덱스 값 
		int min = scoreArr[0]; //1) 매우 큰값
								//2) 배열의 0번 인덱스 값 
		
		int maxIndex = 0; //0번 인덱스
		int minIndex = 0;  
		//최대 / 최소 구하기	 	
		for(int i = 0; i<scoreArr.length; i++) {
			
			if(scoreArr[i] > max) {
				// 기존 max(최대값)보다 현재 배열 요소의 값이 더 큰 경우
				max = scoreArr[i];
				maxIndex = i; // 최고점 인덱스
			}
			if(scoreArr[i]<min) {
				// 기존 min(최소값)보다 현재 배열 요소의 값이 더 작은경우 
				min = scoreArr[i];
				minIndex = i; // 최고점 인덱스
			}
		}
		
			
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/(double)size) );
											// == scoreArr.length
		System.out.printf("최고점 : %d (%d번 학생) \n", max, maxIndex + 1);
		System.out.printf("최저점 :  %d (%d번 학생)\n",min,minIndex, +1);
		
	}
	
	public void ex7() {
		
		//입력 받은 정수가 배열에 존재하면 몇 번 인덱스에 있는지 출력
		//없으면 " 존재하지 않습니다 " 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
//		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 입력 : ");
//	
		int input = sc.nextInt();
//		int index = 0;
//		
//		// 입력값과 현재 인덱스 값이 같으면
//		for(int i=0; i<arr.length; i++) {
//			
//			//입력값과 현제 인덱스 값이 같으면 
//			if(input == arr[i]) {
//				index = 1;
//			}
//		}
//		
//		if(index<0) { //일치하는 결과가  없습니다.
//			System.out.println("존재하지 않습니다.");
//		}else {
//			System.out.println(index);
//		}
		
		int index = 0;
		
		boolean flag = true; //신호 용도의 변수
		// 검색 for문 종료 후 
		// flag가 true : 검색 결과 없음
		// flag가 false : 검색 결과 존재
		
		for(int i=0; i<arr.length; i++ ) {
			
			if(input ==arr[i]) {
				index = i;
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("존재하지 않습니다.");
		}else {
			System.out.println(index);
		}
	}
	
	//얕은 복수 / 깊은 복사
	public void ex8() {
		// 얕은복사
		// - 참조 하는 배열/객체의 주소만을 복사하여 
		// 서로 다른 참조 변수가 하나의 배열/객체를 참조함. (공유하는개념)
		
		// 깊은 복사 
		// - 원본과 같은 자료형, 크기는 같거나 더 큰 배열을 만들어 
		// 원본의 데이터를 모두 복사하는 방법
		
		//얕은 복사 확인 
		int[] arr1 = { 10, 20, 30, 40, 50};
		
		int[] copyArr1 = arr1; //arr1에 저장된 배열 주소 값을 복사
						       //arr1, copyArr1이 같은 배열 참조
		
//		 1) 참조하는 주소가 같은가?
//		System.out.println("arr1 : " + arr1);
//		System.out.println("copyArr1 : " + copyArr1); (같음)
		
		//2) 복사본의 값을 변경할 경우 원본이 변하는가?
		copyArr1[0] = 9999;
		// toSring() : 저장된 값을 하나의 문자열로 만든다.
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		
		System.out.println("---------------------");
		
		// 깊은 복사 확인
		int[] arr2 = {5,6,7,8};
		
		//깊은 복사를 진행할 arr2 배열과 같은 크기의 배열을 준비
		int[] copyArr2 = new int[arr2.length];
	
		//for문을 이용해서 깊은 복사
		for(int i=0; i<arr2.length; i++) {
			copyArr2[i] = arr2[i];
		}
		
		//System.arraycopy()를 이용한 깊은 복사);
		// 원본 배열명, 원본 배열 복사 시작 인덱스,
		// 복사 배열명,
		// 복사 배열의 삽입 시작 인덱스
		// 복사길이);
		
		System.arraycopy(arr2, 0, copyArr2, 0, 3);
//		 1) 참조하는 주소가 같은가?
		System.out.println(arr2);
		System.out.println(copyArr2);
		
		//2) 복사본의 값을 변경할 경우 원본이 변하는가?
		copyArr2[0] = 9999;
		
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
	}
	
	
}
