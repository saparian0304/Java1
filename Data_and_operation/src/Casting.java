
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1; // casting : double ���� ������ int�� �ٲ���, 0.1�� �ս��� �Ͼ
		System.out.println(e);
		
		int f = (int) 1.8;
		System.out.println(f); // 1
		
		// 1 to String
		String g = Integer.toString(1); // int�� String���� ��ȯ����
		System.out.println(g); 
	}

}
