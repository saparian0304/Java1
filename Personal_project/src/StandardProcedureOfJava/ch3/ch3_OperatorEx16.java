package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx16 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int) (pi*1000) / 1000f;
		System.out.println(shortPi);
	}
}

/*
 (int)(pi*1000) / 1000f;
 (int)(3141.592f) / 1000f;
 3141 / 1000f;		// 반올림이 아닌 버림이 일어난다.
 3.141f
 
 반올림을 하기위해선 0.5를 더해주거나 Math.round()매소드를 이용한다.
 */
