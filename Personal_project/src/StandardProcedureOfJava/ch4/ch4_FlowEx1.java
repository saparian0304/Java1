package StandardProcedureOfJava.ch4;

public class ch4_FlowEx1 {

	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d �� ��, ���� ���� %n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d�� ��, ���� ���� %n", x);
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");

	}
}

// if (���ǽ�) {} : ���ǽ��� ����� �׻� true �ƴϸ� false���� �Ѵ�.
// ���ǽ��� true�̸� {} ���� ������� �����϶�
// ���ǽ��� false�̸� {} ���� ������ �ǳʶپ�����.