package StandardProcedureOfJava.ch5;

import java.util.Arrays;

public class ch5_ArrayEx9 {
	// 임의의 값으로 배열 채우기
	public static void main(String[] args) {
		int[] code = {-4, -1, 3, 6, 11};	// 불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for (int i=0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));

	}	// main의 끝
}

// 후보군 숫자들을 이용하여 랜덤으로 배열의 자리를 채우기 