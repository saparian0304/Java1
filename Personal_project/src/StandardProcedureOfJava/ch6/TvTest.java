package StandardProcedureOfJava.ch6;

class Tv {
	// Tv의 속성 (멤버변수)
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능 (메서드)
	void power() { power = !power; }
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}

class TvTest {
	public static void main(String args[]) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		t.color = "green";
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		System.out.println("Tv의 색상은 " + t.color + " 입니다.");
	}

}
