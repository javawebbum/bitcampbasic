package com.bitcamp.controls;


/**
 * 
 * 제어문
 * 선택문( ~ 이면, 일 때 )
 * - 논리에 따라 참,거짓
 * - 값에 따라 선택한다... 
 * 반복문( ~ 까지, 실행한다.)
 * - 연속해서 여러 번 실행되는 것
 * - ★ (한 번) 실행에 대한 정의  ★
 * - 변수의 값이 변하는 것 , 변하지 않는 것
 * - 일정한 것, 일정하지 않는 것
 * 
 * @author user
 *
 */ 
public class ExStatement01 {	
	
	
	public static void main(String[] args) {
		// 값을 판단
		int week = 1;
		if(week == 0) {	
		}
		else if(week == 1) {	
		}
		// 상수식 : 값을 1개만 쓸수 있다. 변수 , 식을 표현할 수 없다.
		// 시작점을 찾아 이후 내용 모두 실행한다.
		
		char cweek = ' ';
		switch( week ) {
		case 0: cweek='일';	break;
		case 1:	cweek='월';	break;
		case 2:	cweek='화';	break;
		case 3:	cweek='수';	break;
		case 4:	cweek='목';	break;
		case 5:	cweek='금';	break;
		case 6:	cweek='토';	break;
		}
		System.out.println(cweek + "요일");
	}
	
	public static void main03(String[] args) {
		// 문의 상태 , 잠금 상태
		boolean isOpen = false; // 닫힘
		boolean locked = false; // 풀림
		// NOT ~ 아니면 
		// 순서
		if(!locked) { // 잠금이 먼저 열리고 문이 열린다. 
			if(!isOpen) {
				System.out.println("문이 열렸다.");
			}
		}
	}
	
	public static void main01(String[] args) {
		// 분기문 : if
		if(true) {
			// 참일때
		} else {
			// 거짓일때
		}
		// 조건들의 연속 구조 
		// - 거짓이면 다음 조건으로 내려간다...
		int score = 40; // 범위를 계속 확인한다.
		if( score >= 90/*조건식*/)// 조건이 ~ 면  식의 결과가 boolean , && 논리와 논리 간의 조합
		{   
			// 조건식이 참일 때 실행 내용들   else if는 위에 조건식이 거짓일때 밑에가 실행되게끔 들어오는 조건식을 만들어야 한다. 
		} else if(score >= 80) { // 90보다 작으면서 80 이상인거
			
		} else if(score >= 60) { // 90보다 작으면서 60 이상인거
			
		} else if(score >= 40) { // 90보다 작으면서 40 이상인거
			
		} else {
			// A,B,C,D 모든 조건이 거짓일때 실행된다. 
		}
	}
}
