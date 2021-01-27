package com.bitcamp.test;

import java.util.Scanner;

// 피라미드 모양 만들기 

public class 피라미드 {
	
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
