package StandardProcedureOfJava.ch7;

final class Singleton {
	
	private static Singleton s = new Singleton();
	
	// 외부클래스에서는 생성자를 통한 객체생성을 불가하게 함
	private Singleton() {
		//....
	}
	
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();

		return s;
	}
}

class SingletonTest {
	public static void main(String args[]) {
		
//		Singleton s = new Singleton();		// 외부클래스에서 객체를 생성할수 없다.
		Singleton s = Singleton.getInstance();
	}
}
