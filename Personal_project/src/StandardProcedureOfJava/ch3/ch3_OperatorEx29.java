package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx29 {

	// 비트연산자 '~' : 0은 1로, 1은 0으로 바꾼다.
	public static void main(String[] args) {
		byte p = 10;
		byte n = -10;
		
		System.out.printf(" p  =%d \t%s%n",  p,   toBinaryString(p));
		// 1의 보수 관계
		System.out.printf("~p  =%d \t%s%n", ~p,   toBinaryString(~p));
		// 양의정수를 음의 정수로 바꾸고 싶을때
		System.out.printf("~p+1=%d \t%s%n", ~p+1, toBinaryString(~p+1));
		System.out.printf("~~p =%d \t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		
		// 음의정수를 양의정수로 바꾸고 싶을때
		System.out.printf(" n  =%d%n", n);
		System.out.printf("~(n-1)=%d%n", ~(n-1));
		
	}	
	
	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
	
}
