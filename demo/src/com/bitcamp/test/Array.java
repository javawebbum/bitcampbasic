package com.bitcamp.test;

public class Array {
// �迭 ����Ʈ ���� , �߰� , ������Ʈ 
	
	static int[] list = new int[5];
	
	
	public static void main(String[] args) {
		
		list(); // ����Ʈ ����
		add(score,20);  // �߰� �ϱ�
		
	}

	private static void list() {
		for(int i=0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
}