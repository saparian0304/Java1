package StandardProcedureOfJava.ch5;

public class ch5_ArrayEx15 {
	// 문자열을 morse 부호로 변환하기
	public static void main(String[] args) {
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", "."
						,"..-.", "--.", "....", "..", ".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-", ".-.", "...", "-"
						, "..-", "...-", ".--", "-..-", "-.--"
						, "--.." };
		
		String result="";
		
		for (int i=0; i < source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
		}
		System.out.println("source:" + source);
		System.out.println("morse:" + result);

	}	// main의 끝
}
