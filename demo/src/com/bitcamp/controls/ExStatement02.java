package com.bitcamp.controls;

public class ExStatement02 {
	
	public static void main(String[] args) {
		// do while
		// Ű����κ��� �Է¹��� ���� �����̸�.....
//		int key = 0;
//		do {
//			key = System.in.read();	 // do �Է��ѹ� �ް� 
//			// ���� �� �˻� 
//		}
//		while(key == '����'); // �׿� ���� ��������� ���ڸ� �� �����Ҽ��ְ� �ȴ�. 
	}
	public static void main_while(String[] args) {
		// while
		int i = 0;
		while(i<10) { // while(���ǽ�) ���ǽ��� ���϶� ����
			System.out.println(i);
			i++;
	}
}
	
	public static void main_for(String[] args) {
		// for : ���� , Ƚ�� �ݺ�
//		for(�ʱ�� ; ���ǽ�  ; ������  ) {
		for(int i=0; i<=10; ++i) {
			System.out.println(i); // ���ǽ� ���� ���̸� �����ϰ� ���������� ���� ���ǽ����� ����. 
		}
	}
}