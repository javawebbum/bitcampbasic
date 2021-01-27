package com.bitcamp.controls;

public class ExStatement02 {
	
	public static void main(String[] args) {
		// do while
		// 키보드로부터 입력받은 값이 숫자이면.....
//		int key = 0;
//		do {
//			key = System.in.read();	 // do 입력한번 받고 
//			// 실행 후 검사 
//		}
//		while(key == '숫자'); // 그에 따른 결과에따라 숫자면 또 실행할수있게 된다. 
	}
	public static void main_while(String[] args) {
		// while
		int i = 0;
		while(i<10) { // while(조건식) 조건식이 참일때 실행
			System.out.println(i);
			i++;
	}
}
	
	public static void main_for(String[] args) {
		// for : 개수 , 횟수 반복
//		for(초기식 ; 조건식  ; 증감식  ) {
		for(int i=0; i<=10; ++i) {
			System.out.println(i); // 조건식 보고 참이면 실행하고 증감식으로 가서 조건식으로 간다. 
		}
	}
}