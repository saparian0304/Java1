package StandardProcedureOfJava.ch6;

class Tv {
	// Tv? ???(硫ㅻ?蹂?)
	String color;
	boolean power;
	int channel;
	
	// Tv? 湲곕?(硫??)
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
		System.out.println("???梨?? " + t.channel + " ????");
		System.out.println("Tv? ??? " + t.color + " ????");
	}

}
