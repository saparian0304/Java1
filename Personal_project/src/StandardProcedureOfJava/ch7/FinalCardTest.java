package StandardProcedureOfJava.ch7;

class Card1 {
	final int NUMBER;	// 상수이지만 인스턴스변수의 경우 생성자에서 초기화되도록 할 수 있다.
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	
	Card1(String kind, int num){
		KIND = kind;	// 인스턴스변수의 경우 생성자에서 초기화되도록 할 수 있다.
		NUMBER = num;	// 매개변수로 넘겨받은 값으로 초기화한다.
	}
	
	Card1() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		Card1 c = new Card1("HERAT", 10);
//		c.NUMBER = 5;	// 이미 초기화된 상수이기때문에 다시 초기화할 수 없음
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}
