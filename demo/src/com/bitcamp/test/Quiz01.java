package com.bitcamp.test;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		// 20개의 임의 정수들을 출력하세요
		// 그 중 최소, 최대 값 찾아 출력하세요.
		// 변수가 무엇이 필요하고 무슨 함수 기능을 써야할지 생각해본다. 	
		Random random = new Random();
		int min = 0;
		int max = 0;
		for(int i = 0; i <= 20; i++) {
			int ran = random.nextInt();
		if(ran > min) {
			min = ran;
		}
		if(ran < max) {
			max = ran;
		}
			System.out.println("최대값 > " + max);
			System.out.println("최소값 > " + min);
		}
	}
}
