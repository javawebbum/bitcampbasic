package com.bitcamp.mini;
// ������Ʈ�� ������ ��� ��� ��Ʈ�� �ߴµ� ���ϱ�
// �鿣�������� ��ص��� � ���μ����� ����ߴµ� �����ؾ��Ѵ�.

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ParkConsole {  // ���ڸ��� �˻��ϴ°� ���������� �����ְ� , ���� ���� �ϰ� ������ indexOfnull �� �ǵ� �װ��� ��ȯ�ؼ� ã�°��� �ٲ������ �����ؼ� ����������
							// ������ ���� ��������ʰ� �����ؼ� ����������
	/**
	 * 
	 * �������� ǥ���غ���
	 * - ��� ���
	 * - �ð� ���� : ������ �ð� - ���� �ð�
	 * - �⺻ ��� + �ð� ��� �߰� ��� 
	 * 
	 * data
	 * - �ð�, �ݾ�, �ڵ���,
	 * - long , double , String + ���� , ���� ��(�ڷᱸ�� : �÷���)
	 * 
	 * ���   
	 * - ���� �����ΰ�
	 * - ���� , ���� , ����    
	 * - �Լ��� �����Ѵ�... ���� ������ ���� ������ ����... �ѵ� ��Ƽ� > Ŭ���� ����    
	 */
	static Scanner kb; // ��� �Լ����� �����ֵ��� �ʵ忡 ���� ���ش� kb�� ������ �Լ����� �����ִ�.
	static String[] space; // space :�������� , String[] : ������ ������ ��ȣ�� �����Ѵ�. ����ȣ�������� �����ְ� , ����ȣ�������� �������� = null
	static long[] timetable; // ������ ������ ���� �ð� �� , 0�̸� ���ڸ� 
	
	public static void main(String[] args) {
		// �ʱ�ȭ ���� : ���� , �迭 , �ʱⰪ 
		// ������ ���� : ���� �� ����ڿ� ���� ����  ? �� ���� �� �����ϰ� ���� 
		int menu = 0;
		kb = new Scanner(System.in); // �ԷµǴ°� ���α׷��� �׳ɹ����� ȥ�� , �ƽ�Ű�ڵ�� ȥ�� �׷��� �Է���ġ�κ��� �߰��� ���� ���ϴ� �ڷ������� ��ȯ(Scanner)
									 // Ű���尡 System.in ���κ��� ���´�.
		space = new String[10]; // �ִ� ���� ��� 
		timetable = new long[10]; // ��ҹ�ȣ�� ���� �� ���� ���´�. 
		while(true) { 
			// �����ϱ������� ����ؼ� �������� ���� = true ���ѹݺ����� 
			showParking(); // �������� ��Ȳ = ��� ����� ���
			System.out.println("[1] in [2] out [0]exit > "); // ����ڰ� ���� ���� �� �ִ� �޴��� �Ӵ� �����ִ� ����		
			menu = kb.nextInt(); // ������� ������ �޾ƾߵǴϱ� Ű������ �Է��� �Ѵ�.
			kb.nextLine(); // nextLine�� ���ڿ� �Է� ,���⼭ �ǹ̴� ����...������� ���ο� �Է��� ������ �ִ�. 
			if( menu == 0 ) { // ����ڰ� ������ �༭ �����. ����� ���� �ϴ� ��� ? ����ڰ� ���ÿ� ���� �׋��׶����� �ٸ��ϱ� ������ �ʿ��ϱ���.  
				break; // stop loop : 0�϶� �ݺ��� �����. 
			}
			if( menu == 1) {
				System.out.println(" �� ���´�.");
				inPark(); // ���� ������ ��Ȳ�� ǥ���ϴ� �Լ�
			}
			if( menu == 2) {
				System.out.println(" �� ������.");
				outPark(); // ���� ������ ��Ȳ�� ǥ���ϴ� �Լ�
			}
		}
		System.out.println("terminated");
		// ���� ó�� : ���� 
	}
	// �Լ��� �и��ؼ� ����� �����Ѵ�.
	private static void outPark() {
		// TODO ���� ������ ����   // TODO �� �����ҰŸ� �����ִ� �뵵�̴�.
		// R , D �� �ʿ� 
		// 1. ������ ���� ���� �ð��� �˾ƾ��Ѵ�.
			System.out.println("������ȣ > ");
			String carno = kb.nextLine();
			int index = indexOf(carno); // �迭�� ��ҹ�ȣ�� �˻��ؼ� ã�´�. 
			
			// �˻��Ҷ� �ִ� ���� ������ �־���Ѵ�.  �ִ� >= 0 , ���� = -1
			if(index >= 0) { //  �˻��Ȱ� ������(����������) ,  -1 ��  ��ã���Ŷ�  �������   
			long inTime = timetable[index];
		// 2. ���� �ð��� �˾ƾ� �Ѵ�.
			long outTime = new Date().getTime(); // DATE Ÿ���� LongŸ������ �ٲ۴�.   1/1000�� ����
		// 3. �ð����� ���ؼ� �߰���� ���
			long extra = ((outTime-inTime)/1000)*100; // �󸶵��� ���� :  ������ �ð� - ���� �ð�     ,  1�ʴ����� 100���� �޴´�.  ,5�ʴ� 10/5 * 100 
 		// 4. �⺻��� ���ؼ� �� ��� �޾ƾ� �Ѵ�.
			long price = 2000 + extra; 
			System.out.println(price + "�� �ּ���.");
		// 5. ���� �������Ƿ� �� �ڸ��� û���ؾ� �ȴ�...		
			clear(index);// ���� ������ �Լ�   -  �迭�� ����ִ� ���·� �����.
		}
	}
	private static void clear(int index) {  // �˻��� ��ģ�Ŀ� ���� 
		// TODO : null , 0
		space[index] = null;
		timetable[index] = 0;		
	}
	private static int indexOf(String carno) { // ����ȣ�� �˻��ؼ� ��ȯ�ϴ� ��� 
		for(int i=0; i<space.length; i++) {
			if(space[i] != null) { // ������ ����� �迭�� ��ȣ�� ������  , ������� ������  �� , �˻��Ȱ� ������ 
				// ���ڿ� �κй��� �񱳴�  contains
				if(space[i].equals(carno)) { // equals�� �ι��ڰ� �Ȱ����� ���Ѵ�.
					return i; // ��� ��ȣ�� ��ȯ�Ѵ�.
				}
			}
		}
		return -1; // -1�� �����ϸ� �˻��Ȱ��� ����. 
	}
	private static void inPark() {
		// TODO ���� ���ö� ����
		// C�� �ʿ� 
		// ����� ��� (���ڸ��� ������ �ִ´�.)
		int index = indexOfNull(); // ����ִ°��� ��Ҹ� ��ȯ�Ѵ�. �˻��Ѵ�...
		if(index < 0) { // ��ҹ�ȣ �ƴ� �� , 0���� ������ ����ִ� ������ ����.  
			System.out.println("����");
		} else {
			System.out.println("������ȣ : ");
			space[index] = kb.nextLine(); // ����ȣ 
			timetable[index] = new Date().getTime(); // ���� ������ �ð� , new Date() ���� �ð��� �����´�. 
 		}
	}
	private static int indexOfNull() { // ��ȯ�� ��ҹ�ȣ
//		Random random = new Random();
//		// �뼺�뼺 ���ٴ� ǥ���� ������ 
//		int ist = random.nextInt(space.length);
//			if(space[ist] == null) {
//			// i���� ����ִ�.
//			return ist; // ��� ��ȣ�� ��ȯ�Ѵ�.
//		}	
		for(int i=0; i<space.length; i++) {
			if(space[i] == null) {
				// i���� ����ִ�.
				return i; // ��� ��ȣ�� ��ȯ�Ѵ�.
			}
		}
		return -1; // null �� �ƴϸ� ���� �����̴�.
	}
	private static void showParking() {
		// TODO: �������� ��Ȳ�� ����Ѵ�. 
		// R 
		String output ="";
		for(int i=0; i<space.length; i++) {
			String exp = (space[i] == null) ? "�����" : space[i] ; // ���ǿ�����(3�׿�����) Ȱ�� , ? true : false ���߿� �ϳ��� �����ؼ� �����Ѵ�.
			output += "["+i+"]"+exp+"\n"; // String 
		}
		System.out.println(output);
	}
}
