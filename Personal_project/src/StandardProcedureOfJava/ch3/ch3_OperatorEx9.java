package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx9 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000l;
		
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}

// b는 int * long 으로 인해 자연스레 형변환이 선행된 연산이 이루어진다. 