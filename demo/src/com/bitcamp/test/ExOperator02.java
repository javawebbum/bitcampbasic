package com.bitcamp.test;

import java.util.Random;

public class ExOperator02 {

	public static void main01(String[] args) {
		
		int totalContent = 1213;
		int contentsPerPage = 25;
		
		int pages = totalContent / contentsPerPage; // �� ������
		int mod = totalContent % contentsPerPage; // ������ 
		
		if(mod > 0) {
			pages++; // ������ ������ �ϳ��� �� �߰��Ѵ�.
		}
		System.out.println(pages);
	}

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt() % 1001; // 1001 ���ϸ� ���
		int b = random.nextInt() % 1001;	
		int c = random.nextInt() % 1001;
		int sum = a + b + c;
		System.out.printf("a : %d , b : %d , c : %d\n",a,b,c);
		System.out.println("���� : " + sum);
		int avg = sum / 3;
		System.out.println("��� : " + avg);
		
	}
	
}
