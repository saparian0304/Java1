package StandardProcedureOfJava.ch4;

import java.util.Scanner;

public class ch4_FlowEx4 {

	public static void main(String[] args) {
		int score = 0;		// 점수를 저장하기 위한 변수
		char grade = ' ';	// 학점을 저장하기 위한 변수. 공백으로 초기화한다.
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score>=90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
	} // main의 끝

}

// else는 없어도 된다. 없을 경우 if, else if의 조건을 만족하지 않을 경우, 수행문 실행없이 넘어간다. 