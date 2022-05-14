package StandardProcedureOfJava.ch7;

class SuperTest {
	public static void main (String args[]) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	
	void method() {
		int x = 30;
		System.out.println("x=" + x);				// 메서드내 지역 변수
		System.out.println("this.x=" + this.x);		// 자손클래스의 인스턴스변수
		System.out.println("super.x=" + super.x);	// 조상클래스의 인스턴스변수
	}
}