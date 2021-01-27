package com.bitcamp.quiz;

import java.io.IOException;
import java.util.Random;
// 2. 키보드 입력을 받아서 입력된 문자들이 영문자,숫자,기호 각 개수를 출력하세요
public class ConsoleAppExam {
	public static void main(String[] args) throws IOException {	
//		quiz01();
//		quiz02();	
		//3. 숫자 3개를 붙여서 문자열 표현하기 -> 정수로 출력하기 
//		quiz03();	
		//4. 숫자 3개를 붙여서 정수로 출력, 같은 숫자는 없어야 한다. 중복이 없어야 한다.. , 3자리 정수여야 한다.
//		quiz04();
		//5. (4)활용해서 3자리 정수 2개를 생성, 비교한 결과를 출력 
		// 위치와 값 
		// 값이 같다. 
		// 	위치도 같으면 strike++
		//  위치가 다르면 ball++
		quiz05();
		quiz06();
	}
	private static void quiz06() {
		int first = quiz04();
		int second = quiz04();
		// 1. 3자리 정수 , 2개
		System.out.println(first + " , " + second);
		int strike = 0;
		int ball = 0;
		String fs = String.valueOf(first); // 위치의 개념을 갖는다. 
		String ss = String.valueOf(second);
		
		// 문자열로 다루면 훨씬 쉽다.
		for(int t=0; t<3; t++) {
			for(int b=0; b<3; b++) {
				if(fs.charAt(t) == ss.charAt(b)) // 위치가 같다 
					if( t == b) { // 번호가같으면 위치가 같음 그럼  값이 같으니까
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
		// 1. 3자리 정수 , 2개
		System.out.println(first + " , " + second);
		int strike = 0;
		int ball = 0;
		// 2. 판단 조건 : 위치(자리) , 값 비교
		// 정수를 3개로 분리한다.
		// 나누기는 위에꺼 버리고 나머지는 아래꺼 버린다.
		for(int t = 0; t < 3; t = t++) { // t 나누기 10은 한잘리씩 나누게 된다. 0 이하는 나눌게없어서 끝난다.
			int tv = first % 10;  // tv는 1의자리값만 
			first /= 10; // 나누기 10을 해서 24로 줄인다.
				int temp = second; // ★ 여러번 비교해야돼서 백업시킨다..
//			System.out.println(t % 10); // 1의 자리값을 남기고 나머지는
				for(int b = 0; b < 3; b = b++) {
					int bv = temp % 10;
					temp/=10;
						if(tv == bv) {
					// 근데  나눈값이 몇번째 위치인지는 모른다 . 그래서 조건을 줘야한다.  위치야 값이 동시에 조건이 같으면 
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
//		int number = Integer.parseInt(s); //NumberFormat 문자열을 숫자로 바꾸는데 숫자가 없을때  
		{
		
		Random random = new Random();
		char letter;
		
		for(int i=0; i < 3; i++) { // i>3는 원하는자리수를 개념 0 1 2 세자리 
			do { // 무조건 확인을해서 
			letter = (char)(random.nextInt(9) + '1');// 숫자-정수 , 음의이 숫자를 뽑아서 String으로 합쳐서 정수로 뽑아내기
										// 1은 맨앞에 0을 아에 쓰지않고 만들겠다고 해서 1를 썼다
										// 9는 R%9 -> 0~8
//			} while(str.contains(letter+"")); // 조건을 적음  일단 위에 지금 뽑은 letter 가 str 에 포함되어 있냐? 있으면 다시뽑고 없으면 ㄱㅊ
//			// 부분 문자열을 검색 , char + "문자열" => 문자열타입을 맞게 해준다.
			} while(str.indexOf(letter) >= 0); // letter가 String에  포함되어있으면  그문자가 없으면 -1를 반환한다. 
			// >= 0이상이면 중복되니 다시실행해라  , -1은 그문자가 없으니까 
			// 몇번째에 찾는거냐(indexOf)랑 들어있는거(contains)랑 다른의미이다. 
			str = str + letter; // 숫자들을 하나씩 붙인다.. 			
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
		// 합친다 -> 덧셈
		// 저희는 String으로 만듬   1. char - 정수 , 2. + 산술
		// 객체지향언어 -> 문자열의 처리 시 연산자 동작
		// + 문자열을 합친다... *
		// 문자열에 + + + 하면 물자열을 붙여서 길게 만들겠다는 동작이다. 
		String s = ""+ a + b + c; 
		System.out.println(s); // s는 참조형 변수이다. 점찍어서 사용할수있다. 
		// 숫자열 -> 정수로 바꾸기
		int n1 = Integer.parseInt(s); // paresInt 어느문자열을 int형으로 반환한다.
//		int n2 = Double.parseDouble(s);
		System.out.println(n1);
		// 참조변수로 원하는 함수를 찾는다는 것을 라이브러리 사용 이라고 한다. 
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
