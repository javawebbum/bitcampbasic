package com.bitcamp.quiz;

import java.io.IOException;
import java.util.Scanner;
// 2. Ű���� �Է��� �޾Ƽ� �Էµ� ���ڵ��� ������,����,��ȣ �� ������ ����ϼ���
public class ConsoleApp01 {
	
	public static void main(String[] args) throws IOException {	
	
		quiz02();
			
	}
	private static void quiz02() throws IOException { // Ű������ ���� ó���� �ؾ��Ѵ�. 
		// TODO : Ű���� �Է��� �ݺ� 
		int alpha=0;
		int number=0;
		int symbol=0;
		int count=0;
		int key;
		while ((key= System.in.read()) != '\n') { //Ű����� ���� �Է¹��� ������ ��ȯ(������ ��ȣ) 
												  // Ű������ �Է��� �ݺ��� �޴µ�  ���͸� ������ ���ѹݺ��� ������.
			System.out.println(key);
			if(key >= 65 && key <= 84 || key >= 97 && key <= 116 ) {
				// ������
				count++;
				alpha = count;
				
			} else if(key >= 80 && key <= 89 ) {
				// ����
				count++;
				number = count;
			} else  {
				// ��ȣ
				count++;
				symbol = count;
			}
		}
		System.out.println("������ ������ : " + alpha);
		System.out.println("��ȣ�� ������ : " + number);
		System.out.println("������ ������ : " + symbol);
		}
	}

