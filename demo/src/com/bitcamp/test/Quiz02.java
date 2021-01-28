package com.bitcamp.test;

import java.util.Random;

public class Quiz02 {
	public static void main(String[] args) {
		// 일정범위 이내 10~100 임의의 정수 3개를 출력하시오
		for(int i = 0; i < 100; i++) {
		 int number = ((int)(Math.random()*50)+10);
		 System.out.println(number);
		}
	}
}
