package StandardProcedureOfJava.ch4;

import java.util.Scanner;

public class ch4_FlowEx27 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;	// while���� ���ǽ����� ����� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�)");
		
		while(flag) {	// flag�� ���� true�̹Ƿ� ���ǽ��� ���� �ȴ�.
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {	// num�� 0�� �ƴϸ�, sum�� ���Ѵ�.
				sum += num;
			} else {		// num�� 0�̸�, flag�� ���� false�� ����.
				flag = false;
			}
		} // while���� ��
		
		System.out.println("�հ� : "+sum);
	}	// main�� ��
}
