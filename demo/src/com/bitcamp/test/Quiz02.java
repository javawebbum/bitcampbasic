package com.bitcamp.test;

import java.util.Random;

public class Quiz02 {
	public static void main(String[] args) {
		// �������� �̳� 10~100 ������ ���� 3���� ����Ͻÿ�
		for(int i = 0; i < 100; i++) {
		 int number = ((int)(Math.random()*50)+10);
		 System.out.println(number);
		}
	}
}
