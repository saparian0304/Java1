package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx26 {

// ȿ������ ����
	
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);
		
		// || : ������ ���̱⶧���� ���� �ǿ����ڴ� ������ �ʾҴ�. -> b�� ���� �״�� �����ִ�.
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		
		// && : ������ �����̱⶧���� ���� �ǿ����ڴ� ������ �ʾҴ�. -> b�� ���� �״�� �����ִ�.
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);

		// && : ������ ���̱⋚���� ���� �ǿ����ڵ� �򰡰� �Ǿ���. ->  -> b�� ���� �����Ǿ���.
		System.out.printf("++b!=0 && a==0 = %b%n", ++b!=0 && a==0 );
		System.out.printf("a=%d, b=%d%n", a, b);
	}

}
