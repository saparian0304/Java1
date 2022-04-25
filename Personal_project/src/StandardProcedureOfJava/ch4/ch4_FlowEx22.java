package StandardProcedureOfJava.ch4;

public class ch4_FlowEx22 {
	// 향상된 for문
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		// 기존방식
		for(int i=0;i<arr.length;i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();
		
		// 새로운 방식 => 파이썬 반복문과 유사하다.
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum="+sum);
	}	// main의 끝
}


/*
 * for(타입 변수명 : 배열 또는 컬렉션) {반복할 문장}
 */