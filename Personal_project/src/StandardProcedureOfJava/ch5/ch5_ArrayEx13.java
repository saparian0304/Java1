package StandardProcedureOfJava.ch5;

public class ch5_ArrayEx13 {
	// 16������ 2������ ��ȯ�ϱ�
	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};	// �� ��Ұ� 16���� �� �ϳ� 0123456789ABCDEF
		String[] binary = {	"0000", "0001", "0010", "0011"
						,	"0100", "0101", "0110", "0111"
						,	"1000", "1001", "1010", "1011"
						,	"1100", "1101", "1110", "1111"};
		
		String result = "";
		
		for(int i=0; i<hex.length; i++) {
			if(hex[i]>='0' && hex[i]<='9') {
				result += binary[hex[i]-'0'];	// '8'- '0'�� ����� 8�̴�.
			} else {
				result += binary[hex[i]-'A'+10];	// 'C'-'A'�� ����� 2
			}
		}	// for�� ��
		
										// String(char[] value)
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:" + result);

	}	// main�� �� 
}


/* 
 *	result += binary[hex[0]-'A'+10];	// hex[0]�� 'C'
 *	result += binary['C'-'A'+10];		// 'C' -'A' = 67 - 65 = 2
 *	result += binary[2+10];
 *	result += binary[12];
 *	result += "1100";
 */

