package com.bitcamp.quiz;

import java.io.IOException;
import java.util.Scanner;
// 2. Ű���� �Է��� �޾Ƽ� �Էµ� ���ڵ��� ������,����,��ȣ �� ������ ����ϼ���
public class ConsoleAppExam {
	
	public static void main(String[] args) throws IOException {	
//		quiz01();
		quiz02();		
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
