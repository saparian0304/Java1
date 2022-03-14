package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx27 {

// 논리 부정 연산자 "!"
	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<=ch && ch<='z'));
		System.out.printf("  'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z');
	}

}

/*
연산 순서 : 피연산자와 가까운 것부터 연산이 된다.
!!b 
!!true
!false
true
*/