package StandardProcedureOfJava.ch2;

public class ch2_SpecialCharEx {

	public static void main(String[] args) {
		System.out.println('\''); 				// '''로는 표현할 수 없다.
		System.out.println("abc\t123\b456");	// \b에 의해 3이 지워진다. (이클립스에서는 안된다)
		System.out.println('\n');				// 개행문자 \n
		System.out.println("\"Hello\"");		// 큰 따옴표를 출력하기 위함
		System.out.println("c:\\");				// 역슬래쉬를 표현하기 위함
	}
}
