package StandardProcedureOfJava.ch4;

public class ch4_FlowEx33 {
	// �̸� ���� �ݺ���
	public static void main(String[] args) {

		// for���� Loop1�̶�� �̸��� ����.
		Loop1 : for(int i=2;i<=9;i++) {
			for(int j=1; j<=9;j++) {
				if(j==5)
					break Loop1;
//					break;
//					continue Loop1;
//					continue;
				System.out.println(i+"*"+j+"="+i*j);
			}	// end of for j
			System.out.println();
		}	// end of Loop1
	} // main�� ��
}