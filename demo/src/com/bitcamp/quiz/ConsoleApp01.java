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
		int key;
		while ((key= System.in.read()) != '\n') { //Ű����� ���� �Է¹��� ������ ��ȯ(������ ��ȣ) 
												  // Ű������ �Է��� �ݺ��� �޴µ�  ���͸� ������ ���ѹݺ��� ������.
			if(('a' <= key && key >= 'z') || ('A' <= key && key >= 'Z')) {
				// ������
				alpha++;
			} else if(('0' <= key && key <= '9')) {
				// ����
				number++;
			} else {
				// ��ȣ
				symbol++;		
			}
		}
		System.out.println("������ ������ : " + alpha);
		System.out.println("������ ������ : " + number);
		System.out.println("��ȣ�� ������ : " + symbol);
		}
	}

