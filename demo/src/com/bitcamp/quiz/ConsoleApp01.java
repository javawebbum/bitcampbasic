package com.bitcamp.quiz;

import java.io.IOException;
import java.util.Scanner;
// 2. 키보드 입력을 받아서 입력된 문자들이 영문자,숫자,기호 각 개수를 출력하세요
public class ConsoleApp01 {
	
	public static void main(String[] args) throws IOException {	
		quiz02();
	}
	private static void quiz02() throws IOException { // 키보드의 에러 처리를 해야한다. 
		// TODO : 키보드 입력의 반복 
		int alpha=0;
		int number=0;
		int symbol=0;
		int key;
		while ((key= System.in.read()) != '\n') { //키보드로 부터 입력받음 정수를 반환(문자의 번호) 
												  // 키보드의 입력을 반복을 받는데  엔터를 누르면 무한반복을 끝낸다.
			if(('a' <= key && key >= 'z') || ('A' <= key && key >= 'Z')) {
				// 영문자
				alpha++;
			} else if(('0' <= key && key <= '9')) {
				// 숫자
				number++;
			} else {
				// 기호
				symbol++;		
			}
		}
		System.out.println("영문자 개수는 : " + alpha);
		System.out.println("숫자의 개수는 : " + number);
		System.out.println("기호의 개수는 : " + symbol);
		}
	}

