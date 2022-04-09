package StandardProcedureOfJava.ch4;

public class ch4_FlowEx31 {
	// continue문
	public static void main(String[] args) {
		for(int i=0;i <= 10; i++) {
			if (i%3==0)
				continue;
			System.out.println(i);
		}
	}	//main의 끝
}

// 반복문을 벗어나는 break문과는 달리 continue문은 반복문을 벗어나지 않는다.
