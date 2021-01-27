package com.bitcamp.test;

import java.util.Random;
// Math.random()*(최대~최소 +1) +최소

public class ExOperator02 {
	// 알파벳 소문자 랜덤으로 출력하시오
	public static void main(String[] args) {
		int alphabet = (int)(Math.random()*26)+65;
		System.out.printf("랜덤 대문자 > %c",alphabet);
	}
	public static void main01(String[] args) {
	// 일정범위 이내 10~100 임의의 정수 3개를 출력하시오
		int min = (int)(Math.random()*10); // 최소범위가 와야한다.
		int max = (int)(Math.random()*100)+min;
		int a , b , c;
		a = (int)(Math.random()*max-min+1)+min;
		b = (int)(Math.random()*max-min+1)+min;
		c = (int)(Math.random()*max-min+1)+min;
		System.out.printf("%d > %d > %d >" ,a,b,c);
	}
}
