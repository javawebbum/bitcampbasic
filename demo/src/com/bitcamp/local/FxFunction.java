package com.bitcamp.local;

/**
 * 함수 스택?
 * 2. 함수 정의
 * 1. 함수 호출
 * 
 * @author user
 *
 */
public class FxFunction {
	public static void main(String[] args) {
		// 정수를 하나 전달받아서 정수를 반환하는 함수
		int arg = 10;
		int rtValue;
		rtValue = 함수명(arg); // 호출	
	}
	private static int 함수명(int param) { // 틀   param = arg  호출되는값이 대입되서 들어온다. (복사)
		return param*10; // 리턴이 실행되면 함수가 종료된다. 계산한 결과값을 반환한다. 
	}
}
