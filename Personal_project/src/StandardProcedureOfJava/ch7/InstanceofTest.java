package StandardProcedureOfJava.ch7;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if (fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		
		if (fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		// 참조변수.getClass().getName() -> 참조변수가 가리키는 클래스의 이름을 String으로 반환
		System.out.println(fe.getClass().getName());	// 클래스의 이름을 출력
		
		
	}

}
