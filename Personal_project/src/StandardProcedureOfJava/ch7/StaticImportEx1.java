package StandardProcedureOfJava.ch7;

import static java.lang.System.out;		// System.out을 out만으로 참조 가능
import static java.lang.Math.*;			
import static java.lang.Math.random;	// Math.random()만

// static import문 예제
public class StaticImportEx1 {

	public static void main(String[] args) {
//		System.out.println(Math.random());
		out.println(random());
		
		out.println("Math.PI :" + PI);
	}

}
