package com.bitcamp.controls;

import java.util.Random;

public class Quiz01 {
	
	public static void main(String[] args) {
		// 1 ~ 27���� �������� �������� ���
		// �� �� ���� �ִ� 5�������� ����Ҽ��ִ�.
		// ������ ��� 2���� �̻�	
		// ���� 13���� 27�����̸� 	
		int cnt=0;
		for(int i=1; i <= 27; i++) {
			System.out.print(i + " ");
			cnt++;
			if(cnt % 5 == 0) { // ������ ����Ʈ���༭ ī��Ʈ���������� �����°� ���� 
				// ���� ������ ���� 5���� ������. 
				System.out.print("\n");
			}
		}
		System.out.println();
		System.out.println("---------------");
		int cnt2=0;
		while(cnt<27) {
			cnt++; // ������� ī��Ʈ�� � �߳� 
			System.out.print(cnt +" ");
			if(cnt % 5 == 0) { // ����� ������ 
				System.out.print("\n");
			}
		}
		// ������ ������ ��Ȳ , ������ �������� �ʴ� ��Ȳ (����), �׻� ������ �ʿ��� ���� ������ �ݺ��� ������Ѿ� �Ѵ�.
		// ���̰� �þ��� �پ����ϴ� �������̿� ���� �������־���Ѵ�.
		int number;
		int count=0;
		while(true) {
			// �ݺ��� ����� �Ѵ�.
			number = (int)(Math.random()*1000);// 0 ~ 100  
			if(number < 10) { // 10 ���� ������ 
				break; // ������ ���̸� block�� ����������.
			}
			System.out.print(number + " ");
			++count; // ��ü ī��Ʈ�� ��߳� 
			if(count == 5) { // �����
				System.out.println();
				count = 0; 
			}
		}	
	}	
	public static void main01(String[] args) {
		// 20���� ���� �������� ����ϼ���
		// �� �� �ּ�, �ִ� �� ã�� ����ϼ���.
		// ������ ������ �ʿ��ϰ� ���� �Լ� ����� ������� �����غ���. 	
		int max = 0;
		int min = 0;
		Random random = new Random();
		for(int i=0; i < 19; i++) {
			int ran = random.nextInt();
			if(i==0) { // ù��° ������ ������ �Ѵ� 
				min = max = ran; // ó�����°����� min , max�� �ʱ�ȭ�ϰ� ���� ran���� ���ؼ� �߷��Ѵ�.
			}
			System.out.println(ran);
			// ����� �� ran
			// ����� ���� ran ���� ��, ū �� �����.
			if(ran < min) {
				min = ran;
			} 
			if(ran > max) {
				max = ran;
			}
		}
		// 20�� ����� �Ϸ��� 
		System.out.println("�ּҰ���  > " + min);
		System.out.println("�ִ밪��  > " + max);
	}
}
