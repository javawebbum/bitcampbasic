package com.bitcamp;

import java.util.Random; // 패키지가 다른 클래스는 import 한다. 

public class ExOperator02 {
	
	public static void main(String[] args) {
		// 전체 게시글에 개수 : 1200개
		// 한 페이지 최대 25개의 게시글을 출력한다.
		// 1번부터 최대 몇 번까지 페이지 번호 구하시오
		// 48장   근데 1213개 남는게 있으면 +1장 하기 
		
		int totalContent = 1213;
		int contentsPerPage = 25;
		int pages = totalContent/contentsPerPage;
		int mod = totalContent%contentsPerPage;  // 남은게 있다면 
		if( mod > 0 ) { // 남는게 있다면 (페이징처리) 제어문을 활용해서 원하는 결과가 되도록 조절
		pages++;
		// 아까 평균계산할때 / 나눗셈
		}
		System.out.println(pages); // 48
	}
	public static void main03(String[] args) {
		// 일정 범위의 정수 출력하기
		// min 과 max 사이의 정수 3개가 나오게 하기
		Random random = new Random();
		int min = random.nextInt(10); //0~9;
		int max = random.nextInt(100)+min; // % 100 + min;   최소값 부터 최대값
		
		// min 1  max 5   max-min+1 = 숫자 5개 
		// min 에서부터 길이(max-min+1)만큼의 연속 범위 
		System.out.println(min + " " + max);
//		int a=random.nextInt()%(max-min+1)+min; // min에서부터 max까지  // (max-min+1)는 최대길이 
		int a=random.nextInt(max-min+1)+min; // min ~ max
		int b=random.nextInt()%(max-min+1)+min;
		int c=random.nextInt()%(max-min+1)+min;
		System.out.println("a " + a + "b " + b + "c " + c);
	}
	public static void main02(String[] args) {
//		// 임의 값 처리
		double ran = Math.random(); // double 반환을 정수로 바꿔야한다. 난수 0.xxx ~ 1.xxx 사이가 나와서 자리올림을해줘야한다. 
		int number = (int)(ran*1000); // ran의 값을 먼저 자리올림을 해주고 int로 짤라줘야한다. ( 순서의 중요성  )
		System.out.println(number);
//		double lf = 10.789;
//		System.out.println(lf); // 10.789
//		// 자동 형변환
//		int n = (int)lf; // 실수-정수:
//		System.out.println(n); // 10 소수이하부분이 없어진다.
//		System.out.println((double)n); // 10.0 	
	}
	public static void main01(String[] args) {
		// 임의 정수 3개의 총합 , 평균을 구하세요
		Random random = new Random(); // Random을 만들어야지 쓸수있다. 임의정수 = random를 쓴다.  
		
		int a = random.nextInt() % 1001; // 1001이하 , 1000까지   임의정수값을 반환한다. 
		int b = random.nextInt() % 1001; 
		int c = random.nextInt() % 1001; // 처리되는 값의 범위 일정하게 정해진 경우가 많다
		int sum = a + b + c; // 변수 개구가 몇 개 안될때  수십개는 반복으로 처리한다. 
		System.out.println("총합 : " + sum); // 문자열 + 정수 -> 문자열
		int avg = sum / 3;
		System.out.println("평균 : " + avg);
		// out 안에 있는 println 함수를 호출한다. 	
//		sum = 0;
//		// 누적할때 
//		sum = sum + a;
//		sum = sum + b;
//		sum = sum + c; ctrl + / 전체주석
				
	}
}
