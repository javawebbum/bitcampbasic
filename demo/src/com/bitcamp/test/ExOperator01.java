package com.bitcamp.test;

public class ExOperator01 {

	public static void main01(String[] args) {
		
		// 3. ������
		boolean cond = 3 < 5; // true;
		boolean state = 5 == 10; // false;
		boolean logic = cond && state; // false
		logic = cond || state; // true
		logic = !state; // true 	
		System.out.println(logic);
	}
	public static void main(String[] args) {
		// 2. ���迬�� : �� ~�̸� 
		boolean logic;
		logic = 3 < 5; // true
		logic = 3 <= 5; // true
		logic = 3 > 5; // false
		logic = 3 >= 5; // false
		logic = 3 == 5; // false
		logic = 3 != 5; // true
		// 1. ��� ���� 
		int num;
		num = 10 + 5;  
		num = 10 - 5; 
		num = 10 * 5; 
		num = 10 / 5; 
		num = 10 % 5; 
		++num;
		num--;
		
		num = 1;
		num = num * 10 + 2;
		num = num * 10 + 3;
		
		num = 10;
		if(num % 2 == 0) {
			System.out.println("2�� ����Դϴ�.");
		}
	}
}
