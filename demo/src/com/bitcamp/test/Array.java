package com.bitcamp.test;

public class Array {
// 배열 리스트 보기 , 추가 , 업데이트 
	
	static int[] list = new int[5];
	
	
	public static void main(String[] args) {
		
		list(); // 리스트 보기
		add(score,20);  // 추가 하기
		
	}

	private static void list() {
		for(int i=0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
}