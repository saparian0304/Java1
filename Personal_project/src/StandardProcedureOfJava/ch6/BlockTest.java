package StandardProcedureOfJava.ch6;

class BlockTest {
	// 클래스 초기화 블럭
	static {
		System.out.println("static { }");
	}
	
	// 인스턴스 초기화 블럭
	{
		System.out.println("{   }");
	}
	
	// 생성자
	public BlockTest() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		
	}
}

/*
 클래스 초기화 블록 : 클래스가 메모리에 로드될때 딱 한번 수행된다.
 인스턴스 블록 : 인스턴스가 생성될때마다 수행된다.
 
 수행 순서 : 클래스블록 (처음에 한번) -> 인스턴스블록 -> 생성자
*/