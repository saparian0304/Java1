package StandardProcedureOfJava.ch4;

public class ch4_FlowEx22 {
	// ���� for��
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		// �������
		for(int i=0;i<arr.length;i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();
		
		// ���ο� ��� => ���̽� �ݺ����� �����ϴ�.
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum="+sum);
	}	// main�� ��
}


/*
 * for(Ÿ�� ������ : �迭 �Ǵ� �÷���) {�ݺ��� ����}
 */