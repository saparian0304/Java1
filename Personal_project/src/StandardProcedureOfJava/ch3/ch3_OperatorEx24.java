package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx24 {

	public static void main(String[] args) {
		int x = 0;
		char ch = ' ';
		
		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 =%b%n", x, 10 < x && x < 20);

		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 = %b%n", x, x%2==0||x%3==0&&x%6!=0);
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 = %b%n", x, (x%2==0||x%3==0)&&x%6!=0);
		
		ch='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0'<=ch&&ch<='9');
		
		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a'<=ch&&ch<='z');
		
		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' = %b%n", ch, 'A'<=ch&&ch<='Z');
		
		ch='q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' = %b%n", ch, ch=='q'||ch=='Q');
	}
}

// '&&' 연산자는 'and'연산자이다.
// '||' 연산자는 'or'연산자이다.
// '&&'연산자가 '||'에 비해 연산 우선순위를 가지기때문에 순서를 확실히하기위해 괄호를 사용하는 것이 좋다.
