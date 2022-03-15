package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx31 {

	public static void main(String[] args) {
		int dec		= 1234;
		int hex		= 0xABCD;
		int mask	= 0xF;
		
		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
	}
}

// 16 진수에서 한자리씩 추출할 때 위와 같은 식을 이용할 수 있다.