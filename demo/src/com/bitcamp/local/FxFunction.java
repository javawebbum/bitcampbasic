package com.bitcamp.local;

/**
 * �Լ� ����?
 * 2. �Լ� ����
 * 1. �Լ� ȣ��
 * @author user
 *
 */
// ����(Ŭ����)���� ���� ������ �Ѵ�....  Ŭ�����ȿ� ��� ������ �θ��� �������=�ʵ�,����Լ�=�޼ҵ� �� �ִ�.
class Score {
	// �� �ȿ� ���� ����(��)
	int val; // Ŭ�����ȿ� ���� ������ �ʵ� = ������ 
}
public class FxFunction {
	public static void main(String[] args) {	
		Score score = new Score(); // ���ο� ������ ���� 
		edit03(score);
		System.out.println(score.val);
		// ������ �����Ѵ�...
	}
	private static void edit03(Score param) {
		param.val = 200; // ��ġ�� �˾Ƽ� �޸� ���� ���� ������ ���ص� ���� ����Ǿ� �ִ�. 
	}
	public static void main03(String[] args) {
		// �ٸ� �Լ������� �����Ѵ�. �⺻������ �Ұ��ϴ�.
		int num = 0;
//		edit01(num); // �����ǰ��� ���� �� �� 
		// ������ �� main �Լ��� �Ѵ�. ������ ���� �ٸ� �Լ��κ��� �޴´�.
		num = edit02(num); // main���� �Լ��κ���  ���� ��ȯ �޴´�. 
		System.out.println("main : " + num);	
	}
	private static int edit02(int num) { // ������ ���޹����� �ƴ϶� ���� �������̴�. 
		// TODO: �Ű������� edit02 �Լ��� ���� , ���� �ٸ� �Լ��� ������ �����ϴ� ���� �ƴϴ�.  
		num = num * 10 + 3;
		return num; // ��ȯ�Ѵ�.
	}
	public static void main01(String[] args) {
		// ������ �ϳ� ���޹޾Ƽ� ������ ��ȯ�ϴ� �Լ�
		int arg = 10;
		int rtValue;
		rtValue = �Լ���(arg); // ȣ��	
	}
	private static int �Լ���(int param) { // Ʋ   param = arg  ȣ��Ǵ°��� ���ԵǼ� ���´�. (����)
		return param*10; // ������ ����Ǹ� �Լ��� ����ȴ�. ����� ������� ��ȯ�Ѵ�. 
	}
}
