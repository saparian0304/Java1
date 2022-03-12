package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx21 {

	public static void main(String[] args) {
		System.out.printf("10 == 10.0f	\t %b%n", 10 == 10.0f);
		System.out.printf("'0'== 0		\t %b%n", '0'== 0);
		System.out.printf("'A'== 65	\t %b%n", 'A'== 65);
		System.out.printf("'A' > 'B'	\t %b%n", 'A' > 'B');
		System.out.printf("'A'+1 != 'B'	\t %b%n", 'A'+1 != 'B');
		}
}
/*
System.out.printf("10 == 10.0f	\t %b%n", 10 == 10.0f);		// true, 자료형의 범위가 큰쪽으로 형변환을 해서 연산한다
System.out.printf("'0'== 0		\t %b%n", '0'== 0);			// false, 48 == 0;
System.out.printf("'A'== 65	\t %b%n", 'A'== 65);			// true, 65 == 65;
System.out.printf("'A' > 'B'	\t %b%n", 'A' > 'B');		// false, 65 > 66;
System.out.printf("'A'+1 != 'B'	\t %b%n", 'A'+1 != 'B');	// false, 66 != 66;

*/