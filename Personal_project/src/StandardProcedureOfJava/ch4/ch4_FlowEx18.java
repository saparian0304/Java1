﻿package StandardProcedureOfJava.ch4;

public class ch4_FlowEx18 {
	// 구구단 출력하기
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d%n", i, j, i*j);
			}
		}
	}	// main의 끝
}
