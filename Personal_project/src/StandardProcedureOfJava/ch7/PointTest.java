package StandardProcedureOfJava.ch7;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Point1 {
	Point1() {}	//  자손클래스에서 기본생성자를 사용하려면 조상클래스에도 기본생성자가 있어야한다.
	int x, y;
	
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point1 {
	int z;
	
	Point3D(int x, int y, int z) {
//		super();			// 컴파일러가 자동으로 조상생성자를 컴파일시에 생성해준다.
//		this.x = x;
//		this.y = y;
//		super(x,y);			// 조상클래스에 있는것과 동일한 형태의 생성자가 있어야 한다.
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y + ", z:" + z;
	}
}