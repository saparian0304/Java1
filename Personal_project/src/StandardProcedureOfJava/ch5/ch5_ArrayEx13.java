package StandardProcedureOfJava.ch5;

public class ch5_ArrayEx13 {
	// 16진수를 2진수로 변환하기
	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};	// 각 요소가 16진수 중 하나 0123456789ABCDEF
		String[] binary = {	"0000", "0001", "0010", "0011"
						,	"0100", "0101", "0110", "0111"
						,	"1000", "1001", "1010", "1011"
						,	"1100", "1101", "1110", "1111"};
		
		String result = "";
		
		for(int i=0; i<hex.length; i++) {
			if(hex[i]>='0' && hex[i]<='9') {
				result += binary[hex[i]-'0'];	// '8'- '0'의 결과는 8이다.
			} else {
				result += binary[hex[i]-'A'+10];	// 'C'-'A'의 결과는 2
			}
		}	// for의 끝
		
										// String(char[] value)
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:" + result);

	}	// main의 끝 
}


/* 
 *	result += binary[hex[0]-'A'+10];	// hex[0]은 'C'
 *	result += binary['C'-'A'+10];		// 'C' -'A' = 67 - 65 = 2
 *	result += binary[2+10];
 *	result += binary[12];
 *	result += "1100";
 */

