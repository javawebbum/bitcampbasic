package com.bitcamp;

public class ExOperator01 {
	
	public static void main(String[] args) {
		// 3. 논리연산 ; 논리
		boolean cond = 3 < 5 ;  // true
		boolean state = 5 == 10; // false
		// 여러 조건을 합친다.
		boolean logic = cond && state; //AND
		logic = cond || state; //OR
		logic = !state; // NOT 단항 논리를 반대로 뒤집는다. ~아니면
						// 진리표에 XOR는 논리연산이 아니라 비트연산에 속한다.
		System.out.println(logic);
	}
	
	public static void main02(String[] args) {
		// 2. 관계연산 : 논리 ~이면
		boolean logic; 
		logic = 3 < 5;
		logic = 3 <= 5;
		logic = 3 > 5;
		logic = 3 >= 5;
		logic = 3 == 5; // 같으면 참이다.
		logic = 3 != 5; // 다르면 참이다.
	}
	
	public static void main01(String[] args) {
		/**
		 * 산술연산 : 값(정수,실수,문자)
		 * 관계연산 : 논리(boolean) , 값 간의 크기를 비교한다.
		 * 논리연산 : 논리 : 조건간의 비교(조합한다.)
		 * 비트연산 : 장치제어,이미지처리,암호처리
		 * 
		 * 연산자를 사용해서 식을 만든다.
		 * 조건식의 결과는 boolean이 나온다. 
		 * 증감 연산자 : 증가 +1씩 , 감소 -1씩
		 * 
		 */
		
		// 1. 산술연산 
		int num;  // int형 정수 선언 
		num = 10 + 5; // 초기화 , 실수가 있으면 실수, 정수와 정수는 정수
		num = 10 - 5; // 빼기 
		num = 10 * 5; // 곱하기
		num = 10 / 5; // 나누기 소수점 이하의 값 탈락  
		num = 10 % 5; // 나머지 최대 한정 , 계산의 결과는 오른쪽 값 보다 작다.
		// 증감연산자는 반드시 기본형 변수에만 붙일 수 있다. (변수의값이 달라진다) 
		++num;
		num--;

		// 변수의 값 -> 변경       = 대입  ++는 대입연산자를 포함한다. ++n -> n = n + 1;
		// n 변수의 값이 변하면서 대입 n++; , n+0 n+1 n+2 n의기준으로 더한다. 엄언히 다르다. 
		
		// 정수 : 10진법  0~9 표현
		num = 1;
		num = num * 10 + 2; // x10은 한자리올라가는것 
		num = num * 10 + 3;
		// 배수 판별(단)식  배수가 2면 배수가 아니면 , ~이면 if(){}
		num = 10;
		if(num % 2 == 0) {
			System.out.println("2의 배수 입니다.");
		}
	}
}
