﻿package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++) {		// 블럭 {} 안의 문장을 26번 반복한다.
			System.out.print(c++);		// 'a'부터 26개의 문자를 출력한다.
		}
		System.out.println();
		
		c = 'A';
		for(int i=0; i<26; i++) {		// 블럭 {} 안의 문장을 26번 반복한다.
			System.out.print(c++);		// 'A'부터 26개의 문자를 출력한다.
		}
		System.out.println();
		
		c = '0';
		for(int i=0; i<10; i++) {		// 블럭 {} 안의 문장을 26번 반복한다.
			System.out.print(c++);		// '0'부터 10개의 문자를 출력한다.
		}
		System.out.println();
	}

}
