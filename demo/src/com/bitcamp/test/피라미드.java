package com.bitcamp.test;

import java.util.Scanner;

// �Ƕ�̵� ��� ����� 

public class �Ƕ�̵� {
	
	public static void main(String[] args) {

		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=0; i<10; i++) {
			for(int j=10; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
			
		for(int i=0; i<10; i++) {
			for(int j=10; j<i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.println("*");
			}
			System.out.println("");
		}
	}
}
