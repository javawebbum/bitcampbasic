package com.bitcamp.test;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		// 20���� ���� �������� ����ϼ���
		// �� �� �ּ�, �ִ� �� ã�� ����ϼ���.
		// ������ ������ �ʿ��ϰ� ���� �Լ� ����� ������� �����غ���. 	
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
			System.out.println("�ִ밪 > " + max);
			System.out.println("�ּҰ� > " + min);
		}
	}
}
