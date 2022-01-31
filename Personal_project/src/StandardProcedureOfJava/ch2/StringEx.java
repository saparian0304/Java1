package StandardProcedureOfJava.ch2;

public class StringEx {

	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // 14
		System.out.println("" + 7 + 7); // 77 (덧셈 연산은 왼쪽부터 순서대로 진행되기때문임

	}

}
