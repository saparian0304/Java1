package StandardProcedureOfJava.ch4;

import java.util.Scanner;

public class ch4_FlowEx4 {

	public static void main(String[] args) {
		int score = 0;		// ������ �����ϱ� ���� ����
		char grade = ' ';	// ������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.
		
		System.out.print("������ �Է��ϼ���.>");
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
		System.out.println("����� ������ "+grade+"�Դϴ�.");
	} // main�� ��

}

// else�� ��� �ȴ�. ���� ��� if, else if�� ������ �������� ���� ���, ���๮ ������� �Ѿ��. 