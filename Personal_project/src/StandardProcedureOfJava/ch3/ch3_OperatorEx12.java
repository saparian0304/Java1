package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx12 {

	public static void main(String[] args) {
		char c1 = 'a';			// c1 = 97
		char c2 = c1;			// c2 = 97
		char c3 = ' ';			// c3를 공백으로 초기화 한다.
		
		int i = c1 + 1;			// 'a' + 1 -> 97 + 1 -> 98
		
		c3 = (char)(c1 + 1);	// (char)('a'+1) -> (char)(98)
		c2++;
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}
}
