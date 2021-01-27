package com.bitcamp.quiz;

import java.io.IOException;
import java.util.Scanner;
// 2. 키보드 입력을 받아서 입력된 문자들이 영문자,숫자,기호 각 개수를 출력하세요
public class ConsoleAppExam {
	
	public static void main(String[] args) throws IOException {	
//		quiz01();
		quiz02();		
	}
	private static void quiz01() {
		// 출력하기(모양)
		int a = -1; // 기울기 // -1이 90도
		int b = 5; // 평행 이동
		
		// 2차 행렬구조 
		for(int y=0; y<10; ++y) { // 행 , y축
			for(int x=0; x<10; ++x) { // 열 , x 축
				if(y == (a*x) + b) { // 이 직선에 해당되는 점을 찍고 그렇지 않으면 공백 , == 같으면 참이되는 경우가 1번이다. 
					System.out.print("* "); // 옆으로 출력한다.					
				} else {
				System.out.print(" ");
			}
		}
			System.out.println(); // 콘솔화면에서 줄바꿈 행 내린다..
		}
	}
	private static void quiz02() throws IOException { // 키보드의 에러 처리를 해야한다. 
		int key;
		int numOfAlpha = 0; // 알파벳
		int numOfDigit = 0; // 숫자
		int numOfEtc = 0;   // 기호
		
		while ((key= System.in.read()) != '\n') { //키보드로 부터 입력받음 정수를 반환(문자의 번호) 
			// 키보드의 입력을 반복을 받는데  엔터를 누르면 무한반복을 끝낸다.
			if(('a'<=key && key<='z') || ('A'<=key && key <= 'Z')) {  // 공통적으로 || , 명확히 구분 &&
				numOfAlpha++;				
			} else if(('0' <= key && key <= '9')) {
				numOfDigit++; // 명확히 구분이 다르면 or 연산 , 구분이 명확한 범위면  &&범위
			} else {
				numOfEtc++;	
			}			
		}
		System.out.println("영문자 : " +numOfAlpha);
		System.out.println("숫자 : " +numOfDigit);
		System.out.println("기타: " +numOfEtc);
	}
}
