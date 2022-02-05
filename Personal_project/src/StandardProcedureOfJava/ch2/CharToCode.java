package StandardProcedureOfJava.ch2;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65, ���ڸ� �����ڵ� ���·� ����. (���������� ����Ÿ���� char)
		int code = (int)ch; // ch�� ����� ���� int Ÿ������ ��ȯ�Ͽ� ����
		
		System.out.printf("%c = %d (%#X) %n", ch, code, code); // %c : char, %d : ����, %X�� 16����(#�� ������ ���λ� '0x'�� ����), %n : �ٹٲ�
		
		char hch = '��'; // char hch = 0xAC00
		System.out.printf("%c = %d (%#X) %n", hch, (int)hch, (int)hch);
		// %X (�빮��) : ��µ� �빮�ڷ� ���, %x (�ҹ���) : ��µ� �ҹ��ڷ� ���

	}

}
