package StandardProcedureOfJava.ch4;

public class ch4_FlowEx30 {
	
	// break문
	public static void main(String[] args) {
		int sum = 0;
		int i	= 0;
		
		while(true) {
			if(sum>100)
				break;		// 가장 가까운 반복문을 벗어난다.
			++i;
			sum += i;
		} // end of while
		
		System.out.println("i=" + i);
		System.out.println("sum="+sum);
	}	// main의 끝
}
