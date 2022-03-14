package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx29 {

	// ��Ʈ������ '~' : 0�� 1��, 1�� 0���� �ٲ۴�.
	public static void main(String[] args) {
		byte p = 10;
		byte n = -10;
		
		System.out.printf(" p  =%d \t%s%n",  p,   toBinaryString(p));
		// 1�� ���� ����
		System.out.printf("~p  =%d \t%s%n", ~p,   toBinaryString(~p));
		// ���������� ���� ������ �ٲٰ� ������
		System.out.printf("~p+1=%d \t%s%n", ~p+1, toBinaryString(~p+1));
		System.out.printf("~~p =%d \t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		
		// ���������� ���������� �ٲٰ� ������
		System.out.printf(" n  =%d%n", n);
		System.out.printf("~(n-1)=%d%n", ~(n-1));
		
	}	
	
	// 10�� ������ 2������ ��ȯ�ϴ� �޼���
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
	
}
