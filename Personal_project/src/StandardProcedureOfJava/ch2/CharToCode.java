package StandardProcedureOfJava.ch2;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65, 문자를 유니코드 형태로 저장. (정수이지만 문자타입은 char)
		int code = (int)ch; // ch에 저장된 값을 int 타입으로 변환하여 저장
		
		System.out.printf("%c = %d (%#X) %n", ch, code, code); // %c : char, %d : 정수, %X는 16진수(#이 있으면 접두사 '0x'가 나옴), %n : 줄바꿈
		
		char hch = '가'; // char hch = 0xAC00
		System.out.printf("%c = %d (%#X) %n", hch, (int)hch, (int)hch);
		// %X (대문자) : 출력도 대문자로 출력, %x (소문자) : 출력도 소문자로 출력

	}

}
