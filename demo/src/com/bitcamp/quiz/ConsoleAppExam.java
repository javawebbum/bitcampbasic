package com.bitcamp.quiz;

import java.io.IOException;
import java.util.Random;
// 2. Ű���� �Է��� �޾Ƽ� �Էµ� ���ڵ��� ������,����,��ȣ �� ������ ����ϼ���
public class ConsoleAppExam {
	public static void main(String[] args) throws IOException {	
//		quiz01();
//		quiz02();	
		//3. ���� 3���� �ٿ��� ���ڿ� ǥ���ϱ� -> ������ ����ϱ� 
//		quiz03();	
		//4. ���� 3���� �ٿ��� ������ ���, ���� ���ڴ� ����� �Ѵ�. �ߺ��� ����� �Ѵ�.. , 3�ڸ� �������� �Ѵ�.
//		quiz04();
		//5. (4)Ȱ���ؼ� 3�ڸ� ���� 2���� ����, ���� ����� ��� 
		// ��ġ�� �� 
		// ���� ����. 
		// 	��ġ�� ������ strike++
		//  ��ġ�� �ٸ��� ball++
		quiz05();
		quiz06();
	}
	private static void quiz06() {
		int first = quiz04();
		int second = quiz04();
		// 1. 3�ڸ� ���� , 2��
		System.out.println(first + " , " + second);
		int strike = 0;
		int ball = 0;
		String fs = String.valueOf(first); // ��ġ�� ������ ���´�. 
		String ss = String.valueOf(second);
		
		// ���ڿ��� �ٷ�� �ξ� ����.
		for(int t=0; t<3; t++) {
			for(int b=0; b<3; b++) {
				if(fs.charAt(t) == ss.charAt(b)) // ��ġ�� ���� 
					if( t == b) { // ��ȣ�������� ��ġ�� ���� �׷�  ���� �����ϱ�
						strike++;
					} else {
						ball++;
				}
			}
		}
	}
	
	private static void quiz05() {
		int first = quiz04();
		int second = quiz04();
		// 1. 3�ڸ� ���� , 2��
		System.out.println(first + " , " + second);
		int strike = 0;
		int ball = 0;
		// 2. �Ǵ� ���� : ��ġ(�ڸ�) , �� ��
		// ������ 3���� �и��Ѵ�.
		// ������� ������ ������ �������� �Ʒ��� ������.
		for(int t = 0; t < 3; t = t++) { // t ������ 10�� ���߸��� ������ �ȴ�. 0 ���ϴ� �����Ծ�� ������.
			int tv = first % 10;  // tv�� 1���ڸ����� 
			first /= 10; // ������ 10�� �ؼ� 24�� ���δ�.
				int temp = second; // �� ������ ���ؾߵż� �����Ų��..
//			System.out.println(t % 10); // 1�� �ڸ����� ����� ��������
				for(int b = 0; b < 3; b = b++) {
					int bv = temp % 10;
					temp/=10;
						if(tv == bv) {
					// �ٵ�  �������� ���° ��ġ������ �𸥴� . �׷��� ������ ����Ѵ�.  ��ġ�� ���� ���ÿ� ������ ������ 
					if(t == b) {  
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		System.out.println("strike " + strike);
		System.out.println("ball " + ball);
	}



//	private static void quiz05() {
//		String str1 = "";
//		String str2 = "";
//		int ball = 0;
//		int strike = 0;
//		Random random = new Random();
//		char letter1 , letter2;
//		
//		for(int i=0; i<3; i++) {
//			do {
//			    letter1 = (char)(random.nextInt(9)+'1');	
//			    letter2 = (char)(random.nextInt(9)+'1');	    
//			    for(int i2=0; i2<3; i2++) {
//			    	for(int j=0; j<3; j++) {  		
//			    		if(str1.indexOf(i2) == str2.indexOf(j)) {
//			    			strike++;
//			    	} else if(str1.indexOf(i2) != str2.indexOf(j)) {
//			    			ball++;
//			    		}
//			    	}
//			    }	
//			} while((str1.indexOf(letter1) >= 0) || (str2.indexOf(letter2) >= 0)); 
//			str1 += letter1;
//			str2 += letter2;
//		}
//		int number1 = Integer.parseInt(str1);
//		int number2 = Integer.parseInt(str2);
//			
//		System.out.println(number1);
//		System.out.println(number2);
//		System.out.println("-----");
//		System.out.println("ball : "+ball);
//		System.out.println("strike :" +strike);
//	}
	
	private static int quiz04() {
		String str = "";
//		int number = Integer.parseInt(s); //NumberFormat ���ڿ��� ���ڷ� �ٲٴµ� ���ڰ� ������  
		{
		
		Random random = new Random();
		char letter;
		
		for(int i=0; i < 3; i++) { // i>3�� ���ϴ��ڸ����� ���� 0 1 2 ���ڸ� 
			do { // ������ Ȯ�����ؼ� 
			letter = (char)(random.nextInt(9) + '1');// ����-���� , ������ ���ڸ� �̾Ƽ� String���� ���ļ� ������ �̾Ƴ���
										// 1�� �Ǿտ� 0�� �ƿ� �����ʰ� ����ڴٰ� �ؼ� 1�� ���
										// 9�� R%9 -> 0~8
//			} while(str.contains(letter+"")); // ������ ����  �ϴ� ���� ���� ���� letter �� str �� ���ԵǾ� �ֳ�? ������ �ٽṵ̂� ������ ����
//			// �κ� ���ڿ��� �˻� , char + "���ڿ�" => ���ڿ�Ÿ���� �°� ���ش�.
			} while(str.indexOf(letter) >= 0); // letter�� String��  ���ԵǾ�������  �׹��ڰ� ������ -1�� ��ȯ�Ѵ�. 
			// >= 0�̻��̸� �ߺ��Ǵ� �ٽý����ض�  , -1�� �׹��ڰ� �����ϱ� 
			// ���°�� ã�°ų�(indexOf)�� ����ִ°�(contains)�� �ٸ��ǹ��̴�. 
			str = str + letter; // ���ڵ��� �ϳ��� ���δ�.. 			
		}
		int number = Integer.parseInt(str);
		System.out.println(number);
		return number;
		}
	}
	private static void quiz03() {
		char a = '3';
		char b = '5';
		char c = '6';
		// ��ģ�� -> ����
		// ����� String���� ����   1. char - ���� , 2. + ���
		// ��ü������ -> ���ڿ��� ó�� �� ������ ����
		// + ���ڿ��� ��ģ��... *
		// ���ڿ��� + + + �ϸ� ���ڿ��� �ٿ��� ��� ����ڴٴ� �����̴�. 
		String s = ""+ a + b + c; 
		System.out.println(s); // s�� ������ �����̴�. ���� ����Ҽ��ִ�. 
		// ���ڿ� -> ������ �ٲٱ�
		int n1 = Integer.parseInt(s); // paresInt ������ڿ��� int������ ��ȯ�Ѵ�.
//		int n2 = Double.parseDouble(s);
		System.out.println(n1);
		// ���������� ���ϴ� �Լ��� ã�´ٴ� ���� ���̺귯�� ��� �̶�� �Ѵ�. 
	}
	private static void quiz01() {
		// ����ϱ�(���)
		int a = -1; // ���� // -1�� 90��
		int b = 5; // ���� �̵�	
		// 2�� ��ı��� 
		for(int y=0; y<10; ++y) { // �� , y��
			for(int x=0; x<10; ++x) { // �� , x ��
				if(y == (a*x) + b) { // �� ������ �ش�Ǵ� ���� ��� �׷��� ������ ���� , == ������ ���̵Ǵ� ��찡 1���̴�. 
					System.out.print("* "); // ������ ����Ѵ�.					
				} else {
				System.out.print(" ");
			}
		}
			System.out.println(); // �ܼ�ȭ�鿡�� �ٹٲ� �� ������..
		}
	}
	private static void quiz02() throws IOException { // Ű������ ���� ó���� �ؾ��Ѵ�. 
		int key;
		int numOfAlpha = 0; // ���ĺ�
		int numOfDigit = 0; // ����
		int numOfEtc = 0;   // ��ȣ
		
		while ((key= System.in.read()) != '\n') { //Ű����� ���� �Է¹��� ������ ��ȯ(������ ��ȣ) 
			// Ű������ �Է��� �ݺ��� �޴µ�  ���͸� ������ ���ѹݺ��� ������.
			if(('a'<=key && key<='z') || ('A'<=key && key <= 'Z')) {  // ���������� || , ��Ȯ�� ���� &&
				numOfAlpha++;				
			} else if(('0' <= key && key <= '9')) {
				numOfDigit++; // ��Ȯ�� ������ �ٸ��� or ���� , ������ ��Ȯ�� ������  &&����
			} else {
				numOfEtc++;	
			}			
		}
		System.out.println("������ : " +numOfAlpha);
		System.out.println("���� : " +numOfDigit);
		System.out.println("��Ÿ: " +numOfEtc);
	}
}
