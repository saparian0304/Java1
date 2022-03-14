package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx26 {

// 효율적인 연산
	
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);
		
		// || : 좌측이 참이기때문에 우측 피연산자는 평가하지 않았다. -> b의 값은 그대로 남아있다.
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		
		// && : 좌측이 거짓이기때문에 우측 피연산자는 평가하지 않았다. -> b의 값은 그대로 남아있다.
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);

		// && : 좌측이 참이기떄문에 우측 피연산자도 평가가 되었다. ->  -> b의 값이 증가되었다.
		System.out.printf("++b!=0 && a==0 = %b%n", ++b!=0 && a==0 );
		System.out.printf("a=%d, b=%d%n", a, b);
	}

}
