package com.bitcamp.local;

/**
 * �Լ� ����?
 * 2. �Լ� ����
 * 1. �Լ� ȣ��
 * 
 * @author user
 *
 */
public class FxFunction {
	public static void main(String[] args) {
		// ������ �ϳ� ���޹޾Ƽ� ������ ��ȯ�ϴ� �Լ�
		int arg = 10;
		int rtValue;
		rtValue = �Լ���(arg); // ȣ��	
	}
	private static int �Լ���(int param) { // Ʋ   param = arg  ȣ��Ǵ°��� ���ԵǼ� ���´�. (����)
		return param*10; // ������ ����Ǹ� �Լ��� ����ȴ�. ����� ������� ��ȯ�Ѵ�. 
	}
}
