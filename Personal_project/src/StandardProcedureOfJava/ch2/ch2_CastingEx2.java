package StandardProcedureOfJava.ch2;

public class ch2_CastingEx2 {

	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		System.out.println("i="+Integer.toBinaryString(i));
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		System.out.println("i="+Integer.toBinaryString(i)); // 10진정수를 2진수로 변환하는 매서드
		
	}

}
