package StandardProcedureOfJava.ch7;

public class TimeTest {
	public static void main(String[] args) {
		
		Time t = new Time(12, 35, 30);
		System.out.println(t);
//		t.hour = 13;		// hour의 접근제어자가 private이므로 다른 클래스는 사용이 불가능하다.
//		System.out.println(t.hour);
		t.setHour(t.getHour() +1);	// 메서드를 통해서만 private변수에 접근이 가능하다
		System.out.println(t);
		
	}
}

class Time {
	private int hour, minute, second;
	
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {	return hour; }
	public void setHour(int hour) {	
		if (hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getMinute() {	return minute; }
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	public int getSecond() {	return second; }
	public void setSecond(int second) {
		if (second <0 || second>59) return;
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}