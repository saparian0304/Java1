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
 result1의 경우
 1000000 * 1000000 / 1000000
=-727379968 / 1000000			// 자료형이 int이기 때문에 오버플로우가 발생한 채로 계산한다!!
=-727

 */