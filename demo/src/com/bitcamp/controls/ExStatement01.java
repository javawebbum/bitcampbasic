package com.bitcamp.controls;


/**
 * 
 * ���
 * ���ù�( ~ �̸�, �� �� )
 * - ���� ���� ��,����
 * - ���� ���� �����Ѵ�... 
 * �ݺ���( ~ ����, �����Ѵ�.)
 * - �����ؼ� ���� �� ����Ǵ� ��
 * - �� (�� ��) ���࿡ ���� ����  ��
 * - ������ ���� ���ϴ� �� , ������ �ʴ� ��
 * - ������ ��, �������� �ʴ� ��
 * 
 * @author user
 *
 */ 
public class ExStatement01 {	
	
	
	public static void main(String[] args) {
		// ���� �Ǵ�
		int week = 1;
		if(week == 0) {	
		}
		else if(week == 1) {	
		}
		// ����� : ���� 1���� ���� �ִ�. ���� , ���� ǥ���� �� ����.
		// �������� ã�� ���� ���� ��� �����Ѵ�.
		
		char cweek = ' ';
		switch( week ) {
		case 0: cweek='��';	break;
		case 1:	cweek='��';	break;
		case 2:	cweek='ȭ';	break;
		case 3:	cweek='��';	break;
		case 4:	cweek='��';	break;
		case 5:	cweek='��';	break;
		case 6:	cweek='��';	break;
		}
		System.out.println(cweek + "����");
	}
	
	public static void main03(String[] args) {
		// ���� ���� , ��� ����
		boolean isOpen = false; // ����
		boolean locked = false; // Ǯ��
		// NOT ~ �ƴϸ� 
		// ����
		if(!locked) { // ����� ���� ������ ���� ������. 
			if(!isOpen) {
				System.out.println("���� ���ȴ�.");
			}
		}
	}
	
	public static void main01(String[] args) {
		// �б⹮ : if
		if(true) {
			// ���϶�
		} else {
			// �����϶�
		}
		// ���ǵ��� ���� ���� 
		// - �����̸� ���� �������� ��������...
		int score = 40; // ������ ��� Ȯ���Ѵ�.
		if( score >= 90/*���ǽ�*/)// ������ ~ ��  ���� ����� boolean , && ���� �� ���� ����
		{   
			// ���ǽ��� ���� �� ���� �����   else if�� ���� ���ǽ��� �����϶� �ؿ��� ����ǰԲ� ������ ���ǽ��� ������ �Ѵ�. 
		} else if(score >= 80) { // 90���� �����鼭 80 �̻��ΰ�
			
		} else if(score >= 60) { // 90���� �����鼭 60 �̻��ΰ�
			
		} else if(score >= 40) { // 90���� �����鼭 40 �̻��ΰ�
			
		} else {
			// A,B,C,D ��� ������ �����϶� ����ȴ�. 
		}
	}
}
