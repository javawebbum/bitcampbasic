package com.bitcamp.local;

/**
 * 함수 스택?
 * 2. 함수 정의
 * 1. 함수 호출
 * @author user
 *
 */
// 참조(클래스)형을 새로 만들어야 한다....  클래스안에 모두 멤버라고 부르며 멤버변수=필드,멤버함수=메소드 가 있다.
class Score {
	// 이 안에 실제 변수(값)
	int val; // 클래스안에 쓰는 변수는 필드 = 참조형 
}
public class FxFunction {
	public static void main(String[] args) {	
		Score score = new Score(); // 새로운 공간을 만듬 
		edit03(score);
		System.out.println(score.val);
		// 참조를 전달한다...
	}
	private static void edit03(Score param) {
		param.val = 200; // 위치를 알아서 메모리 접근 가능 리턴을 안해도 값이 변경되어 있다. 
	}
	public static void main03(String[] args) {
		// 다른 함수가값을 변경한다. 기본형변수 불가하다.
		int num = 0;
//		edit01(num); // 변수의값을 전달 한 것 
		// 변경은 이 main 함수가 한다. 변경할 값을 다른 함수로부터 받는다.
		num = edit02(num); // main에서 함수로부터  값을 반환 받는다. 
		System.out.println("main : " + num);	
	}
	private static int edit02(int num) { // 변수를 전달받은게 아니라 값을 받은것이다. 
		// TODO: 매개변수는 edit02 함수의 변수 , 직접 다른 함수의 변수를 수정하는 것이 아니다.  
		num = num * 10 + 3;
		return num; // 반환한다.
	}
	public static void main01(String[] args) {
		// 정수를 하나 전달받아서 정수를 반환하는 함수
		int arg = 10;
		int rtValue;
		rtValue = 함수명(arg); // 호출	
	}
	private static int 함수명(int param) { // 틀   param = arg  호출되는값이 대입되서 들어온다. (복사)
		return param*10; // 리턴이 실행되면 함수가 종료된다. 계산한 결과값을 반환한다. 
	}
}
