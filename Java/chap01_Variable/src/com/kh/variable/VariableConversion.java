package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		
		//1. �ڵ�����ȯ(�Ͻ�������ȯ, ����������ȯ)
		int intNum = 100;
		System.out.println(intNum);//���� 100�� �ǹ�
		long longNum = intNum;//int�� long���� �ڵ� ����ȯ
		System.out.println(longNum);
		
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float�� double�� �ڵ� ����ȯ
		
		
		System.out.println("--------------------");
		
		
		
		
		
		
		
		//int -> long �����ϴ� ����ȯ 2���� ����� ����ϱ�
		int intNum2 = 5400;
		System.out.println(intNum2);
		long longNum2 = intNum2;
		System.out.print("longNum2 : ");
		System.out.println(longNum2);
		
		
		int intNum3 = -400;
		System.out.println(intNum3);
		long longNum3 = intNum3;
		System.out.print("longNum3 :");
		System.out.println(longNum3);
		
		
		
		//short -> int �����ϴ� ����ȯ 1���� ����� ����ϱ�
		short shortNum = 300;
		System.out.println(shortNum);
		int intNum4 = shortNum;
		System.out.print("intNum4 : ");
		System.out.println(intNum4);
		
		
		
		
		//float -> double �����ϴ� ����ȯ 1���� ����� ����ϱ�
		
		float floatNum2 = 3.45f;
		System.out.println(floatNum2);
		double doubleNum2 = floatNum2;
		System.out.print("doubleNum2: ");
		System.out.println(doubleNum2);
		
		
		
		
		//2. ������ ����ȯ(���� ����ȯ)
		
		//long -> int 
		long largeLong = 123456789012345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.print("largeInt  : ");
		System.out.println(largeInt);// long�� int�� ���� ����ȯ �� ��� ���� �����ȿ� ���� ������ �Ϻ� �����ʹ� �սǵȴ�.
		
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.print("intPart   : ");
		System.out.println(intPart); // �Ǽ��� int�� ���� ����ȯ �� ��
		
		
		//���ڿ� ���ڰ��� ����ȯ 2�� ���
		
		// ���ڴ� char charBalue = 'Z'; - > int�� ����
		
		
		char charValue = 'Z';
		int intValue = charValue;
		System.out.print("intValue  : ");
		System.out.println(intValue);
		
		
		char charValue2 = 'A';
		int intValue2 = charValue2;
		System.out.print("intValue2 : ");
		System.out.println(intValue2);
		
		
		
		
		
		//double -> int�� ����ȯ ��� 1��
		 
		double largeDouble2 = 21543.54855;
		int largeInt3 = (int) largeDouble2;
		System.out.print("largeInt3 : ");
		System.out.println(largeInt3);
		
		
		
		//int -> short�� ����ȯ 1��
		
		int largeInt2 = 1000;
		short shortPart = (short) largeInt2;
		System.out.print("shortPart : ");
		System.out.println(shortPart);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}
	
	
	
	

}