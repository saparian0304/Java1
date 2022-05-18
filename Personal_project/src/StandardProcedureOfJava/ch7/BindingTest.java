package StandardProcedureOfJava.ch7;

public class BindingTest {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		System.out.println("p.x = " + p.x);	// Child1 객체를 가리키고 있지만 참조변수 타입의 인스턴스변수를 출력한다.
		
		p.x = 300;
		System.out.println("p.x값을 300으로 입력 후 p.x = "+p.x);
		
		Child1 c1 = (Child1)p;
		System.out.println("p를 자손으로 변환한 후 c1.x = "+c1.x);
		
		p.method();							// 참조변수의 타입과 상관없이 생성된 객체의 인스턴스메서드를 실행한다.
		
		System.out.println("c.x = " + c.x);
		c.method();
		
	}
}

class Parent1 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child1 extends Parent1 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}