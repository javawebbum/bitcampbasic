package com.bitcamp.test;

import java.util.Random;
// Math.random()*(�ִ�~�ּ� +1) +�ּ�

public class ExOperator02 {
	// ���ĺ� �ҹ��� �������� ����Ͻÿ�
	public static void main(String[] args) {
		int alphabet = (int)(Math.random()*26)+65;
		System.out.printf("���� �빮�� > %c",alphabet);
	}
	public static void main01(String[] args) {
	// �������� �̳� 10~100 ������ ���� 3���� ����Ͻÿ�
		int min = (int)(Math.random()*10); // �ּҹ����� �;��Ѵ�.
		int max = (int)(Math.random()*100)+min;
		int a , b , c;
		a = (int)(Math.random()*max-min+1)+min;
		b = (int)(Math.random()*max-min+1)+min;
		c = (int)(Math.random()*max-min+1)+min;
		System.out.printf("%d > %d > %d >" ,a,b,c);
	}
}
