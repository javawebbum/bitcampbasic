package com.bitcamp;

import java.util.Random; // ��Ű���� �ٸ� Ŭ������ import �Ѵ�. 

public class ExOperator02 {
	
	public static void main(String[] args) {
		// ��ü �Խñۿ� ���� : 1200��
		// �� ������ �ִ� 25���� �Խñ��� ����Ѵ�.
		// 1������ �ִ� �� ������ ������ ��ȣ ���Ͻÿ�
		// 48��   �ٵ� 1213�� ���°� ������ +1�� �ϱ� 
		
		int totalContent = 1213;
		int contentsPerPage = 25;
		int pages = totalContent/contentsPerPage;
		int mod = totalContent%contentsPerPage;  // ������ �ִٸ� 
		if( mod > 0 ) { // ���°� �ִٸ� (����¡ó��) ����� Ȱ���ؼ� ���ϴ� ����� �ǵ��� ����
		pages++;
		// �Ʊ� ��հ���Ҷ� / ������
		}
		System.out.println(pages); // 48
	}
	public static void main03(String[] args) {
		// ���� ������ ���� ����ϱ�
		// min �� max ������ ���� 3���� ������ �ϱ�
		Random random = new Random();
		int min = random.nextInt(10); //0~9;
		int max = random.nextInt(100)+min; // % 100 + min;   �ּҰ� ���� �ִ밪
		
		// min 1  max 5   max-min+1 = ���� 5�� 
		// min �������� ����(max-min+1)��ŭ�� ���� ���� 
		System.out.println(min + " " + max);
//		int a=random.nextInt()%(max-min+1)+min; // min�������� max����  // (max-min+1)�� �ִ���� 
		int a=random.nextInt(max-min+1)+min; // min ~ max
		int b=random.nextInt()%(max-min+1)+min;
		int c=random.nextInt()%(max-min+1)+min;
		System.out.println("a " + a + "b " + b + "c " + c);
	}
	public static void main02(String[] args) {
//		// ���� �� ó��
		double ran = Math.random(); // double ��ȯ�� ������ �ٲ���Ѵ�. ���� 0.xxx ~ 1.xxx ���̰� ���ͼ� �ڸ��ø���������Ѵ�. 
		int number = (int)(ran*1000); // ran�� ���� ���� �ڸ��ø��� ���ְ� int�� ©������Ѵ�. ( ������ �߿伺  )
		System.out.println(number);
//		double lf = 10.789;
//		System.out.println(lf); // 10.789
//		// �ڵ� ����ȯ
//		int n = (int)lf; // �Ǽ�-����:
//		System.out.println(n); // 10 �Ҽ����Ϻκ��� ��������.
//		System.out.println((double)n); // 10.0 	
	}
	public static void main01(String[] args) {
		// ���� ���� 3���� ���� , ����� ���ϼ���
		Random random = new Random(); // Random�� �������� �����ִ�. �������� = random�� ����.  
		
		int a = random.nextInt() % 1001; // 1001���� , 1000����   ������������ ��ȯ�Ѵ�. 
		int b = random.nextInt() % 1001; 
		int c = random.nextInt() % 1001; // ó���Ǵ� ���� ���� �����ϰ� ������ ��찡 ����
		int sum = a + b + c; // ���� ������ �� �� �ȵɶ�  ���ʰ��� �ݺ����� ó���Ѵ�. 
		System.out.println("���� : " + sum); // ���ڿ� + ���� -> ���ڿ�
		int avg = sum / 3;
		System.out.println("��� : " + avg);
		// out �ȿ� �ִ� println �Լ��� ȣ���Ѵ�. 	
//		sum = 0;
//		// �����Ҷ� 
//		sum = sum + a;
//		sum = sum + b;
//		sum = sum + c; ctrl + / ��ü�ּ�
				
	}
}
