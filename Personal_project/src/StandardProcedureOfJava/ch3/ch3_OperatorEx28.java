package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx28 {
	// 비트연산자
	public static void main(String[] args) {
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));	// %X : 16진수, %#X : 접두사가 붙은 16진수
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		
		// '|' : 'OR' 연산자
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x|y));
		
		// '&' : 'AND' 연산자
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x&y));
		
		// '^' : 'XOR' 연산자 (두 연산자의 비트가 다를때만 1이 된다.)
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x^y, toBinaryString(x^y));
		// 다시 연산하면 원래의 값으로 돌아오는 특징이 있다.
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x^y^y, toBinaryString(x^y^y));		// x
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, x, x^y^x, toBinaryString(x^y^x));		// y
	}

	// 아래 매서드는 추후에 이해하기로 한다
	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
