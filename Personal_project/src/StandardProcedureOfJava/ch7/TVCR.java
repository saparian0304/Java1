package StandardProcedureOfJava.ch7;

class Tv1 {
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널
	
	void power() 		{ power = !power; }
	void channelUp() 	{ ++channel;}
	void channelDown()	{ --channel;}
}

class VCR {
	boolean power;	// 전원상태(on/off)
	int counter = 0;
	
	void power() { power = !power;}
	void play() {/* 내용 생략*/}
	void stop() {/* 내용 생략*/}
	void rew() {/* 내용 생략*/}
	void ff() {/* 내용 생략*/}
}

// Tv 클래스를 상속받음
class TVCR extends Tv1 {
	/* VCR클래스의 객체 생성 및 VCR 메서드 선언으로 
	   VCR 클래스 요소 변경시에도 
	   수정없이 VCR 클래스의 메서드를 사용할 수 있다.
	 * */
	 VCR vcr = new VCR();	
	 
	 void play() {
		 vcr.play();
	 }
	 
	 void stop() {
		 vcr.stop();
	 }
	 
	 void rew() {
		 vcr.rew();
	 }
	 
	 void ff() {
		 vcr.ff();
	 }
}
