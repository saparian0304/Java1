package StandardProcedureOfJava.ch7;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;	// 컴파일은 되나 실행시 에러가 발생함
		// 조상타입의 인스턴스를 자손타입의 참조변수로 참조할 수 없다.
		fe.drive();
		car2 = fe;
		car2.drive();
		

	}

}
