package StandardProcedureOfJava.ch4;

public class ch4_FlowEx30 {
	
	// break��
	public static void main(String[] args) {
		int sum = 0;
		int i	= 0;
		
		while(true) {
			if(sum>100)
				break;		// ���� ����� �ݺ����� �����.
			++i;
			sum += i;
		} // end of while
		
		System.out.println("i=" + i);
		System.out.println("sum="+sum);
	}	// main�� ��
}
