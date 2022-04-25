import java.util.Scanner;

public class pr_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.printf("정수 입력 : ");
//		int data_Int = sc.nextInt();
//		System.out.println("출력(int) : " + data_Int);
//
//		System.out.printf("실수 입력 : ");
//		double data_double = sc.nextDouble();
//		System.out.println("출력(double) : " + data_double);
		
		System.out.printf("문자 입력(Line) : ");
		String data_Strline = sc.nextLine();
		System.out.println("출력(Str) : " + data_Strline);
		
//		System.out.printf("문자 입력 : ");
//		String data_Str = sc.next();  // 띄어쓰기하면 이후문자는 출력이 안됨
//		System.out.println("출력(Str) : " + data_Str);
		
		
	}

}
