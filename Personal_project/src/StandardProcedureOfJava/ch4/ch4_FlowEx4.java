package StandardProcedureOfJava.ch4;

import java.util.Scanner;

public class ch4_FlowEx4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score>=90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} 
		System.out.println("당신의 학점은 "+grade+"입니다.");
	} // main의 끝

}
