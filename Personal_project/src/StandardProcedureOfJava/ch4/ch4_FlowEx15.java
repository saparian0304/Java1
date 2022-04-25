package StandardProcedureOfJava.ch4;

public class ch4_FlowEx15 {

	public static void main(String[] args) {
		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("----------------------------------------------------");
		
		for(int i=1;i<=10;i++) {
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
		}
	}	//main의 끝
}

/*
 	% 연산자 : 특정값들이 순환되면서 반복되는 특징이 있다
    / 연산자 : 같은 값이 연속적으로 반복되는 특징이 있다
 */
