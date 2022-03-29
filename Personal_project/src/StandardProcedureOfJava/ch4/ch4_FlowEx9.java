package StandardProcedureOfJava.ch4;

import java.util.Scanner;

public class ch4_FlowEx9 {

	public static void main(String[] args) {
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();		// 화면을 통해 입력받은 숫자를 score에 저장
		
		switch(score) {
			case 100: case 99: case 98: case 97: case 96:
			case 95:  case 94: case 93: case 92: case 91: case 90:
				grade = 'A';
				break;
			case 89: case 88: case 87: case 86: case 85:
			case 84: case 83: case 82: case 81: case 80:
				grade = 'B';
				break;
			case 79: case 78: case 77: case 76: case 75:
			case 74: case 73: case 72: case 71: case 70:
				grade = 'C';
				break;
			default:
				grade = 'F';
		}	// end of switch
		
		System.out.println("당신의 학점은 " + grade + "입니다.");

	} // main의 끝
}

// switch의 경우 하나의 조건식만 계산하면 되기때문에 속도가 if문에 비해 빠르지만 case문이 많아 보기 않좋은 코드가 되었다.
// 이러한 예제를 쓸때 빠른 속도가 필요한 경우엔 switch를 써야하지만, 그런 경우가 아니라면 if문이 적합하다.
