﻿package StandardProcedureOfJava.ch2;

public class ch2_CastingEx4 {

	public static void main(String[] args) {
		int		i 	= 91234567;		// 8자리의 10진수
		float	f 	= (float)i;		// int를 float로 형변환
		int		i2	= (int)f;

		double	 d	= (double)i;	// int를 double로 형변환
		int		i3 	= (int)d;		// double를 다시 int로 형변환
		
		float 	f2	= 1.666f;
		int		i4	= (int)f2;
		
		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n", f, i2);
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("(int)%f=%d\n", f2, i4);
	}

}
