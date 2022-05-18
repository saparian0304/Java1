package StandardProcedureOfJava.ch7;

public class CastingTest1 {
	// 상속관계에서의 참조변수 형변환
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;		// car = (Car)fe; 에서 형변환이 생략된 형태임
//		car.water();	// car 타입의 참조변수로는 FireEngine인스턴스내 water() 메서드를 호출할 수 없다. 
		fe2 = (FireEngine)car;	// 자손타입 <- 조상타입
		fe2.water();		
		fe.water();
	}

}


class Car {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("drive, brrrr~");
	}
	
	void stop() { 	// 멈추는 기능
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("Water!!!");
	}
}