package com.kh.scannersample;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		/**
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요. : ");
		int age = sc.nextInt(); //정수만 받는 next
		System.out.println("당신의 나이는 " + age + " 입니다.");
		
		
		String name;
		int phoneNumber; 
		System.out.print("당신의 이름을 입력하세요. : ");
		name = sc.next();
		System.out.println("당신의 이름은  " + name + " 입니다.");
		System.out.print("당신의 전화번호를 입력하세요. : ");
	    phoneNumber = sc.nextInt(); //-넣지 않기
	    System.out.println("당신의 전화번호는 " + phoneNumber +  " 입니다.");
	    
	    **/
	    
	    
	    
	    //내 취미와 내가 좋아하는 음식과 내 주소 1개만 출력하기
	    
	    Scanner sc = new Scanner(System.in);
	    
	
	   
	    System.out.print("당신의 취미를 입력해 주세요 : ");
	    String hobby  = sc.next();
	    System.out.println("당신의 취미는 " + hobby + " 입니다.");
	    System.out.print("당신이 좋아하는 음식을 입력해 주세요 : ");
	    String food  = sc.next();
	    System.out.println("당신이 좋아하는 음식은 " + food + " 입니다.");
	    System.out.println("당신의 주소를 입력해 주세요. : ");
	    String address  = sc.next();
	    System.out.println("당신의 주소는 " + address + "입니다.");
	    
	    
	    
		
	}

}
