package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		
		//1. 자동형변환(암시적형변환, 묵시적형변환)
		int intNum = 100;
		System.out.println(intNum);//숫자 100을 의미
		long longNum = intNum;//int를 long으로 자동 형변환
		System.out.println(longNum);
		
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float을 double로 자동 형변환
		
		
		System.out.println("--------------------");
		
		
		
		
		
		
		
		//int -> long 변경하는 형변환 2가지 만들고 출력하기
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
		
		
		
		//short -> int 변경하는 형변환 1가지 만들고 출력하기
		short shortNum = 300;
		System.out.println(shortNum);
		int intNum4 = shortNum;
		System.out.print("intNum4 : ");
		System.out.println(intNum4);
		
		
		
		
		//float -> double 변경하는 형변환 1가지 만들고 출력하기
		
		float floatNum2 = 3.45f;
		System.out.println(floatNum2);
		double doubleNum2 = floatNum2;
		System.out.print("doubleNum2: ");
		System.out.println(doubleNum2);
		
		
		
		
		//2. 명시적 형변환(강제 형변환)
		
		//long -> int 
		long largeLong = 123456789012345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.print("largeInt  : ");
		System.out.println(largeInt);// long을 int로 강제 형변환 할 경우 값이 범위안에 있지 않으면 일부 데이터는 손실된다.
		
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.print("intPart   : ");
		System.out.println(intPart); // 실수를 int로 강제 형변환 할 때
		
		
		//문자와 숫자간의 형변환 2개 출력
		
		// 문자는 char charBalue = 'Z'; - > int로 변경
		
		
		char charValue = 'Z';
		int intValue = charValue;
		System.out.print("intValue  : ");
		System.out.println(intValue);
		
		
		char charValue2 = 'A';
		int intValue2 = charValue2;
		System.out.print("intValue2 : ");
		System.out.println(intValue2);
		
		
		
		
		
		//double -> int로 형변환 출력 1개
		 
		double largeDouble2 = 21543.54855;
		int largeInt3 = (int) largeDouble2;
		System.out.print("largeInt3 : ");
		System.out.println(largeInt3);
		
		
		
		//int -> short로 형변환 1개
		
		int largeInt2 = 1000;
		short shortPart = (short) largeInt2;
		System.out.print("shortPart : ");
		System.out.println(shortPart);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}
	
	
	
	

}
