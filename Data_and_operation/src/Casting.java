
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // casting : double 형을 강제로 int로 바꿔줌, 0.1의 손실이 일어남
		System.out.println(e);
		
		int f = (int) 1.8;
		System.out.println(f); // 1
		
		// 1 to String
		String g = Integer.toString(1); // int를 String으로 변환해줌
		System.out.println(g); 
	}

}
