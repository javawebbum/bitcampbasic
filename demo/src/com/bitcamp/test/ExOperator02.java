package com.bitcamp.test;

import java.util.Random;

public class ExOperator02 {

	public static void main01(String[] args) {
		
		int totalContent = 1213;
		int contentsPerPage = 25;
		
		int pages = totalContent / contentsPerPage; // 총 페이지
		int mod = totalContent % contentsPerPage; // 남은거 
		
		if(mod > 0) {
			pages++; // 남으면 페이지 하나를 더 추가한다.
		}
		System.out.println(pages);
	}

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt() % 1001; // 1001 이하만 출력
		int b = random.nextInt() % 1001;	
		int c = random.nextInt() % 1001;
		int sum = a + b + c;
		System.out.printf("a : %d , b : %d , c : %d\n",a,b,c);
		System.out.println("총합 : " + sum);
		int avg = sum / 3;
		System.out.println("평균 : " + avg);
		
	}
	
}
