package StandardProcedureOfJava.ch5;

public class ch5_ArrayEx16 {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i=0; i< args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}	// main의 끝
}
