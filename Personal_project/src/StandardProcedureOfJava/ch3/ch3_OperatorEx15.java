package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx15 {

	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		System.out.println(upperCase);
	}
}
// 대문자와 소문자의 코드값의 차이는 32이다.
// char형과 int형의 연산결과는 int형이므로다시 형변환을 해줘야한다.
