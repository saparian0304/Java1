package StandardProcedureOfJava.ch4;

public class ch4_FlowEx24 {
	// 카운트 다운
	public static void main(String[] args) {
		int i=11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(long j=0;j<1_000_000_000_000_000_000L;j++) {
				;
			}
		}
		System.out.println("GAME OVER");
	}	// main의 끝
}

// for문의 조건식 => int 타입
//  			카운트다운이 너무 빨라짐 -> int타입 최대숫자여도 불가능
//				long이나 double형으로 바꿔서 카운트다운함

