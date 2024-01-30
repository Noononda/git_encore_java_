package com.encore.operator;

import java.util.Scanner;

public class OperatorDemo {

	public OperatorDemo() {	
	}
	
	// example 01 반환값 x, 매개변수 x
	public void example01() {
		System.out.println(">>>> 산술연산");
		int x = 100, y = 100, result = 0 ;
		System.out.println(" + " + (x + y));
		System.out.println(" - " + (x - y));
		System.out.println(" * " + (x * y));
		System.out.println(" / " + (x / y));
		System.out.println(" % " + (x % y));
	}
	
	public String example02(String color01, String color02) {
		System.out.println(">>>> 연결연산");
		return "신호등의 색깔은 " + color01 + " 과 " + color02 + " 입니다.";
	}
	
	public void example03() {
		System.out.println(">>>> 논리연산");
		boolean isFlag = false;
		System.out.println("논리 부정, " + !isFlag);
		
		// Scanner로부터 입력받은 숫자가 짝수인지 아닌지를 판단해보고싶다면?
	
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		System.out.println("Result >>>> 짝수" + (!(!(number % 2 == 0))) );
		System.out.println("Result >>>> 홀수" + (number % 2 != 0) );
		
		// Scanner로부터 입력받은 숫자가 3의배수인지 아닌지를 판단하고 싶으면?
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int three = scan.nextInt();
		System.out.println("Result >>>> 3의배수" + (three % 3 == 0));
		System.out.println("Result >>>> 3의배수아님" + (three % 3 != 0));
		
		// Scanner로부터 입력받은 숫자가 양수인지 아닌지를 판단하고 싶다면?
		System.out.println("Result >>>> 양수" + (three > 0));
		System.out.println("Result >>>> 음수" + (three <= 0));
	}
	
		public void example04() {
			System.out.println(">>>> 증감연산 , ++ , --");
			int age = 50 ; 
			System.out.println("현재나이는 = " + age);
			System.out.println(++age);
			System.out.println("현재나이는 = " + age);
			System.out.println(age++);
			System.out.println("현재나이는 = " + age);
			
			System.out.println();
			int number = 20;
			int result = number ++ * 3 ;
			System.out.println("Result >>>> "+ result);
			
		}
		
		public void example05() {
			System.out.println(">>>> 일반논리연산");
			/*
			 * &(이면서, 이고), |(이거나), [( &&, ||) - short shortcut]
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 : ");
			int number = scan.nextInt();
			
			// Scanner로부터 입력받은 숫자가 1 ~ 100 사이값인지 판단하고 싶다면?
			System.out.println("1 ~ 100 " + (number >= 1 && number <= 100));
		}
		public void example06() {
			System.out.println(">>>> 일반논리연산");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("문자를 입력하세요 : ");
			char str = scan.next().charAt(0);
			// Scanner로부터 입력받은 숫자가 A ~ Z 사이값인지 판단하고 싶다면?
			System.out.println("input char , " + (str));
			System.out.println("A ~ Z" + (str >= 'A' && str <= 'Z'));
		}
		public void example07() {
			System.out.println(">>>> 삼항연산");
			// (조건식) ? 참일 경우 : 거짓일 경우
			// (조건식) ? 참일 경우 : (조건식) ? 참일 경우 : 거짓일 경우
			// (조건식) ? 참일 경우 : (조건식) ? 참일 경우 : (조건식) ? 참일 경우 : 거짓일 경
			
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 : ");
			int number = scan.nextInt();
			
			// scanner로부터 입력받은 숫자가 양수인지 음수인지 아니면 0인지 판단하고 싶다면?
			String result = (number>0) ? "양수" : (number == 0) ? "0" : "음수";	
			System.out.println("Result >>>> " + (result));
		}
}
	

