package StandardProcedureOfJava.ch3;

public class ch3_OperatorEx16 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int) (pi*1000) / 1000f;
		System.out.println(shortPi);
	}
}

/*
 (int)(pi*1000) / 1000f;
 (int)(3141.592f) / 1000f;
 3141 / 1000f;		// �ݿø��� �ƴ� ������ �Ͼ��.
 3.141f
 
 �ݿø��� �ϱ����ؼ� 0.5�� �����ְų� Math.round()�żҵ带 �̿��Ѵ�.
 */
