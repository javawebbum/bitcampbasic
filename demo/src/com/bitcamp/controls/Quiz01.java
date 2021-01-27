package com.bitcamp.controls;

import java.util.Random;

public class Quiz01 {
	
	public static void main(String[] args) {
		// 1 ~ 27까지 연속으로 정수들을 출력
		// 매 행 마다 최대 5개까지만 출력할수있다.
		// 가능한 방법 2가지 이상	
		// 또한 13부터 27까지이면 	
		int cnt=0;
		for(int i=1; i <= 27; i++) {
			System.out.print(i + " ");
			cnt++;
			if(cnt % 5 == 0) { // 값보다 ㅏ운트를줘서 카운트개수에따라 나누는게 좋다 
				// 행을 내리는 조건 5개면 내린다. 
				System.out.print("\n");
			}
		}
		System.out.println();
		System.out.println("---------------");
		int cnt2=0;
		while(cnt<27) {
			cnt++; // 행단위로 카운트를 몇개 했냐 
			System.out.print(cnt +" ");
			if(cnt % 5 == 0) { // 열배수 단위로 
				System.out.print("\n");
			}
		}
		// 개수가 정해진 상황 , 개수가 정해지지 않는 상황 (종료), 항상 기준이 필요한 끝을 정해진 반복을 종료시켜야 한다.
		// 길이가 늘었다 줄엇다하는 가변길이에 끝이 정해져있어야한다.
		int number;
		int count=0;
		while(true) {
			// 반복을 멈춰야 한다.
			number = (int)(Math.random()*1000);// 0 ~ 100  
			if(number < 10) { // 10 보다 작으면 
				break; // 조건이 참이면 block을 빠져나간다.
			}
			System.out.print(number + " ");
			++count; // 전체 카운트를 몇개했냐 
			if(count == 5) { // 행단위
				System.out.println();
				count = 0; 
			}
		}	
	}	
	public static void main01(String[] args) {
		// 20개의 임의 정수들을 출력하세요
		// 그 중 최소, 최대 값 찾아 출력하세요.
		// 변수가 무엇이 필요하고 무슨 함수 기능을 써야할지 생각해본다. 	
		int max = 0;
		int min = 0;
		Random random = new Random();
		for(int i=0; i < 19; i++) {
			int ran = random.nextInt();
			if(i==0) { // 첫번째 값으로 가정을 한다 
				min = max = ran; // 처음나온값으로 min , max로 초기화하고 다음 ran으로 비교해서 추론한다.
			}
			System.out.println(ran);
			// 출력한 값 ran
			// 출력한 값이 ran 작은 값, 큰 값 남긴다.
			if(ran < min) {
				min = ran;
			} 
			if(ran > max) {
				max = ran;
			}
		}
		// 20개 출력을 완료함 
		System.out.println("최소값은  > " + min);
		System.out.println("최대값은  > " + max);
	}
}
