package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx28 {
	// ��Ʈ������
	public static void main(String[] args) {
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));	// %X : 16����, %#X : ���λ簡 ���� 16����
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		
		// '|' : 'OR' ������
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x|y));
		
		// '&' : 'AND' ������
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x&y));
		
		// '^' : 'XOR' ������ (�� �������� ��Ʈ�� �ٸ����� 1�� �ȴ�.)
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x^y, toBinaryString(x^y));
		// �ٽ� �����ϸ� ������ ������ ���ƿ��� Ư¡�� �ִ�.
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x^y^y, toBinaryString(x^y^y));		// x
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, x, x^y^x, toBinaryString(x^y^x));		// y
	}

	// �Ʒ� �ż���� ���Ŀ� �����ϱ�� �Ѵ�
	// 10�� ������ 2������ ��ȯ�ϴ� �޼���
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
