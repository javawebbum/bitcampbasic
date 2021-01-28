package com.bitcamp.mini;
// 프로젝트를 했을때 어느 기능 파트를 했는데 말하기
// 백엔드했으면 백앤드의 어떤 프로세스를 담당했는데 묘사해야한다.

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ParkConsole {  // 빈자리를 검색하는건 순차적으로 보고있고 , 섞여 들어가게 하고 싶으면 indexOfnull 를 건들어서 그것을 반환해서 찾는것을 바꿔놓으면 점핑해서 넣을수있음
							// 기존의 차를 덮어씌우지않고 점핑해서 넣을수있음
	/**
	 * 
	 * 주차장을 표현해보기
	 * - 요금 계산
	 * - 시간 기준 : 나가는 시간 - 들어온 시간
	 * - 기본 요금 + 시간 대비 추가 요금 
	 * 
	 * data
	 * - 시간, 금액, 자동차,
	 * - long , double , String + 개수 , 여러 개(자료구조 : 컬렉션)
	 * 
	 * 기능   
	 * - 일이 무엇인가
	 * - 입차 , 출차 , 정산    
	 * - 함수로 구현한다... 여러 개들이 서로 연관성 높다... 한데 모아서 > 클래스 정의    
	 */
	static Scanner kb; // 모든 함수들이 쓸수있도록 필드에 선언만 해준다 kb는 각각의 함수에서 쓸수있다.
	static String[] space; // space :주차공간 , String[] : 주차된 차량의 번호를 저장한다. 차번호가있으면 차가있고 , 차번호가없으면 차가없다 = null
	static long[] timetable; // 주차된 차량이 들어온 시간 값 , 0이면 빈자리 
	
	public static void main(String[] args) {
		// 초기화 동작 : 변수 , 배열 , 초기값 
		// 실행할 내용 : 실행 후 사용자에 의해 종료  ? 한 번만 쭉 실행하고 종료 
		int menu = 0;
		kb = new Scanner(System.in); // 입력되는걸 프로그램이 그냥받으면 혼란 , 아스키코드로 혼란 그래서 입력장치로부터 중간에 내가 원하는 자료형으로 변환(Scanner)
									 // 키보드가 System.in 으로부터 들어온다.
		space = new String[10]; // 최대 주차 대수 
		timetable = new long[10]; // 요소번호가 같은 것 끼리 묶는다. 
		while(true) { 
			// 선택하기전에는 계속해서 실행중인 상태 = true 무한반복상태 
			showParking(); // 주차장의 현황 = 목록 보기와 비슷
			System.out.println("[1] in [2] out [0]exit > "); // 사용자가 보고 누를 수 있는 메뉴가 머다 보여주는 역할		
			menu = kb.nextInt(); // 사용자의 결정을 받아야되니까 키보드의 입력을 한다.
			kb.nextLine(); // nextLine은 문자열 입력 ,여기서 의미는 비운다...비워야지 새로운 입력을 받을수 있다. 
			if( menu == 0 ) { // 사용자가 조건을 줘서 멈춘다. 사용자 선택 하는 방법 ? 사용자가 선택에 따라 그떄그때마다 다르니까 변수가 필요하구나.  
				break; // stop loop : 0일때 반복을 멈춘다. 
			}
			if( menu == 1) {
				System.out.println(" 차 들어온다.");
				inPark(); // 차가 들어오는 상황을 표현하는 함수
			}
			if( menu == 2) {
				System.out.println(" 차 나간다.");
				outPark(); // 차가 나가는 상황을 표현하는 함수
			}
		}
		System.out.println("terminated");
		// 종료 처리 : 정리 
	}
	// 함수로 분리해서 기능을 구현한다.
	private static void outPark() {
		// TODO 차가 나갈때 할일   // TODO 는 내일할거를 적어주는 용도이다.
		// R , D 가 필요 
		// 1. 나가는 차의 들어온 시간을 알아야한다.
			System.out.println("차량번호 > ");
			String carno = kb.nextLine();
			int index = indexOf(carno); // 배열의 요소번호를 검색해서 찾는다. 
			
			// 검색할때 있다 없다 기준이 있어야한다.  있다 >= 0 , 없다 = -1
			if(index >= 0) { //  검색된게 있으면(차가있으면) ,  -1 은  못찾은거라  실행못함   
			long inTime = timetable[index];
		// 2. 지금 시간을 알아야 한다.
			long outTime = new Date().getTime(); // DATE 타입을 Long타입으로 바꾼다.   1/1000초 단위
		// 3. 시간차를 구해서 추가요금 계산
			long extra = ((outTime-inTime)/1000)*100; // 얼마동안 주차 :  나가는 시간 - 들어온 시간     ,  1초단위로 100원을 받는다.  ,5초는 10/5 * 100 
 		// 4. 기본요금 더해서 총 요금 받아야 한다.
			long price = 2000 + extra; 
			System.out.println(price + "원 주세요.");
		// 5. 차가 나갔으므로 빈 자리를 청소해야 된다...		
			clear(index);// 차가 나가는 함수   -  배열의 비어있는 상태로 만든다.
		}
	}
	private static void clear(int index) {  // 검색을 거친후에 삭제 
		// TODO : null , 0
		space[index] = null;
		timetable[index] = 0;		
	}
	private static int indexOf(String carno) { // 차번호를 검색해서 반환하는 기능 
		for(int i=0; i<space.length; i++) {
			if(space[i] != null) { // 전달한 문장과 배열의 번호가 같은지  , 비어있지 않으면  즉 , 검색된게 있으면 
				// 문자열 부분문자 비교는  contains
				if(space[i].equals(carno)) { // equals는 두문자가 똑같은지 비교한다.
					return i; // 요소 번호를 반환한다.
				}
			}
		}
		return -1; // -1를 리턴하면 검색된것이 없다. 
	}
	private static void inPark() {
		// TODO 차가 들어올때 할일
		// C가 필요 
		// 비순차 방식 (빈자리가 있으면 넣는다.)
		int index = indexOfNull(); // 비어있는값의 요소를 반환한다. 검색한다...
		if(index < 0) { // 요소번호 아닌 것 , 0보다 작으면 비어있는 것으로 본다.  
			System.out.println("만차");
		} else {
			System.out.println("차량번호 : ");
			space[index] = kb.nextLine(); // 차번호 
			timetable[index] = new Date().getTime(); // 차가 들어오는 시간 , new Date() 현재 시간을 가져온다. 
 		}
	}
	private static int indexOfNull() { // 반환은 요소번호
//		Random random = new Random();
//		// 듬성듬성 들어갔다는 표현을 쓰려면 
//		int ist = random.nextInt(space.length);
//			if(space[ist] == null) {
//			// i번이 비어있다.
//			return ist; // 요소 번호를 반환한다.
//		}	
		for(int i=0; i<space.length; i++) {
			if(space[i] == null) {
				// i번이 비어있다.
				return i; // 요소 번호를 반환한다.
			}
		}
		return -1; // null 이 아니면 꽉찬 상태이다.
	}
	private static void showParking() {
		// TODO: 주차장의 상황을 출력한다. 
		// R 
		String output ="";
		for(int i=0; i<space.length; i++) {
			String exp = (space[i] == null) ? "비었다" : space[i] ; // 조건연산자(3항연산자) 활용 , ? true : false 둘중에 하나를 선택해서 대입한다.
			output += "["+i+"]"+exp+"\n"; // String 
		}
		System.out.println(output);
	}
}
