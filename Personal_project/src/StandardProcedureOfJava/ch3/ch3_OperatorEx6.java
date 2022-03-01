package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx6 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b); 		// JVM은 4byte(int)단위로 변환하여 계산하기 때문에 명시적인 형변환을 해줘야한다. (byte)(a+b);
		System.out.println(c);

	}

}
