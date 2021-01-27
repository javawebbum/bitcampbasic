package com.bitcamp.local;

public class ExVariables03 { 
	// 클래스 안에 , 함수 밖에 선언되는 변수 
	int nfield; // 필드(속성)
	
	public static void main(String[] args) { // String[] args 파라미터 = 매개변수 : 지역변수 
		// 변수 선언하는 위치에 따라 다르다.. { } - 지역성 일부지역에서만 사용할 수 있다.
		int numOfmain = 10; // 함수 내에서 선언되는 지역변수
		//num = 10;
		// 지역변수끼리는 밖에서 안에있는걸 사용못하지만 안에서는 밖에걸 쓸수있다.
		
		// 제어문 지역성 : 특히 반복문 작성 시 지역성 조심 
		int i;
		for(i=0; i<10; i++) {
			// 하나의 지역문으로 본다.
			int n = 10;
		}
//		n = 10;  // 안에있는걸 못씀
		i = 100; // 밖았것을 쓸수있다. 
		
		int ran;
		do {
			 ran = 90; // 안에있는건 밖에있는걸 쓸수있다.
		}while(ran > 100);
	}
}
