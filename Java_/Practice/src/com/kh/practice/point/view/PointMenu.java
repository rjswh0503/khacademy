package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		System.out.println("====메뉴====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호: " );
		int num = sc.nextInt();
		
		if(num == 1) {
			circleMenu();
		}else if(num == 2) {
			rectangleMenu();
			
		}else {
			System.out.println("종료합니다.");
		}
		
	}
	
	public void circleMenu() {
		System.out.println("====원 메뉴====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num1 = sc.nextInt();
		if(num1 == 1) {
			calcCircum();
		}else if(num1 == 2) {
			CirArea();
			
		}else if(num1 == 9) {
			mainMenu();
				
		}
		System.out.println("메인으로 돌아갑니다.");

		
	}
	
	public void rectangleMenu() {
		System.out.println("====사각형 메뉴====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int num2 = sc.nextInt();
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		
		
	}
	public void CirArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
		
	}
	

}
