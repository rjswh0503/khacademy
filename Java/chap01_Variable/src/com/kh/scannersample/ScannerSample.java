package com.kh.scannersample;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		/**
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��� �ּ���. : ");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("����� ���̴� " + age + " �Դϴ�.");
		
		
		String name;
		int phoneNumber; 
		System.out.print("����� �̸��� �Է��ϼ���. : ");
		name = sc.next();
		System.out.println("����� �̸���  " + name + " �Դϴ�.");
		System.out.print("����� ��ȭ��ȣ�� �Է��ϼ���. : ");
	    phoneNumber = sc.nextInt(); //-���� �ʱ�
	    System.out.println("����� ��ȭ��ȣ�� " + phoneNumber +  " �Դϴ�.");
	    
	    **/
	    
	    
	    
	    //�� ��̿� ���� �����ϴ� ���İ� �� �ּ� 1���� ����ϱ�
	    
	    Scanner sc = new Scanner(System.in);
	    
	
	   
	    System.out.print("����� ��̸� �Է��� �ּ��� : ");
	    String hobby  = sc.next();
	    System.out.println("����� ��̴� " + hobby + " �Դϴ�.");
	    System.out.print("����� �����ϴ� ������ �Է��� �ּ��� : ");
	    String food  = sc.next();
	    System.out.println("����� �����ϴ� ������ " + food + " �Դϴ�.");
	    System.out.println("����� �ּҸ� �Է��� �ּ���. : ");
	    String address  = sc.next();
	    System.out.println("����� �ּҴ� " + address + "�Դϴ�.");
	    
	    
	    
		
	}

}