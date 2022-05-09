package StandardProcedureOfJava.ch6;

class StaticBlockTest {

	static int[] arr = new int[10];
	// 초기화 블록 : 복잡한 초기화 작업을 수행하기에 적합하다
	static {
		for (int i=0; i< arr.length; i++) {
			// 1과 10 사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] =(int)(Math.random() * 10) +1;
		}
	}
	
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		// 클래스 초기화 블록은 한번만 수행된다.
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
	}

}
