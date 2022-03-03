package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		
	//	char c2 = c1+1;		// 컴파일 에러 발생! (피연산자에 변수가 들어가 있음)
		char c2 = 'a'+1;	// 컴파일 에러 없음 (리터럴과 상수간의 연산이기때문)
		
		System.out.println(c2);

	}

}
