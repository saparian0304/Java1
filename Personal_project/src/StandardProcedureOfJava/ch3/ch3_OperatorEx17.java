package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx17 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
	}
}

/*
 Math.round(pi*1000) / 1000.0;
 Math.round(3141.592*1000) / 1000.0;		// 반올림이 일어남
 3142 / 1000.0l;
 3.142;
 */