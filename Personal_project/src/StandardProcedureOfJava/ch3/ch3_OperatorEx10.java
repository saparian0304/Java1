package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
	}

}

/*
 result1�� ���
 1000000 * 1000000 / 1000000
=-727379968 / 1000000			// �ڷ����� int�̱� ������ �����÷ο찡 �߻��� ä�� ����Ѵ�!!
=-727

 */