package StandardProcedureOfJava.ch4;

public class ch4_FlowEx24 {
	// ī��Ʈ �ٿ�
	public static void main(String[] args) {
		int i=11;
		
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(long j=0;j<1_000_000_000_000_000_000L;j++) {
				;
			}
		}
		System.out.println("GAME OVER");
	}	// main�� ��
}

// for���� ���ǽ� => int Ÿ��
//  			ī��Ʈ�ٿ��� �ʹ� ������ -> intŸ�� �ִ���ڿ��� �Ұ���
//				long�̳� double������ �ٲ㼭 ī��Ʈ�ٿ���

