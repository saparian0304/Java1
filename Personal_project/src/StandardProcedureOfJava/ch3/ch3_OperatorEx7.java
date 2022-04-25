package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx7 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);
		// 300이 출력되어야하지만 byte 자료형(1 byte)는 표현할 수 없는 범위이기때문에 값의 손실이 일어난다

	}

}
