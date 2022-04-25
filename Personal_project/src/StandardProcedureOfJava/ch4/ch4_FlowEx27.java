﻿package StandardProcedureOfJava.ch4;

import java.util.Scanner;

public class ch4_FlowEx27 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;	// while문의 조건식으로 사용할 변수
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
		
		while(flag) {	// flag의 값이 true이므로 조건식은 참이 된다.
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {	// num이 0이 아니면, sum에 더한다.
				sum += num;
			} else {		// num이 0이면, flag의 값을 false로 변경.
				flag = false;
			}
		} // while문의 끝
		
		System.out.println("합계 : "+sum);
	}	// main의 끝
}
