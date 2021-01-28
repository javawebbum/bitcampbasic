package com.bitcamp.arrays;

// 나중에 숙제로 배열 길이 1200 이상 생성 
// 길이가 25인 배열로 (sub) 옮겨서   ) 리스트는 한페이지당 최대 25개  몇번부터 몇번까지 만들수있는지  ,  i * 25 + 시작
															        	//각페이지 마다  시작 ~ 끝
// 목록 보기를 할 수 있는 프로그램 만들기 

public class ExArray01 {
// 수정- 수정할놈이 있어야 거기에 덮어쓰고, 추가는 길이를 늘려서 추가시킨다.
	
	static int[] score = new int[5]; // 주로 배열을 전역필드로 뺴두게 된다. static으로 두면 new를 하지않아도 된다. 생성이 이미 되어있다.
	
	static int last = 0; // last 는 저장할 요소 번호 , 현재 저장된 개수  last가 1이면 1번쨰에 저장할것인데 아직 저장은안하고 그전에 1개가 저장됨
	
	public static void main(String[] args) {	 // static 은 static인것만 사용이 가능하다.
//		Random random = new Random(); // static이 아닌것은 new해서 사용
//		Math.random(); // static 바로 쓸수있다. 
		
		// 정의를 잘해야한다. 1. 배열은 정적길이 <- 삭제  0 ~ 4번까지 변수안에 값이 얼마 일때 삭제 , 
		// 그안에 값이 있냐 없냐 그값 이 얼마일때 빈걸로 보겠다는 정의를 해야한다. 이걸 하기 싫으면 배열을 삭제할때마다 새로 만들어야한다. 
		// 방법2개 값을 비교해서 삭제하던지 , 새로운 배열을 만들어서 옮겨 담을지   즉 , 삽입 삭제가 많을때 배열은 고정길이이기 떄문에 까다롭다. 	
		
		// 1. 배열 정수배열 - 함수 안에서 생성 - 지역 배열
		// 2. 다른 함수는 지역배열 직접 접근 불가 - 전달,반환 이 필요하다.
//		int[] score = new int[5]; // 길이가 5인 1차 배열
		// R : list 목록 보기
		
		list(score); // 전달받을 배열의 요소를 출력 , 전역변수필드로 score를 쓰기위해서 전역필드에 static으로 선언 
		
		boolean state = add(score,30); // 목록에 넣기  (배열을전달하고,저장하려는값)
		//boolean 데이터를 추가했나 못했나(꽉찬상태일수도있어서)
		add(score,20);
		list(score); // 실제 저장된 값을 보여준다.
		// 수정 하려면 ? 선택 할 수 있어야 한다. 변경할 값이 뭐냐  
		update(1,100); // 요소번호, 값 
		// 배열 자체는 쉽다.. 기능의 목적 명확히 하자 
		list(score);
		
		add(score,10);
		add(score,20);
		add(score,30);
		add(score,40);
		add(score,50);
		
		delete(2); // 삭제할 요소의 번호를 전달 
		list(score);
		add(score,100);
		list(score);
	}
	private static void delete(int del) {
		// 삭제할 요소를 전달받아서 delete 한다.
		// TODO D : 배열 삭제 처리 시 요소가 없어지지 않는다.
		// 추가하는 방법 : 0번부터 순차적으로 추가하고 있다.
		// --last : 줄어든다. 
		// 삭제할 요소를 인접요소로 당겨 채운다. 
		for(int i = del; i < score.length-1; ++i) {	// 삭제할 요소 번호로 부터 시작 해서  , score.length-1; 마지막요소 5-1 = 4를 만들려고 오버되지않기 위해
			score[i] = score[i+1]; // 번호가 큰쪽에서 작은쪽으로 땡긴다. 마지막칸이 하나 빈 상황을 만든다. 
		}
		--last; //중복되어있는 상태를  last  -1 해서 덮어써서 일관성있게함
	}
	private static void update(int i, int j) {
		if(i < last) { // 저장할 범위 생각하기 , last보다 작으면 이미 저장된값이 있다는것을 알수있으니까 그 이후 번호는 저장을 안한것 	
			score[i] = j; // 값을 내가 어디위치에 대입한다. 기존값을 변경 - 길이에는 변화가 없다. 
		} else {
			System.out.println("등록된 정보가 없습니다.");
		}
	}
	private static boolean add(int[] score, int i) {
		// TODO C : 새로 추가하기 
		// 1. 순차적으로 저장하고 있는 경우 마지막에 저장한 번호 ? 
//		int index = 0; // 인덱스번호는 반드시 int형 , index를 지역변수에 선언하면 계속 선언되서 맨날 0으로 됨 그래서 잘못됨 그래서 2. 필드로 빼면 된다.(전역변수) 
		if(last < score.length) { // index가 length보다 적어야 저장을 할수 있다. 
			// ++Last 처음에 몇번쨰에 넣을건지 수식을 넣으면 된다.  뒤에서 부터 하려면 Last=5로 주고 --Last 근데 Last<scroe.length 계속 참이니까 Last >= 0 
			score[ last ] = i; // 배열의 몇번 요소에 저장할것인가 , 새로운 값을 추가한다. 개수가 늘어야한다.
			++last; // 인덱스를 순차적으로 저장하기 위해 ++ 한다.  순차적으로 저장하기 위해서 ++를 해줘야한다. 0번에 넣었으니 다음에 1번에 넣어 , 2칸씩띄우려면 +2 , 
					// 무조건 겹치지않게 저장해야한다. 
			return true;
		}
		return false;
	}
	private static void list(int[] score) { // 매개변수는 배열을 받는다. 	
		// TODO R : 목록 보기
		String output = "";// 지역성떄문에 바깥에 선언 , ""비어있는 문자열
		// 출력할 문자열을 만든다...
		for(int i=0; i<score.length; ++i) { // score.length 전달받은 인수를 모두 출력 , ++i 1씩 증가 모든 요소 증가 
			//행을 직접 내리게 "\n"
			// output += "["+i+"]"+score[i]+"\n";
			output += String.format("[%d] %d\n", i , score[i]); // format 은 문자열을 다양한 형식을 합쳐서 수월하게 표현한다.
		}
		if(last == 0) { // 저장된게 0개면 출력될게 없다.
			System.out.println("등록된 정보 없습니다. ");
		} else {
		// 출력은 한번에 끝낸다...
		System.out.println(output); 
		}
	}
	public static void main02(String[] args) {
		int [] score = new int[5];
		// 모든 요소에 임의 값으로 초기화를 한다...
		for(int i = 0; i < score.length; i++) { // 0 ~ 4 
//			score[/*요소번호*/ i-1] = 10+i;
			score[i] = score[i+1];
			System.out.println(score[i]);
		}
//		score[5] = 20;
	}
	public static void main01(String[] args) {
		// 요소의 자료형[] 이름(배열명) <-- 변수 배열형(참조형) <-- 참조변수
		int[] score = new int[ 5 ];
		// 실제로 사용하려면 반드시 변수에 값이 있어야 하다...
//		score = new int[];
		
		System.out.println("배열명 : "+score);// 식별값, 참조값
		System.out.println("배열길이 : "+score.length);
		String name = "jangs";
		name.length();// 가변(동적)길이 매번 계산한다..
	}
}
